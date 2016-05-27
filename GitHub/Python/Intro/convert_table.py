def main():
    degree = eval(input("Enter 1 for Fahrenheit or 2 for Celcius:"))
    if degree == 1:
        for f in [0,10,20,30,40,50,60,70,80,90,100]:
            far = f
            cel = (far - 32) * 5 / 9
            print("Fahrenheit:", far, "    Celcius:", cel)
    elif degree == 2:
        for c in [0,10,20,30,40,50,60,70,80,90,100]:
            cel = c
            far = cel * 9 / 5 + 32
            print("Celcius:", cel, "     Fahrenheit:", far)
    else:
        print("Learn to read, buddy")
main()
