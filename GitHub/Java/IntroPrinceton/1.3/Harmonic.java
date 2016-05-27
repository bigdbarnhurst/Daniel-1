public class Harmonic{
        public static void main(String [] args){
                int count = Integer.parseInt(args[0]);
                double sum = 0;
                for(int i = 1; i <= count; i++){
                        sum = sum + (1.0 / i);
                }
                System.out.println(sum);
        }
}
