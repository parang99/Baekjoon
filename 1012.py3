import sys
sys.setrecursionlimit(10**6)

def dfs(x, y):
	if x < 0 or x >= n or y < 0 or y >= m:
		return False
	if farm[x][y] == 1:
		farm[x][y] = 0
		dfs(x - 1, y)
		dfs(x + 1, y)
		dfs(x, y - 1)
		dfs(x, y + 1)
		return True
	return False

testcase = int(input())
for _ in range(testcase):
	m, n, cabbage = map(int, sys.stdin.readline().split())
	farm = [[0] * m for _ in range(n)]
	
	for _ in range(cabbage):
		y, x = map(int, sys.stdin.readline().split())
		farm[x][y] = 1
	
	result = 0
	for i in range(n):
		for j in range(m):
			if dfs(i, j) == True:
				result += 1
	print(result)