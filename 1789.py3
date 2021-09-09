sum = int(input())
num = 1
count = 0

while True:
	if sum >= num:
		count += 1
		sum -= num
		num += 1
	else:
		break
        
print(count)