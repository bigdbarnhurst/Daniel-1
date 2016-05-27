def blast(v):
	if v == 0:
		print("Boom!")
	else:
		print(v)
		blast(v - 1)

def repeat(m, n):
	if n <= 0:
		return
	print(m)
	repeat(m, n-1)
	
def ack(m, n):
	if m == 0:
		return n+1
	elif m > 0 and n == 0:
		return ack(m - 1, 1)
	elif m > 0 and n > 0:
		return ack(m - 1, ack(m, n-1))
	print(m, n)
def first(word):
	return word[0]

def last(word):
	return word[-1]

def middle(word):
	return word[1:-1]

def is_palindrome(examinee):
	if len(examinee) <= 1:
		return True
	elif first(examinee) == last(examinee):
		return is_palindrome(middle(examinee))
	else:
		return False