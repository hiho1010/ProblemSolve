# 입력 받은 단어들을 저장할 리스트
words = []

# 5개의 단어를 입력 받아 리스트에 저장
for _ in range(5):
    word = input()
    words.append(word)

# 단어들을 가로로 출력
for i in range(15):
    for word in words:
        if i < len(word):
            print(word[i], end='')

# 코드 실행 결과 출력
print()
