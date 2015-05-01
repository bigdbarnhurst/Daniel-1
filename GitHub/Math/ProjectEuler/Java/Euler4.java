public class Euler4 {
	public static void main(String[] args){
		int product = 0;
		int factor1 = 1000;
		int factor2 = 1000;
		int reversed = 0;
		while(factor1 > 0){
			while(factor2 > 0){
				product = factor1 * factor2;
				reversed = reverser(product);
				System.out.println(reversed);
				if(product == reversed){
					System.out.println(product);
					break;
				}else{
					factor2--;
				}
			}	
			if(product == reversed){
					break;
				}else{
					--factor1;
				}
		}
	}
	
	 public static int reverser(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
          
        }while(number > 0);
      
        return reverse;
    }
}
