import string

open_file = open('List2.txt','r')
string_file = open_file.read()

def alpha_sort():
        new_list = []
        for char in string_file:
                if char in list(string.ascii_letters):
                        new_list.append(char)
        new_string = ''.join(new_list)
        print(new_string)