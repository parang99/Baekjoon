# ..A.. -(first_negative) ..B.. : A - B
expression = input()
split_point = expression.find('-')

if split_point == -1:
	split_point = len(expression)
	negative_num_list = []
else:
	negative_part = expression[split_point + 1:]
	negative_num_list = list(map(int, negative_part.replace('+', '-').split('-')))
		
positive_part = expression[:split_point]
positive_num_list = list(map(int, positive_part.replace('+', '-').split('-')))

result = sum(positive_num_list) - sum(negative_num_list)    
print(result)