import java.util.*; 
import java.io.*;

class Function {  
  boolean PowersofTwo(int num) {
    boolean div2 = false;
    while(num > 1){
      if(num % 2 == 0){
        num = num / 2;
      } else{
        break;
      }
    }
    if(num == 1){
      div2 = true;
    } else{
      div2 = false;
    }
    return div2;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    int input = s.nextInt();
    boolean power2 = PowersofTwo(input);
    System.out.print(power2); 
  }   
  
}
