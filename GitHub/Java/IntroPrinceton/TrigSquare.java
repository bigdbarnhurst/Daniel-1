class TrigSquare{
        public static void main(String[] args){
                double ang = Double.parseDouble(args[0]);
                double squared = Math.pow((Math.sin(ang)), 2) + Math.pow((Math.cos(ang)), 2);
                System.out.println(squared);
        }
}