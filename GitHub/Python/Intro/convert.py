def main():
    print("Hello, enter number that you need to convert:")
    print("1. Fahrenheit to Celcius")
    print("2. Celcius to Fahrenheit")
    decider = eval(input(""))
    if decider == 1:
        fahrenheit = eval(input("Enter the degree Fahrenheit:"))
        celcius = (fahrenheit - 32) * 5 / 9
        print("The temperature is", celcius, "degrees Celcius.")
    elif decider == 2:
        celcius = eval(input("Enter the degrees Celcius:"))
        fahrenheit = celcius * 9 / 5 + 32
        print("The temperature is", fahrenheit, "degrees Fahrenheit")
    else:
        print("Read the instructions!")
main()
