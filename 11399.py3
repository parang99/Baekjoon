n_people = int(input())
time_list = list(map(int, input().split()))
time_list.sort()

total_time = 0
for time in time_list:
    total_time += time * n_people
    n_people -= 1

print(total_time)