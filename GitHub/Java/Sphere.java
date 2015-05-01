import java.util.*;

public class Sphere {
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the radius of your sphere:");
		double radius = start.nextDouble();
		double volume = (4.0/3.0) * Math.pow(radius, 3) * Math.PI;
		double surfarea = 4 * Math.pow(radius, 2) * Math.PI;
		System.out.println("The volume of your sphere is:");
		System.out.println(volume);
		System.out.println("The surface area of your sphere is:");
		System.out.println(surfarea);
	}
}
