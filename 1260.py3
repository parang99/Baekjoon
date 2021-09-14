import sys
from collections import deque

def dfs(graph, vertex, visited):
	visited[vertex] = True
	print(vertex, end=' ')
	for around_vertex in graph[vertex]:
		if not visited[around_vertex]:
			dfs(graph, around_vertex, visited)

def bfs(graph, start, visited):
	queue = deque([start])
	visited[start] = True
	while queue:
		vertex = queue.popleft()
		print(vertex, end=' ')
		for around_vertex in graph[vertex]:
			if not visited[around_vertex]:
				queue.append(around_vertex)
				visited[around_vertex] = True
			
node, edge, start = map(int, input().split())
graph = [[] for _ in range(node + 1)]

for _ in range(edge):
	v1, v2 = map(int, sys.stdin.readline().split())
	graph[v1].append(v2)
	graph[v2].append(v1)

for i in range(1, node + 1):
    graph[i].sort()

dfs_visited = [False] * (node + 1)
bfs_visited = [False] * (node + 1)

dfs(graph, start, dfs_visited)
print()
bfs(graph, start, bfs_visited)