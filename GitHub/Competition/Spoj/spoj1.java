import java.util.Scanner;

public class spoj1{
	public static void main(String[] args){
		Scanner universe = new Scanner(System.in);
		while(true){
			int answer = universe.nextInt();
			if(answer == 42){
				break;
			} else{
				System.out.println(answer);
			}
		}
	}
}
