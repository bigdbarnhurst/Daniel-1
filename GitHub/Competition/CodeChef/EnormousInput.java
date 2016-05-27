import java.util.Scanner;

class EnormousInput{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		int cases = start.nextInt();
		long divisor = start.nextLong();
		int success = 0;
		for(int i = cases; i > 0; i--){
			long input = start.nextLong();
			if(input % divisor == 0)
				success++;
		}
		System.out.println(success);
	}
}