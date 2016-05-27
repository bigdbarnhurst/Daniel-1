def main():
    h = eval(input("Enter the amount of hydrogen atoms: "))
    c = eval(input("Enter the amount of carbon atoms: "))
    o = eval(input("Enter the amount of oxygen atoms: "))
    weightH = h * 1.0079
    weightC = c * 12.011
    weightO = o * 15.9994
    overallWeight = weightH + weightC + weightO
    print("Your molecular weight is: ", overallWeight)

main()
