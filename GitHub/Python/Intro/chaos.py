def main():
    print("This program illustrates a chaotic function")
    x = eval(input("Enter a number between 0 and 1: "))
    time = eval(input("How many steps do you desire: "))
    for i in range(time):
        x = 3.9 * x * (1 - x)
        print(x)

main()
