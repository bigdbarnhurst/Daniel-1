import java.math.*;
import java.util.*;

class EuclidGCD{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter first number:");
		BigInteger var1 = start.nextBigInteger();
		System.out.println("Enter second number:");
		BigInteger var2 = start.nextBigInteger();
		BigInteger helper = new BigInteger("0");
		while(var1.compareTo(BigInteger.ZERO) != 0 && var2.compareTo(BigInteger.ZERO) != 0){
			if(var1.compareTo(var2) >= 0){
				helper = var2;
				var2 = var1.mod(var2);
				var1 = helper;
			} else{
				helper = var1;
				var1 = var2.mod(var1);
				var2 = helper;
			}
		}
		System.out.println("The GCD of the two numbers is:");
		if(var1.equals(BigInteger.ZERO)){
			System.out.println(var2);
		}
		if(var2.equals(BigInteger.ZERO)){
			System.out.println(var1);
		}
	}
}