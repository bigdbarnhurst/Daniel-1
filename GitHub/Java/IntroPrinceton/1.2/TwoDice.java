public class TwoDice{
  public static void main(String[] args){
    int dice1 = (int) (Math.random() * 6) + 1;
    int dice2 = (int) (Math.random() * 6) + 1;
    int sum = dice1 + dice2;
    System.out.println("Die 1 equals:");
    System.out.println(dice1);
    System.out.println("Die 2 equals:");
    System.out.println(dice2);
    System.out.println("The sum of the two dice equals:");
    System.out.println(sum);
  }
}
