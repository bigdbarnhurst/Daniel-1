public class Loan{
  public static void main(String[] args){
    double p = Double.parseDouble(args[0]);
    double r = Double.parseDouble(args[1]);
    double t = Double.parseDouble(args[2]);
    double money = p * Math.exp(r*t);
    System.out.println(money);
  }
}
