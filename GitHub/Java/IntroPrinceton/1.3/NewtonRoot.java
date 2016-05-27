public class NewtonRoot{
        public static void main(String[] args){
                double func = Double.parseDouble(args[0]);
                int nth = Integer.parseInt(args[1]);
                int constant = (int) func;
                double guess = func;
                for(int i = 0; i <= 10000; i++){
                        guess = guess - (rooter(nth, guess, constant) / diffRoot(nth, guess));
                }
                System.out.println(guess);
        }

        public static double rooter(int k, double num, int constant){
                return (Math.pow(num, k) - constant);
        }

        public static double diffRoot(int k, double num){
                return (k * Math.pow(num, (k-1)));
        }
}
