x = int(input("Please enter an integer: "))

if x < 0:
	x == 0
	print('Negative changed to zero')
elif x == 0:
	print('Zero')
elif x == 1:
	print('Single')
else:
	while x != 1:
		if x % 2 == 0:
			x = x / 2
			print(x)
		else:
			x = (3 * x) + 1
			print(x)
