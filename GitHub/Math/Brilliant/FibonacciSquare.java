import java.util.Scanner;

class FibonacciSquare{
	public static void main(String[] args){
		System.out.println("Enter the range");
		Scanner start = new Scanner(System.in);
		int sum = 0;
		int range = start.nextInt();
		int a = 1;
		int b = 0;
		int c = 0;
		double root;
		while(a < range){
			root = Math.sqrt(a);
			if(root % 1 == 0){
				System.out.println(a);
				sum = sum + a;
			}
			c = a + b;
			b = a;
			a = c;
		}
		System.out.println("Your sum equals: " + sum);
	}
}