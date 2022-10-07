# 첫수를 넣으세요 2
# 끝수를 넣으세요 4
# 배수를 넣으세요 3

# 2에서 4까지의 3의 배수의 합은 3입니다.

a = input("첫수를 넣으세요 ")
b = input("끝수를 넣으세요 ")
c = input("배수를 넣으세요 ")

first = int(a)
last = int(b)
mul = int(c)

sum = 0
for i in range(first, last+1):
    # print(i)
    if i % mul == 0:
      sum += i
      
print("{}에서 {}까지의 {}의 배수의 합은 {}입니다.".format(first, last, mul, sum)) 
    
    
