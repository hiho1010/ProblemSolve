import sys
input = sys.stdin.readline

N = int(input())
solution = sorted(list(map(int, input().split())))

##투포인터
start = 0
end = N-1

target = abs(solution[0] + solution[-1])#절대값 -> 0까지 거리
result = [solution[0], solution[-1]] #초기값 설정

while start < end:
    l = solution[start]
    r = solution[end]

    d = l + r
    zero_d = abs(d)

    if zero_d < target: #현재 가장 가까운 거리보다 작다면
        target = zero_d
        result = [l, r]

    if d < 0: #현재 합이 0보다 작다면 start를 1칸 올려 합을 올려
        start += 1
    else: #반대면 end를 한칸내려서 합을 낮춰
        end -= 1

print(*result)