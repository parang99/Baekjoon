import sys

city_n = int(input())
distance_list = list(map(int, sys.stdin.readline().split()))
price_list = list(map(int, sys.stdin.readline().split()))

min_price = price_list[0]
distance_to_pay = distance_list[0]
cost = 0
for i in range(1, city_n - 1):
	if price_list[i] < min_price:
		cost += min_price * distance_to_pay
		min_price = price_list[i]
		distance_to_pay = distance_list[i]
	else:
		distance_to_pay += distance_list[i]	

cost += min_price * distance_to_pay

print(cost)