import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow
from random import random

form_class = uic.loadUiType("pyqt05.ui")[0]


class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.myclick)
        self.leMine.returnPressed.connect(self.myclick)
        
        
    def myclick(self):
        # print("버튼이 클릭되었습니다.")
        mine = self.leMine.text()
        # print(mine)
        rnd = random()
        
        if rnd > 0.5:
            com = "홀"
        else:
            com = "짝"
        
        if com == mine:
            result = "승리"
        else :
            result = "패배"
            
        self.leCom.setText(com)
        self.leResult.setText(result)
        
        
        
        
        

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()
