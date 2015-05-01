import java.util.*;
import java.math.*;

class SmallFactorials{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		int test = start.nextInt();
		for(int i = 0; i < test; i++){
			int n = start.nextInt();
			BigInteger fact = new BigInteger("1");
			for(int j = n; j > 0; j--){
				fact = fact.multiply(BigInteger.valueOf(j));
			}
			System.out.println(fact);
		}
	}
}