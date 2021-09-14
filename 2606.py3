import sys

def dfs(graph, vertex, visited):
	visited[vertex] = True
	global result
	result += 1
	for around_vertex in graph[vertex]:
		if not visited[around_vertex]:
			dfs(graph, around_vertex, visited)
			
node = int(input())
graph = [[] for _ in range(node + 1)]

edge = int(input())
for _ in range(edge):
	node1, node2 = map(int, sys.stdin.readline().split())
	graph[node1].append(node2)
	graph[node2].append(node1)

visited = [False] * (node + 1)
result = -1
dfs(graph, 1, visited)
print(result)