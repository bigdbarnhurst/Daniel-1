public class assign3p2{
  public static void printAmerican(String day, int date, String month, int year){
   System.out.print(day);
   System.out.print(", ");
   System.out.print(month);
   System.out.print(" ");
   System.out.print(date);
   System.out.print(", ");
   System.out.println(year);
  }
  public static void printEuropean(String day, int date, String month, int year){
    System.out.print(day);
    System.out.print(" ");
    System.out.print(date);
    System.out.print(" ");
    System.out.print(month);
    System.out.print(", ");
    System.out.println(year);
  }
  public static void main(String[] args){
    String day = "Tuesday";
    int date = 11;
    String month = "March";
    int year = 2014;
    printAmerican(day, date, month, year);
    printEuropean(day, date, month, year);
  }
}