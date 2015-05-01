public class Euler12{
	public static void main(String[] args){
		long triangle = 1;
		long count = 0;
		for(long j = 1; true; j++){
			triangle = (j * (j + 1)) / j;
			for(long i = 1; (i * i ) <= triangle; i++){
				if(triangle % i == 0){
					count++;
				}
				
			}
			count = count * 2;
			if(count >= 500){
				System.out.println(triangle);
				break;
			} else{
				count = 0;
			}
		}
	}
}