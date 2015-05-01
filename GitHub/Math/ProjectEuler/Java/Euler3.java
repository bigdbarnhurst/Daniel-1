public class Euler3{
	public static void factor(long num){
		for(long i = 1; i <= Math.sqrt(num); i++){
			long j = num % i;
			if(j == 0 && prime(i)){
				System.out.println(i);
			}
		}
	}
	public static boolean prime(long test){
		for(long i = 2; i <= Math.sqrt(test); i++){
			long k = test % i;
			if(k == 0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		long total = 600851475143L;
		factor(total);
		System.out.println("Prime factors of: " + total);
	}
}
				
