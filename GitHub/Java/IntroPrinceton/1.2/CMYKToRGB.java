public class CMYKToRGB{
  public static void main(String[] args){
    double cyan = Double.parseDouble(args[0]);
    double magenta = Double.parseDouble(args[1]);
    double yellow = Double.parseDouble(args[2]);
    double black = Double.parseDouble(args[3]);
    int red = (int) (255 * (1-cyan) * (1-black));
    int green = (int) (255 * (1-magenta) * (1-black));
    int blue = (int) (255 * (1-yellow) * (1-black));
    System.out.println("Red = " + red);
    System.out.println("Green = " + green);
    System.out.println("Blue = " + blue);
  }
}
