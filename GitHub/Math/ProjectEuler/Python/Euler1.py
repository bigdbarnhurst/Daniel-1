sum = 0
num = 0
while num < 999:
	num = num + 1
	if num % 3 == 0 or num % 5 == 0:
		sum = sum + num
	
print(sum)