import sys
from collections import deque

def bfs(start_points):
	queue = deque(start_points)
	while queue:
		x, y = queue.popleft()
		for i in range(4):
			nx = x + dx[i]
			ny = y + dy[i]
			if nx < 0 or nx >= n or ny < 0 or ny >= m:
				continue
			if box[nx][ny] == -1:
				continue
			if box[nx][ny] == 0:
				box[nx][ny] = box[x][y] + 1
				queue.append([nx, ny])

m, n = map(int, input().split())
box = []
for _ in range(n):
    box.append(list(map(int, sys.stdin.readline().split())))

start_points = []
for i in range(n):
	for j in range(m):
		if box[i][j] == 1:
			start_points.append([i, j])

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
bfs(start_points)

for row in box:
	if len(list(filter(lambda x: x == 0, row))):
		print(-1)
		sys.exit(0)

print(max(map(max, box)) - 1)