import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
		int i = 0,j = 0;
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		long n[] = new long[t];
	
		while(i < t){
			n[i] = s.nextLong();
			i++;
		}
		
		i = 0;
		long count = 0;
		
		while(i < t){
			for (j = 5; n[i]/j >= 1; j *= 5){	
			count += n[i]/j;
			}
			System.out.println(count);
			count=0;
			i++;
		}
		
		s.close();
	}
} 