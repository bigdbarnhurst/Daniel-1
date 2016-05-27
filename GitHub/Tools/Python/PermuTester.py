def permu():
        first_string = input("Enter first string: ")
        second_string = input("Enter second string: ")
        first_list = list(first_string)
        second_list = list(second_string)
        first_list.sort()
        second_list.sort()
        if (first_list == second_list):
                return True
        else:
                return False