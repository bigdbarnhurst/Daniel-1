public class Binary{
        public static void main(String[] args){
                int number = Integer.parseInt(args[0]);
                int findMax = 1;
                while(findMax <= number){
                        findMax = findMax * 2;
                        if(findMax > number){
                                findMax = findMax / 2;
                                break;
                        }
                }
                while(findMax > 0){
                        if(findMax > number){
                                System.out.print(0);
                        } else{
                                System.out.print(1);
                                number = number - findMax;
                        }
                        findMax = findMax / 2;
                }
                System.out.println("");
        }
}
