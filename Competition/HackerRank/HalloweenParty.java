import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class HalloweenParty {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long i = 0; i < t; i++){
            System.out.println(Solve(in.nextLong()));
        }
    }
    
    private static long Solve(long k){
		long solution;
		if(k % 2 == 0){
			solution = (k/2) * (k/2);
		} else{
			solution = (k/2 + 1) * (k/2);
		}
		return solution;
    }
    
    
}
