import sys
x = int(sys.stdin.readline())
y = int(sys.stdin.readline())
q = 0

if x>0:
    q = 1;
    if y<0:
        q = 4;
else:
    q = 2;
    if y<0:
        q = 3;
        
print(q)