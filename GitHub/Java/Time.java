class Time{
  public static void main(String[] args){
    int hour;
    int minute;
    int second;
    hour = 12;
    minute = 50;
    second = 45;
    System.out.println("The seconds that has passed since midnight is:");
    System.out.println((hour*60*60)+(minute*60)+(second));
    System.out.println("The number of seconds remaining in the day is:");
    System.out.println((24*60*60)-((hour*60*60)+(minute*60)+(second)));
    System.out.println("The percentage of the day that has passed is:");
    System.out.println((24*60*60)/(((24*60*60)-((hour*60*60)+(minute*60)+(second)))));
  }
}  
