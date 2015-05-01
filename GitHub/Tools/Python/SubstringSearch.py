def search(string):
        substring = input("Enter your substring: ")
        superlength = len(string)
        sublength = len(substring)
        count = 0
        for x in range(superlength):
                if string[x:x+sublength] == substring:
                        count += 1
        return count