public class Euler14{
	public static void main(String[] args){
		long count = 0;
		long winningcount = 0;
		long winner = 0;
		for(long i = 1; i <= 1000000; i++){
			while(i != 1){
				if(i % 2 == 0){
					i = i / 2;
				} else{
					i = 3 * i + 1;
				}
				count++;
			}
			if(count > winningcount){
				winningcount = count;
				winner = i;
			}
		}
		System.out.println(winner);
	}
}