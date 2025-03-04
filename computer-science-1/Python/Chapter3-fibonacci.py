import math
k = int(input("type a value for k: "))
n1 = 0
n2 = 1

for i in range(k):
    n = n1 + n2
    n2 = n1
    n1 = n
    
print(f"The {k}th value of the Fibonnaci sequence defined with the recursice relation is {n}")

n = round((1/math.sqrt(5)) * ((math.pow(((1 + math.sqrt(5))/2), k)) - (math.pow(((1 - math.sqrt(5))/2), k))))
print(f"The {k}th value of the Fibonnaci sequence defined with the non-recursice relation is {n}")
