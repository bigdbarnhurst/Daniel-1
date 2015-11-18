public class RGBToYIQ{
  public static void main(String[] args){
    double red = Double.parseDouble(args[0]);
    Double green = Double.parseDouble(args[1]);
    double blue = Double.parseDouble(args[2]);
    red /= 255.0;
    green /= 255.0;
    blue /= 255.0;
    double y = 0.299 * red + 0.587 * green + 0.114 * blue;
    double i = 0.596 * red - 0.274 * green - 0.322 * blue;
    double q = 0.211 * red - 0.523 * green + 0.312 * blue;
    System.out.println("Y = " + y);
    System.out.println("I = " + i);
    System.out.println("Q = " + q);
  }
}
