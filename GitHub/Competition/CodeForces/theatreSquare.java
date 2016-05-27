import java.util.Scanner;

public class theatreSquare{
	public static void main(String[] args){
		Scanner t = new Scanner(System.in);
		long n = t.nextLong();
		long m = t.nextLong();
		long a = t.nextLong();
		long total = makeGrid(n, m, a);
		System.out.println(total);
	}
	
	public static long makeGrid(long a, long b, long c){
		long length;
		long width;
		long area;
		if(b % c == 0){
			length = b / c;
		} else{
			length = (b / c) + 1;
		}
		if(a % c == 0){
			width = a / c;
		} else{
			width = (a / c) + 1;
		}
		area = length * width;
		return area;
	}
}
