import sys
from PyQt5 import uic
from PyQt5.QtWidgets import QApplication, QMainWindow

form_class = uic.loadUiType("pyqt06.ui")[0]


class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        
        self.pb.clicked.connect(self.myclick)
        
    def myclick(self):
        # print("버튼이 클릭되었습니다.")
        
        dan = int(self.le.text())
        # print(dan)
        hi = ""
        
        # for i in range(1,10) :
        #     result = dan*i
        #     hi += str(dan) + " x " + str(i) + " = " + str(result) + "\n"
        # print(hi)
        #

        hi += f"{dan}*{1}={dan*1}\n" #f 한번에 쓸 수 있음 ㅇㅁㅇ
        hi += f"{dan}*{2}={dan*2}\n" 
        hi += f"{dan}*{3}={dan*3}\n" 
        hi += f"{dan}*{4}={dan*4}\n" 
        hi += f"{dan}*{5}={dan*5}\n" 

        self.te.setText(hi);
        
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()
