public class BaryCenter{
    public static void main(String [] args){
        double dist = Double.parseDouble(args[0]);
        double mass1 = Double.parseDouble(args[1]);
        double mass2 = Double.parseDouble(args[2]);
        double center = dist * mass2 / (mass1 + mass2);
        System.out.println("Distance to barycenter from object 1 is: " + center);
    }
}
