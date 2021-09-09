n = int(input())
rope_list = []
max = 0

for _ in range(n):
    rope_list.append(int(input()))
    
rope_list.sort()

for rope in rope_list:
	if rope * n > max:
		max = rope * n
	n -= 1

print(max)