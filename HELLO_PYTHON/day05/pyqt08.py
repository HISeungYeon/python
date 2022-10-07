import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow

form_class = uic.loadUiType("pyqt08.ui")[0]


class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.myclick)
        
    def drawStar(self, cnt):
        
        ret = ""
        for i in range(cnt):
            ret +="*"
            
        return ret+"\n"
        
    def myclick(self):
        a = int(self.le_first.text())
        # print(a)
        b = int(self.le_last.text())
        # print(b)
        
        txt = ""
        for i in range(a, b+1):
            # print(i)
            txt += self.drawStar(i)
            
        # txt += self.drawStar(1)
        # txt += self.drawStar(2)
        
        self.te.setText(txt)

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()
