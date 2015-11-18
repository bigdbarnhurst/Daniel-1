public class RanBetw{
  public static void main(String[] args){
    int first = Integer.parseInt(args[0]);
    int last = Integer.parseInt(args[1]);
    int range = (int) ((last - first) * Math.random());
    int destination = range + first;
    System.out.println(destination);
  }
}
