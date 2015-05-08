public class SumTriangle{
        public static void main(String[] args){
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                boolean isTriangle = (a + b >= c && b + c >= a && a + c >= b);
                System.out.println("Is it a triangle?");
                System.out.println(isTriangle);
        }
}