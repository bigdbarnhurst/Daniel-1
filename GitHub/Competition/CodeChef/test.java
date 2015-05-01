public class test{
	public static void main(String[] args){
		long x = 8735373;
		long count = 0;
		for(int i = 5; i <= x; i *= 5){
			count = count + x/i;
		}
		System.out.println(count);
	}
}