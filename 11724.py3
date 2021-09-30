import sys
sys.setrecursionlimit(10**6)

def dfs(graph, vertex, visited):
	visited[vertex] = True
	for around_vertex in graph[vertex]:
		if not visited[around_vertex]:
			dfs(graph, around_vertex, visited)

node, edge = map(int, input().split())

graph = [[] for _ in range(node + 1)]

for _ in range(edge):
    # n1, n2 = map(int, input().split())
    n1, n2 = map(int, sys.stdin.readline().split())
    graph[n1].append(n2)
    graph[n2].append(n1)

visited = [False] * (node + 1)

result = 0
for vertex in range(1, node + 1):
	if visited[vertex] == False:
		dfs(graph, vertex, visited)
		result += 1

print(result)