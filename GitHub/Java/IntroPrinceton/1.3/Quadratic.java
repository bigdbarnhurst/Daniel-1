public class Quadratic{
        public static void main(String[] args){
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c = Integer.parseInt(args[2]);
                double discriminant = (b*b - 4*a*c);
                double root1 = ((-b) + Math.sqrt(discriminant)) / (2 * a);
                double root2 = ((-b) - Math.sqrt(discriminant)) / (2 * a);
                if(discriminant < 0 || a == 0){
                        System.out.println("Error");
                } else{
                        System.out.println("Root 1 is: " + root1);
                        System.out.println("Root 2 is: " + root2);
                }
        }
}
