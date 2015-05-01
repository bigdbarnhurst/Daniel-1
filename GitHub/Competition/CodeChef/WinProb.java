import java.util.*;

class WinProb{
        public static void main(String[] args){
                Scanner start = new Scanner(System.in);
                int cases = start.nextInt();
                for(int i = cases; i > 0; i--){
                        double t1 = start.nextDouble();
                        double t2 = start.nextDouble();
                        double t3 = start.nextDouble();
                        double t4 = start.nextDouble();
                        double win = t1 / (t1 + t2);
                        System.out.println(win);
                }
        }
}