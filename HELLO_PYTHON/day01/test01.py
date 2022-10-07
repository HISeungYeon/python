# 1~에서 100까지의 정수중 3의 배수의 합을 구해보쟈

a = range(1, 101)

sum = 0
for i in a:
    if i%3 ==0:
        # print(i)
        sum += i

        
print("sum = ", sum)