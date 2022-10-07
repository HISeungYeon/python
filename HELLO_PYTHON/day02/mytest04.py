# 홀/짝을 입력하시오 (홀 or 짝)
# 나 : 홀
# 컴퓨터 : 짝
# 결과: 승리
from random import random

me = input("홀짝을 입력하세요 => ")

com = random()
if com > 0.5:
    ccom = "홀"
    
else:
    ccom = "짝"
    
print("컴퓨터 ", ccom)

if (ccom == "홀" and me == "홀") or (ccom == "짝" and me == "짝") :
    print("내가 승리닷")
else:
    print("컴퓨터가 승리닷")
    
#-----------------------------------------------------
mine = input("홀/짝을 입력하시오")
com = ""
result = ""

rnd = random()
if rnd > 0.5:
    com = "홀"
else:
    com = "짝"

if com == mine:
    result = "승리"
else :
    result = "패배"
    
print("mine", mine)
print("com", com)
print("result", result)
    
    
    
