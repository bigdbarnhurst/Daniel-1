import java.util.*;

class IsFibo{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		long cases = start.nextLong();
		String isFibo;
		for(long i = cases; i > 0; i--){
			long test = start.nextLong();
			if(fibonator(test))
				isFibo = "IsFibo";
			else
				isFibo = "IsNotFibo";
			System.out.println(isFibo);	
		}
	}
	
	public static boolean fibonator(long question){
		boolean answer = false;
		long j = 0;
		long k = 1;
		long l = 1;
		while(j < question){
			if(k == question){
				answer = true;
				break;
			} else{
				k = j + k;
				j = l;
				l = k;
			}
		}
		return answer;
	}
}