total_time = int(input())
button_time_tuple = (300, 60, 10)
button_counts = []

if total_time % 10 != 0:
    print(-1)
else:
    for button_time in button_time_tuple:
        button_counts.append(total_time // button_time)
        total_time %= button_time

    for count in button_counts:
        print(count, end=' ')