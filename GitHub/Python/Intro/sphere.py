import math

def main():
    radius = eval(input("Enter the radius of the sphere: "))
    volume = 4.0/3.0 * math.pi * radius ** 3
    area = 4 * math.pi * radius ** 2
    print("The surface are of your sphere is:", area)
    print("The volume of your sphere is:", volume)

main()
