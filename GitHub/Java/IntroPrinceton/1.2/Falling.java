public class Falling{
  public static void main(String[] args){
    double x = Double.parseDouble(args[0]);
    double v = Double.parseDouble(args[1]);
    double t = Double.parseDouble(args[2]);
    double g = 9.800722;
    double height = x + v*t - .5 * g * t*t;
    System.out.println(height);
  }
}
