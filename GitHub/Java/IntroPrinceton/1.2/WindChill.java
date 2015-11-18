public class WindChill{
  public static void main(String[] args){
    double t = Double.parseDouble(args[0]);
    double v = Double.parseDouble(args[1]);
    double temp = 35.74 + .6215*t + (.4275*t - 35.75) * Math.pow(v, .16);
    System.out.println(temp);
  }
}
