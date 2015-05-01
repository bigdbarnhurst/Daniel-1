import java.util.*;
import java.math.*;

class Euler25{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the digit limit:");
		int digitlimit = start.nextInt();
		BigInteger oldfib0 = new BigInteger("0");
		BigInteger newfib = new BigInteger("1");
		int count = 1;
		while(newfib.toString().length() < digitlimit){
			newfib = oldfib0.add(newfib);
			oldfib0 = newfib.subtract(oldfib0);
			count++;
		}
		System.out.println("The first Fibonnaci number with more than " + digitlimit + " digits is:");
		System.out.println(newfib);
		System.out.println("It is number " + count + " on the list.");
	}
}