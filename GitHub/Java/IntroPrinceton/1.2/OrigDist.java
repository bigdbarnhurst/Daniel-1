public class OrigDist{
  public static void main(String[] args){
    double coor1 = Double.parseDouble(args[0]);
    double coor2 = Double.parseDouble(args[1]);
    double distance = Math.sqrt(coor1*coor1 + coor2*coor2);
    System.out.println(distance);
  }
}
