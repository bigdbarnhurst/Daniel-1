public class Euler6{	
	public static void main(String args[]){
		int sum1;
		sum1 = 0;
		for(int i = 1; i < 101; i++){
			sum1 += i;
		}
		sum1 = (sum1 * sum1);
		System.out.println(sum1);
		
		int sum2;
		sum2 = 0;
		for (int i = 1; i < 101; i++){
			sum2 = sum2 + (i*i);
		}
		System.out.println(sum2);
		
		int total;
		total = sum1 - sum2;
		System.out.println(total);
	}
}

