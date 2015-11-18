public class Order{
  public static void main(String[] args){
    double num1 = Double.parseDouble(args[0]);
    double num2 = Double.parseDouble(args[1]);
    double num3 = Double.parseDouble(args[2]);
    boolean order = (num1 < num2 && num2 < num3) || (num1 > num2 && num2 > num3);
    System.out.println(order);
  }
}
