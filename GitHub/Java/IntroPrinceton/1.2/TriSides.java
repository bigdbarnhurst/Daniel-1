public class TriSides{
  public static void main(String[] args){
    double first = Double.parseDouble(args[0]);
    double sec = Double.parseDouble(args[1]);
    double third = Double.parseDouble(args[2]);
    boolean tripot = (first + sec >= third) && (sec + third >=first) && (first + third >= sec);
    System.out.println(tripot);
  }
}
