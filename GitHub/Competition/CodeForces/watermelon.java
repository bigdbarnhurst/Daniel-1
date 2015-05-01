import java.util.Scanner;

public class watermelon{
	public static void main(String[] args){
		Scanner melon = new Scanner(System.in);
		double watermelon = melon.nextDouble();
		if(watermelon % 2 == 0){
			watermelon = watermelon / 2;
		} else{
			watermelon = 3;
		}
		if(watermelon % 2 == 0){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}
