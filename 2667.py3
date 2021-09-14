import sys

def bfs(x, y):
	global home
	if x < 0 or x >= n or y < 0 or y >= n:
		return False
	if graph[x][y] == 1:
		home += 1
		graph[x][y] = 0
		bfs(x + 1, y)
		bfs(x - 1, y)
		bfs(x, y + 1)
		bfs(x, y - 1)
		return True
	return False

n = int(input())
graph = []
for _ in range(n):
	graph.append(list(map(int, sys.stdin.readline().strip())))

homes = []
for i in range(n):
	for j in range(n):
		home = 0
		if bfs(i, j) == True:
			homes.append(home)

print(len(homes))
homes.sort()
for home in homes:
	print(home)