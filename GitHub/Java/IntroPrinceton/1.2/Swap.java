public class Swap{
        public static void main(String[] args){
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c;
                c = b;
                b = a;
                a = c;
                System.out.println("A = " + a + ". B = " + b + ".");
        }
}
