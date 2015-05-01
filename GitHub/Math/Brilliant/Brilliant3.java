import java.util.Scanner;

public class Brilliant3{
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		System.out.println("Type in the number you wish to know the sum of the factors.");
		int numtofactor = num.nextInt();
		int sum = 0;
		for(int i = 1; i <= numtofactor; i++){
			if(numtofactor % i == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
