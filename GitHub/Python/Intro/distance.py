import math

def main():
    x1 = eval(input("Enter the first x coordinate: "))
    y1 = eval(input("Enter the first y coordinate: "))
    x2 = eval(input("Enter the second x coordinate: "))
    y2 = eval(input("Enter the second y cooordinate: "))
    distance = math.sqrt((abs(x2 - x1)) ** 2 + (abs(y2 - y1)) ** 2)
    print("The distance between these two points is", distance)

main()
