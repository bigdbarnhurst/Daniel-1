public class RGBToCMYK{
  public static void main(String[] args){
    double red = Double.parseDouble(args[0]);
    double green = Double.parseDouble(args[1]);
    double blue = Double.parseDouble(args[2]);
    double white = Math.max(red/255, Math.max(green/255, blue/255));
    double cyan = (white - red/255)/white;
    double magenta = (white - green/255)/white;
    double yellow = (white - blue/255)/white;
    double black = 1 - white;
    System.out.println("White: " + white);
    System.out.println("Cyan: " + cyan);
    System.out.println("Magenta: " + magenta);
    System.out.println("Yellow: " + yellow);
    System.out.println("Black: " + black);
  }
}
