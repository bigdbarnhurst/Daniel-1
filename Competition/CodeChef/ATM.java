import java.util.Scanner;

class ATM{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		double transaction = start.nextDouble();
		double total = start.nextDouble();
		if((total - .5) >= transaction && transaction % 5 == 0){
			total = total - transaction - .5;
			System.out.format("%.2f%n", total);
		} else{
			System.out.format("%.2f%n", total);	
		}
	}
}