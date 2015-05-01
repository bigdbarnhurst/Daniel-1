import java.util.*;

class PrimeSum{
        public static void main(String[] args){
                Scanner start = new Scanner(System.in);
                System.out.println("Limit for summation of prime right below a square:");
                int first = start.nextInt();
                int sum = 0;
                boolean[] primeKiller;
                        primeKiller = new boolean[first+2];
                        for(int i = 2; i <= first; i++){
                                primeKiller[i] = true;
                        }
                        for(int j = 2; (j * j) <= first; j++){
                                if(primeKiller[j]){
                                        for(int k = j; k * j <= first; k++){
                                                primeKiller[k * j] = false;
                                        }
                                }
                        }
                for(int k = 0; k <= first; k++){
                        if(primeKiller[k] == true && (Math.sqrt(k - 1) % 1) == 0){
                                sum = sum + k;
                                System.out.println(k);
                        }
                }
                System.out.println("The sum is equal to:");
                System.out.println(sum);
        }
}