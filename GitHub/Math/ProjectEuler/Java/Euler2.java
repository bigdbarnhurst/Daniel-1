class Euler2{
	public static void main(String[] args){
		int oldfib = 1;
		int newfib = 1;
		int sum = 0;
		while(newfib < 4000000){
			newfib = oldfib + newfib;
			oldfib = newfib - oldfib;
			if(newfib % 2 == 0){
				sum += newfib;
			}
		}
		System.out.println(sum);
	}
}
