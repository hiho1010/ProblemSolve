import math

def gcd(x,y):
    if x % y == 0:
        return y
    else:
        return gcd(y,x%y)

a,b = map(int,input().split())
c,d = map(int,input().split())

e,f = a*d+b*c,b*d
g = gcd(e,f)
if g != 1:
    e//=g
    f//=g
print(e,f)