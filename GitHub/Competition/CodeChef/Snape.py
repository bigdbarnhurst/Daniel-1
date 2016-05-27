import math

test = int(input())
for x in range(test):
        b, ls = input().split()
        b = int(b)
        ls = int(ls)
        minrs = math.sqrt(ls * ls - b * b)
        maxrs = math.sqrt(b * b + ls * ls)
        print(minrs, maxrs)