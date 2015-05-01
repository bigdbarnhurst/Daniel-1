import java.util.Scanner;

class FibonacciPrime{
	public static void main(String[] args){
		System.out.println("Enter the range");
		Scanner start = new Scanner(System.in);
		int sum = 0;
		int range = start.nextInt();
		boolean[] primeKiller;
		primeKiller = new boolean[range+2];
		for(int i = 2; i <= range; i++){
			primeKiller[i] = true;
		}
		for(int j = 2; (j * j) <= range; j++){
			if(primeKiller[j]){
				for(int k = j; k * j <= (int)(Math.round(Math.sqrt(range)); k++){
					primeKiller[k * j] = false;
				}
			}
		}
		int a = 1;
		int b = 0;
		int c = 0;
		while(a < range){
			for(int i = a / 2; i > 2; i--){
				if(primeKiller[a]){
					sum = sum + a;
				}
				c = a + b;
				b = a;
				a = c;
			}
		}
		System.out.println("Your sum equals: " + sum);
	}
}