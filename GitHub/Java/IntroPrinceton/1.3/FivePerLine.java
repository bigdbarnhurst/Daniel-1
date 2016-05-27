public class FivePerLine{
        public static void main(String[] args){
                int i = 1000;
                while(i <= 2000){
                        if(i % 5 == 0){
                                System.out.println(i + " ");
                                i++;
                        } else{
                                System.out.print(i + " ");
                                i++;
                        }
                }
        }
}
