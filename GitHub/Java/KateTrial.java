import java.util.*;

public class KateTrial{
	public static void main(String[] args){
		System.out.println("Does Kate work correctly?");
		Scanner start = new Scanner(System.in);
		int p = start.nextInt();
		int po = p % 4;
		System.out.println(po);
	}
}