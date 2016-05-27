cases = int(input())
for i in range(cases):
	guard1, guard2 = input().split()
	guard1 = int(guard1)
	guard2 = int(guard2)
	if guard1 > guard2:
		minimum = guard1
	else:
		minimum = guard2
	maximum = guard1 + guard2
	print(minimum, maximum)