# 출력 원하는 단수를 입력하세요. 
# 5*1=5 
# 5*2=10 등 구구단 출력하기

dan = input("출력 원하는 단수를 입력하세요. ")

idan = int(dan)

for i in range(1, 10):
    hi = idan*i
    print("{} x {} = {}".format(dan,i,hi))
