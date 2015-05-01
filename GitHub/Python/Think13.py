import string
import random

def case1(x):
        if x in string.ascii_lowercase or x == ' ':
                return True
        else:
                return False

def case2(x):
        if x in string.ascii_lowercase:
                return True
        else:
                return False

def lower_case(x):
        a = x.lower()
        al = list(a)
        al2 = filter(case1, al)
        str1 = ''.join(al2)
        al3 = str1.split(' ')
        al4 = list(filter(None, al3))
        return al4

def words(filename):
        book = open(filename)
        word_list = []
        for line in book:
                word_list = word_list + (lower_case(line))
        return word_list

def histo(list1):
        hdict = dict()
        for word in list1:
                if word in hdict:
                        hdict[word] += 1
                else:
                        hdict[word] = 1
        return hdict

def book_info(filename):
        length = len(words(filename))
        print("The total amount of words, plus a few spaces, in the book is: ")
        print(length)
        unique_words = len(histo(words(filename)))
        print("The number of unique words, again with a slight error, equals: ")
        print(unique_words)
        common = []
        for key, value in histo(words(filename)).items():
                common.append((value, key))
        common.sort(reverse=True)
        print("The most commonly used words in the book are: ")
        for i in range(10):
                print(common[i])
        
def random_word(filename):
        lis = words(filename)
        return random.choice(lis)