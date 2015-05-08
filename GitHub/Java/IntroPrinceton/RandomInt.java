class RandomInt{
        public static void main(String[] args){
                int max = Integer.parseInt(args[0]);
                double confused = Math.random();
                int special = (int) (max * confused);
                System.out.println("Your random number between 0 and " + max + " is:");
                System.out.println(special);
        }
}