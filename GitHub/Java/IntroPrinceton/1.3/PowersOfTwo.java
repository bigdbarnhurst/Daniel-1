public class PowersOfTwo{
        public static void main(String[] args){
                int limit = Integer.parseInt(args[0]);
                int power = 2;
                while(power < limit){
                        System.out.println(power);
                        power = power * 2;
                }
        }
}
