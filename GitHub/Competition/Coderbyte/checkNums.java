import java.util.*;

class checkNums{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		int num1 = start.nextInt();
		int num2 = start.nextInt();
		if(num1 == num2){
			System.out.println("-1");
		} else if(num1 > num2){
			System.out.println("true");
		} else{
			System.out.println("false");
		}
	}
}