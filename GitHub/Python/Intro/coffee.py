def main():
    beans = eval(input("How many pounds of coffee would you like to purchase?"))
    bean_price = beans * 10.5
    shipping_price = beans * .86 + 1.50
    total_price = bean_price + shipping_price
    print("That will be $", total_price, "for your coffee beans.")

main()
