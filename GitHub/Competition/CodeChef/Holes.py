start = int(input())
while start > 0:
	str1 = input("")
	count = 0
	for i in str1:
		if i == "A" or i == "D" or i == "O" or i == "P" or i == "Q" or i == "R":
			count = count + 1
		elif i == "B":
			count = count + 2
	print(count)
	start = start - 1