limit = int(input())
old_fib = 0
new_fib = 1
fib_sum = 0
while new_fib < limit:
	new_fib = new_fib + old_fib
	old_fib = new_fib - old_fib
	if new_fib % 2 == 0:
		fib_sum += new_fib
print(fib_sum)