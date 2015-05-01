class Euler7{
	public static void main(String[] args){
		int limit = 100000000;
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
		int count = 0;
		int primer = 0;
		for(int k=1; count < 10001; k++){
			if(primeKiller[k] == true){
				count++;
				primer++;
			} else{
				primer++;
				continue;
			}
		}
		System.out.println(primer);
	}
}