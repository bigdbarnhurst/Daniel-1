import math

def main():
    a = eval(input("Enter first side: "))
    b = eval(input("Enter second side: " ))
    c = eval(input("Enter third side: "))
    s = (a + b + c) / 2
    area = math.sqrt(s * (s - a) * (s - b) * (s - c))
    print("The area of your triangle is", area)

main()
