word = input()
alphabet = list(range(97, 123))    # a = 97, z = 122
result = []
for i in alphabet :
    result.append(word.find(chr(i)))

print(*result)