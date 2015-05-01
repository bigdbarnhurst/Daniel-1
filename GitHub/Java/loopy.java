public class loopy{
	
	public static void main(String args[]){
		double x;
		x = 1.0000000000001;
		while(x < 10000000E78){
			x = x * 1.00000000000001;
		}
		
		System.out.println(x);
	}
}
