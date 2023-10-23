from collections import deque
n = int(input())
queue = deque(range(1, n + 1))
# print(queue) => deque([1, 2, 3, 4, 5, 6, 7])
while len(queue) > 1:
    print(queue.popleft(), end=" ")
    queue.append(queue.popleft())
print(queue[0])