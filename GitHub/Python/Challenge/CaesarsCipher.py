def cipher(string):
        lowerstring = string.lower()
        password = int(input("Enter the password number or type 26 to display all possibilties: "))
        if (password == 26):
                for trials in range(26):
                        sentence = ''
                        for i in lowerstring:
                                if i == ' ':
                                        sentence += ' '
                                        continue
                                x = ord(i)
                                y = x + trials
                                if y > 122:
                                        y = y - 122 + 96
                                sentence += chr(y)
                        print(sentence)
                        print(' ')
        else:
                sentence = ''
                for i in lowerstring:
                        if i == ' ':
                                sentence += ' '
                                continue
                        x = ord(i)
                        y = x + password
                        if y > 122:
                                y = y - 122 + 96
                        sentence += chr(y)
                print(sentence)