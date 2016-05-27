import math

def main():
    diameter = eval(input("Enter the diameter of your pizza: "))
    price = eval(input("Enter the pirce of your pizza: "))
    area = 4.0 * math.pi * (diameter / 2) ** 2
    inchPrice = price / area
    print("Per inch, your pizza costs: ", inchPrice)

main()
