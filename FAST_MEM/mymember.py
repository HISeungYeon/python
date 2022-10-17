from fastapi import FastAPI, Request, Form
from fastapi.responses import HTMLResponse
from fastapi.staticfiles import StaticFiles
from fastapi.templating import Jinja2Templates
from starlette.responses import JSONResponse
from pydantic.main import BaseModel
from member_dao import MemberDao

app = FastAPI()

class Member(BaseModel):
    m_seq: str
    m_name: str = None
    tel: str = None
    army_yn: str = None
 
app.mount("/static", StaticFiles(directory="static"), name="static")
templates = Jinja2Templates(directory="templates")


@app.get("/member", response_class=HTMLResponse)
async def member_list(request: Request):
    return templates.TemplateResponse("member.html", {"request": request})

@app.get("/member_selects")
async def member_selects():
    md = MemberDao()
    members = md.selects()
    return JSONResponse(members)

@app.post("/member_select")
async def member_select(member:Member):
    # print(emp.e_id)
    md = MemberDao()
    member = md.select(member.m_seq)
    return JSONResponse(member)

@app.post("/member_insert")
async def member_insert(member:Member):
    # print(emp.e_id)
    md = MemberDao()
    cnt = md.insert(member.m_name, member.tel, member.army_yn)
    return JSONResponse(cnt)

@app.post("/member_update")
async def member_update(member:Member):
    # print(emp.e_id)
    md = MemberDao()
    cnt = md.update(member.m_seq, member.m_name, member.tel, member.army_yn)
    return JSONResponse(cnt)

@app.post("/member_delete")
async def member_delete(member:Member):
    # print(emp.e_id)
    md = MemberDao()
    cnt = md.delete(member.m_seq)
    return JSONResponse(cnt)
    

# uvicorn mymember:app --reload