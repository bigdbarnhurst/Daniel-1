public class IsDivis{
  public static void main(String[] args){
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    boolean divis = (num1 % num2 == 0) || (num2 % num1 == 0);
    System.out.println(divis);
  }
}
