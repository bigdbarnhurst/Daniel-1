public class TrigPy{
  public static void main(String[] args){
    Double angle = Double.parseDouble(args[0]);
    Double square = Math.pow(Math.sin(angle), 2) + Math.pow(Math.cos(angle), 2);
    System.out.println("The square trig identity for your angle is:");
    System.out.println(square);
    System.out.println("Suprise!");
  }
}
