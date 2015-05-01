me = "Daniel"
letter = me[3]
def vertical(a):
	radar = 1
	while radar < len(a) + 1:
		print(a[-(radar)])
		radar = radar + 1

def quack():
	prefix = 'JKLMNOPQ'
	suffix = 'ack'
	for radar in prefix:
		if (radar in "O") or (radar in "Q"):
			print(radar + 'u' + suffix)
		else:
			print(radar + suffix)

def count(string, search):
	count = 0
	for x in string:
		if x == search:
			count = count + 1
	print(count)
	
def palindrome(word):
	print(word + word[::-1])
	
def rotate_word(word):
	