public class Ordered{
    public static void main(String [] args){
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);
        boolean b = (first < second && second < third
                    || first > second && second > third);
        System.out.println(b);
    }
}
