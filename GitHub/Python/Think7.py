import math

def sqroot(x, y):
	while True:
		a = (x + y/x) / 2
		if a == x:
			break
		x = a
	return x
		
def test_sqroot(x):
	y = x // 2
	z = sqroot(y, x)
	print(z)
	print(math.sqrt(x))
	print(abs(math.sqrt(x) - z))