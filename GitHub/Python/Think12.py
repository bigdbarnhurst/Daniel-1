import random

def sumall(*args):
        sum1 = 0
        for a in range(len(args)):
                sum1 += args[a]
        return sum1

def sort_by_length(words):
        t = []
        for word in words:
                t.append((len(word), random.randint(1, 100000000), word))
        t.sort(reverse=True) 
        res = []
        for length, num, word in t:
                res.append(word)
        return res

def histogram(word):
        d = dict()
        for letter in word:
                if letter not in d:
                        d[letter] = 1
                else:
                        d[letter] += 1
        return d

def most_frequent(letters):
        letter_dict = histogram(letters)
        letter_tuples = list(zip(letter_dict.values(), letter_dict.keys()))
        letter_tuples.sort()
        for value, letter in letter_tuples:
                print(value, letter)