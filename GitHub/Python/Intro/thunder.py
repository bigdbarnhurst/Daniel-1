def main():
    time = eval(input("Enter the seconds from the lightning strike to the sound: "))
    feetToMiles = 1100 / 5280
    distance = time * feetToMiles
    print("The lightning is ", distance, "away from you.")

main()
