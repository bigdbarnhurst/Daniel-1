import math
r = -1
for n in range(2, 100000000):
	for x in range(2, n//2):
		if n % x == 0:
			break
	else:
		r = r + 1
		if r == 10001:
			print(n, ' is the ', r, ' prime number.')
			break