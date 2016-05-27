import java.util.*; 
import java.io.*;

class FirstFactorial {  
  public static int firstFactorial(int num) {
	int sum = 1;
    for(int i = num; i > 0; i--){
      sum = i * sum;
    }
    return sum;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    System.out.println("Enter a number to factorialize:");
    int input = s.nextInt();
    int sumnum = firstFactorial(input);    
    System.out.print(sumnum); 
  }   
  
}
