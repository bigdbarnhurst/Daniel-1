import java.util.*;
import java.math.*;

class SnapeLadder{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		int count = start.nextInt();
		while(count >= 1){
			double separation = start.nextDouble();
			double leftside = start.nextDouble();
			double longright = calculateLongRight(leftside, separation);
			double shortright = calculateShortRight(leftside, separation);
			System.out.println(shortright);
			System.out.println(longright);
			count--;
		}
	}
	
	public static double calculateLongRight(double ls, double b){
		double rs = Math.sqrt(Math.pow( ls, 2) + Math.pow(b, 2));
		return rs;
	}
	
	public static double calculateShortRight(double ls, double b){
		double rs = Math.sqrt(Math.pow(ls, 2) - Math.pow(b, 2));
		return rs;
	}
}