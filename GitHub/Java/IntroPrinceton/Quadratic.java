public class Quadratic{
        public static void main(String[] args){
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double c = Double.parseDouble(args[2]);
                double discriminant = (Math.pow(b, 2) - 4.0 * a * c);
                double sqroot = Math.sqrt(discriminant);
                double root1 = (-b + sqroot) / (2 * a);
                double root2 = (-b - sqroot) / (2 * a);
                System.out.println("Your roots for the equation:");
                System.out.println(a + "x^2 + " + b + "x + " + c);
                System.out.println(root1);
                System.out.println(root2);
        }
}