public class Factor{
        public static void main(String[] args){
                long primeFactor = Long.parseLong(args[0]);
                for(int i = 2; i * i <= primeFactor; i++){
                        while(primeFactor % i == 0){
                                System.out.print(i + ", ");
                                primeFactor /= i;
                        }
                }
                if(primeFactor > 1){
                        System.out.println(primeFactor);
                } else{
                        System.out.println("");
                }
        }
}
