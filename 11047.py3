kind, value = map(int, input().split())
coin_list = []
counts = 0

for _ in range(kind):
    coin_list.append(int(input()))
coin_list.sort(reverse=True)
    
for coin in coin_list:
    if coin > value:
        continue
    counts += value // coin
    value %= coin
    if value == 0:
        break

print(counts)