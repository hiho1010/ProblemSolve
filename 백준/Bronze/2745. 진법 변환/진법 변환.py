n, b = input().split()
b = int(b)

answer = 0
    
for i in range(len(n)-1, -1, -1):
    if ord(n[i]) >= 65:
        tmp = ord(n[i]) % 65 +10
    else: tmp = n[i]

    tmp = int(tmp)
    mid_tmp = b**(len(n)-i-1)
    answer += mid_tmp * tmp
print(answer)