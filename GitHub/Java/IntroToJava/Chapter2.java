import java.util.Scanner;

public class Chapter2{
	public static void printIntials(){
		System.out.println("******        ***************    ***********   ");
		System.out.println("**   **               **         **        **  ");
		System.out.println("**    **              **         **         ** ");
		System.out.println("**     **             **         **        **  ");
		System.out.println("**     **             **         ***********   ");
		System.out.println("**     **     **      **         ************  ");
		System.out.println("**    **       **     **         **         ** ");
		System.out.println("**   **         **   **          **        **  ");
		System.out.println("*****            *****           ***********   ");
	}
	
	public static void rollDice(){
		double die1 = Math.floor(6 * Math.random()) + 1;
		double die2 = Math.floor(6 * Math.random()) + 1;
		System.out.println("Your first number is:");
		System.out.println(die1);
		System.out.println("Your second number is:");
		System.out.println(die2);
		System.out.println("The total of the two dice is:");
		System.out.println(die1 + die2);
	}
	
	public static void requestName(){
		Scanner name = new Scanner(System.in);
		String user = name.nextLine();
		System.out.println("Hello, " + user.toUpperCase() + ", nice to meet you!");
	}
	
	public static void countMoney(){
		Scanner money = new Scanner(System.in);
		System.out.println("Enter amount of pennies:");
		double pennies = money.nextDouble() * .01;
		System.out.println("Enter amount of nickels:");
		double nickels = money.nextDouble() * .05;
		System.out.println("Enter amount of dimes:");
		double dimes = money.nextDouble() * .1;
		System.out.println("Enter amount of quarters:");
		double quarters = money.nextDouble() * .25;
		double total = pennies + nickels + dimes + quarters;
		System.out.print("You have $");
		System.out.printf("%1.2f", total);
	}
	
	public static void countEggs(){
		Scanner egg = new Scanner(System.in);
		int eggs = egg.nextInt();
		double gross = Math.floor(eggs/144);
		int remaining = eggs % 144;
		double dozen = Math.floor(remaining/12);
		remaining = remaining % 12;
		System.out.println("You have " + gross + " gross, " + 
		dozen + " dozen, with " + remaining + " left over.");
	}
	
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		System.out.println("Choose a number between 1 and 5:");
		int choice = a.nextInt();
		switch (choice) {
			case 1: System.out.println("Intials of the creator");
			printIntials();
			break;
			
			case 2: System.out.println("Roll a pair of dice");
			rollDice();
			break;
			
			case 3: System.out.println("Greeter");
			requestName();
			break;
			
			case 4: System.out.println("Count your change");
			countMoney();
			break;
			
			case 5: System.out.println("Don't count your eggs before they hatch");
			countEggs();
			break;
		}
	}
}
	
	
