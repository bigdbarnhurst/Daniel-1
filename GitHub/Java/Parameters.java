public class Parameters{
  public static void timesPi(double y){
    double x;
    x = y * Math.PI;
    System.out.println(x);
  }
  public static void whatIf(String p){
    p = "What If??????????";
    System.out.println(p);
  }
  public static void multiqs(){
    whatIf("Why?"); whatIf("Why?"); whatIf("Why?"); whatIf("Why?"); whatIf("Why?"); whatIf("Why?"); whatIf("Why?"); whatIf("Why?");
  }
  public static void main(String[] args){
    double q = Math.PI;
    timesPi(q);
    whatIf("Why?");
    System.out.println("");
    System.out.println("Huh?");
    multiqs();
    multiqs();
    multiqs();
    multiqs();
  }
}