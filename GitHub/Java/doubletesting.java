public class doubletesting{
	public static void newLine(){
		System.out.println("");
	}
	public static void fiveLines(){
		newLine(); newLine(); newLine(); newLine(); newLine();
	}
	public static void main(String[] args){
		double y = 1.145257/2.5;
		System.out.println(y);
		int x = 15;
		System.out.println(x+y-3.2);
		int z = (int) y;
		System.out.println(x+z);
		double pi = Math.PI;
		double angle = Math.sqrt(pi/x);
		double height = Math.sin(angle);
		double length = Math.cos(angle);
		System.out.println(pi);
		System.out.println(angle);
		System.out.println(height);
		System.out.println(length);
		System.out.print("The length of this triangle is ");
		System.out.println(length * x);
		System.out.print("The height of this triangle is ");
		System.out.println(height * x);
		double l = Math.sqrt(Math.pow((length * x), 2.0) + Math.pow((height * x), 2.0));
		System.out.print("The hypotenus of the triangle is ");
		System.out.println(l);
		double f = Math.exp(Math.log(10.0));
		System.out.println(f);
		System.out.print("Five lines at a time!");
		fiveLines();
		System.out.println("Oh Yeah!");
	}
}
