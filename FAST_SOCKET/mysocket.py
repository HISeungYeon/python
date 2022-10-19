from typing import List
from fastapi import FastAPI, WebSocket, WebSocketDisconnect, Request
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles
from fastapi.templating import Jinja2Templates

app = FastAPI()

app.mount("/static", StaticFiles(directory="static"), name="static")
templates = Jinja2Templates(directory="templates")


class ConnectionManager:
    def __init__(self):
        self.active_connections: List[WebSocket] = []

    async def connect(self, websocket: WebSocket):
        await websocket.accept()
        self.active_connections.append(websocket)

    def disconnect(self, websocket: WebSocket):
        self.active_connections.remove(websocket)

    async def send_personal_message(self, message: str, websocket: WebSocket):
        await websocket.send_text(message)

    async def broadcast(self, message: str):
        for connection in self.active_connections:
            await connection.send_text(message)


manager = ConnectionManager()


@app.get("/")
async def socket(request: Request):
    return templates.TemplateResponse("socket.html", {"request":request})


@app.get("/card")
async def card(request: Request):
    return templates.TemplateResponse("card.html", {"request":request})


@app.websocket("/ws/{client_id}")
async def websocket_endpoint(websocket: WebSocket, client_id: int):
    await manager.connect(websocket)
    try:
        while True:
            data = await websocket.receive_text()
            print("data", data)
#            await manager.send_personal_message(f"You wrote: {data}", websocket)
            await manager.broadcast(f"{data}") 
            # 접속한 사람에게 모두 보낸다! broadcast!
    except WebSocketDisconnect:
        print("error")
        manager.disconnect(websocket)
        await manager.broadcast(f"error")
        
 
        
# uvicorn mysocket:app --reload --host=192.168.142.18