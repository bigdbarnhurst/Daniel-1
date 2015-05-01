cases = int(input())
for i in range(cases):
	items = 0
	cash = int(input())
	j = 11
	while cash != 0:
		items = items + cash // (2**j)
		cash = cash % (2**j)
		j = j - 1
	print(items)
			
		