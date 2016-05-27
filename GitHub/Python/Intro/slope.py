def main():
    x1 = eval(input("Enter the first x coordinate: "))
    y1 = eval(input("Enter the first y coordinate: "))
    x2 = eval(input("Enter the second x coordinate: "))
    y2 = eval(input("Enter the second y cooordinate: "))
    slope = (y2 - y1) / (x2 - x1)
    print("The slope of the line your points make is", slope)

main()
