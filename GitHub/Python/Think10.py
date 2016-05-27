def cumulative_sum(red):
	new = []
	sumo = 0
	for num in red:
		sumo += num
		new.append(sumo)
	return new

def chop_middle(slit):
	return slit[1:len(slit)-1]

def is_sorted(lsit):
	new = lsit[:]
	new.sort()
	return new == lsit

def is_anagram(word1, word2):
	list1 = list(word1)
	list2 = list(word2)
	list1.sort()
	list2.sort()
	return list1 == list2

def remove_duplicates(lsit):
	lsit2 = []
	for word in lsit:
		if word not in lsit2:
			lsit2.append(word)
	return lsit2