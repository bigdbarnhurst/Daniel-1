import java.util.Scanner;
public class Brilliant1{
	public static int factorsum(int num){
		int sum = 0;
		for(int i = 1; i <= num; i++){
			if(num % i == 0){
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number to calculate the sum of it's factors");
		int num = n.nextInt();
		int total = factorsum(num);
		System.out.println(total);
	}
}
