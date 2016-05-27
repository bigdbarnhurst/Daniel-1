import java.util.*;

class PrimeSieve1{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		System.out.println("Number for prime test:");
		int first = start.nextInt();
		boolean[] primeKiller;
			primeKiller = new boolean[first+2];
			for(int i = 2; i <= first; i++){
				primeKiller[i] = true;
			}
			for(int j = 2; (j * j) <= first; j++){
				if(primeKiller[j]){
					for(int k = j; k * j <= first; k++){
						primeKiller[k * j] = false;
					}
				}
			}
		System.out.println("Is it a prime?");
		System.out.println(primeKiller[first]);
	}
}