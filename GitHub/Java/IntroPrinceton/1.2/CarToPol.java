public class CarToPol{
  public static void main(String[] args){
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double r = Math.sqrt(x*x + y*y);
    double angle = Math.atan2(y, x);
    System.out.print("Radius: ");
    System.out.println(r);
    System.out.print("Angle: ");
    System.out.println(angle);
  }
}
