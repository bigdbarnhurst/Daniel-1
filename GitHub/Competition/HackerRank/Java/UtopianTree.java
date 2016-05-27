import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt()));
        }
    }
    
    private static int Solve(int n){
		int s = 1;
		int i = n;
		do{
			if(n == 0){
				s = 1;
			} else{
				s = s * 2;
				n--;
				if(n != 0){
					s = s + 1;
					n--;
				}
			}
		} while(n > 0);
		return s;
	}  
}
