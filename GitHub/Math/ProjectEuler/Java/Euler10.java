public class Euler10{
	public static void main(String[] args){
		int limit = 2000000;
		boolean[] primeKiller;
		primeKiller = new boolean[limit+2];
		for(int i = 2; i <= limit; i++){
			primeKiller[i] = true;
		}
		for(int j = 2; (j * j) <= limit; j++){
			if(primeKiller[j]){
				for(int k = j; k * j <= limit; k++){
					primeKiller[k * j] = false;
				}
			}
		}
		long sumOfPrimes = 0;
		for(int m = 2; m <= limit; m++){
			if(primeKiller[m])
				sumOfPrimes = sumOfPrimes + m;
		}
		System.out.println(sumOfPrimes);
	}
}