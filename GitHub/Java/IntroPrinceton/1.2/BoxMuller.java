public class BoxMuller{
  public static void main(String[] args){
    double u = 2.0 * Math.random() - 1.0;
    double v = 2.0 * Math.random() - 1.0;
    double gauss = Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u)/Math.log(10));
    System.out.println(gauss);
  }
}
