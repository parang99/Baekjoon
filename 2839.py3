total_kg = int(input())
counts = -1 # unable

for candidate5kg in range(total_kg // 5, -1, -1): # 5, 4, 3, 2, 1, 0
    rest_sugar = total_kg - candidate5kg * 5
    if rest_sugar % 3 == 0:
        counts = candidate5kg + rest_sugar // 3
        break

print(counts)