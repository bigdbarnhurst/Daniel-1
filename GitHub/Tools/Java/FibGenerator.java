import java.util.*;
import java.math.*;

class FibGenerator{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the number of the Fibonnaci sequence of the nth term:");
		int nth = start.nextInt();
		System.out.println("Start at 1 or 0?");
		int begin = start.nextInt();
		BigInteger oldfib0 = new BigInteger("0");
		BigInteger oldfib1 = new BigInteger("1");
		BigInteger newfib = new BigInteger("1");
		long count = 2;
		if(begin > 1 || begin < 0){
			System.out.println("Nice try! I'm not that talented yet");
			System.exit(0);
		}
		if(begin == 0){
			while(count <= nth){
				newfib = oldfib0.add(newfib);
				oldfib0 = newfib.subtract(oldfib0);
				count++;
			}
		System.out.println("The " + nth + " Fibonnaci number starting at " + begin + " equals:");
		System.out.println(newfib);			
		}
		if(begin == 1){
			while(count <= nth){
				newfib = oldfib1.add(newfib);
				oldfib1 = newfib.subtract(oldfib1);
				count++;
			}
		System.out.println("The " + nth + " Fibonnaci number starting at " + begin + " equals:");
		System.out.println(newfib);
		}
	}
}