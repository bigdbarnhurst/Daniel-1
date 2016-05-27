import java.util.*;

class YANG{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		int test = start.nextInt();
		for(int i = test; i > 0; i--){
			String winner;
			long begin = start.nextLong();
			winner = playGame(begin);
			System.out.println(winner);
		}
	}
	
	public static String playGame(long tall){
		if(tall % 2 == 0){
			return "ALICE";
		} else{
			return "BOB";
		}
	}
}