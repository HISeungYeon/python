# 첫수를 넣으세요 
# 끝수를 넣으세요
# 1에서 4까지의 합은 10입니다.

a = input("첫수를 넣으세요 ")
# print("a", a)

b = input("끝수를 넣으세요 ")
# print("b", b)

aa = int(a)
bb = int(b)

sum = 0
for i in range(aa, bb+1): # ㅇ ㅖ ?
    sum += i
     
print("{}에서 {}까지의 합은 {}입니다. ".format(aa, bb, sum))
#format 알아두쟈!!