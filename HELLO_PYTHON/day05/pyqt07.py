import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random

form_class = uic.loadUiType("pyqt07.ui")[0]


class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.myclick)
        self.leMine.returnPressed.connect(self.myclick)
        
        
    def myclick(self):
        # print("버튼이 클릭되었습니다.")
        mine = self.leMine.text()
        com = ""
        # print(mine)
        rnd = random()
        result = ""
        
        if rnd > 0.3:
            com = "가위"
        elif rnd > 0.6:
            com = "바위"
        else:
            com = "보"
        
        if com == mine:
            result = "비김 ✿˘◡˘"
        elif com == "바위" and mine == "가위":
            result = "패배 (°◇°;)"
        elif com == "바위" and mine == "보":
            result = "승리 ٩(•̤̀ᵕ•̤́๑)૭✧"
            
        elif com == "가위" and mine == "보":
            result = "패배 (°◇°;)"
        elif com == "가위" and mine == "바위":
            result = "승리 ٩(•̤̀ᵕ•̤́๑)૭✧"
            
        elif com == "보" and mine == "바위":
            result = "패배 (°◇°;)"
        elif com == "보" and mine == "가위":
            result = "승리 ٩(•̤̀ᵕ•̤́๑)૭✧"
            
        self.leCom.setText(com)
        self.leResult.setText(result)
        
        
        

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()
