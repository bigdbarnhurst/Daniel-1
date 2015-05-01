import java.util.*;
import java.math.*;

class Euler25time{
	public static void main(String[] args){
		int digitlimit = 1000;
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