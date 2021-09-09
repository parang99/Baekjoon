change = 1000 - int(input())
coin_tuple = (500, 100, 50, 10, 5, 1)
counts = 0

for coin in coin_tuple:
    if change >= coin:
        counts += change // coin
        change %= coin

print(counts)