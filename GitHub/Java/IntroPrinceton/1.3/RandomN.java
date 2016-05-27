public class RandomN{
        public static void main(String[] args){
                int n = Integer.parseInt(args[0]);
                double sum = 0;
                for(int i = 0; i < n; i++){
                        sum = sum + Math.random();
                }
                double average = sum / n;
                System.out.println(average);
        }
}
