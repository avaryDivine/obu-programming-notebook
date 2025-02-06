
a = int(input("Type a positive integer "))
b = int(input("Type another positive integer "))

rem = a % b
x = b
y = rem

while rem > 0:
   gcd = rem
   rem = x % y
   x = y
   y = rem

lcm = (a*b)//gcd
print(f'The GCD is {gcd}')
print(f'The LCM is {lcm}')
 
