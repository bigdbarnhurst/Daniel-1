def histogram(word):
	d = dict()
	for letter in word:
		if letter not in d:
			d[letter] = 1
		else:
			d[letter] += 1
	return d

def print_hist(word):
	di = histogram(word)
	li = list(di.keys())
	li.sort()
	for letter in li:
		print(letter, di[letter])

def reverse_lookup(di, val):
	lis = []
	for vals in di:
		if di[vals] == val:
			lis.append(vals)
	return lis