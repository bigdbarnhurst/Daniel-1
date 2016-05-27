import java.util.Scanner;

class Fibonacci3{
	public static void main(String[] args){
		System.out.println("Enter the range");
		Scanner start = new Scanner(System.in);
		int sum = 0;
		int range = start.nextInt();
		int a = 1;
		int b = 0;
		int c = 0;
		while(a < range){
			if(a % 3 == 0){
				sum = sum + a;
			}
			c = a + b;
			b = a;
			a = c;
		}
		System.out.println("Your sum equals: " + sum);
	}
}