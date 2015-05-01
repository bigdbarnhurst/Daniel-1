def div_string():
        string = input("Enter number string: ")
        divide = int(input("Enter number to divide by: "))
        count = 0
        for i in range(0, len(string)):
                for j in range(i + 1, len(string) + 1):
                        substring = string[i:j]
                        if (int(substring) % divide == 0):
                                count += 1
        print(count)