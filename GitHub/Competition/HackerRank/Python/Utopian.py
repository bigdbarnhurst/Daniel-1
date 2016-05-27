test = int(input())
cases = range(test)
for x in cases:
        tree = 1
        years = range(int(input()))
        for y in years:
                if y % 2 == 0:
                        tree *= 2
                else:
                        tree += 1
        print(tree)
        