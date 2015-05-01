import java.util.*;

public class Sphere {
	public static void sphereRadius(){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the radius of the sphere:");
		double radius = start.nextDouble();
		double volume = (4.0/3.0) * Math.pow(radius, 3.0) * Math.PI;
		double surfarea = 4.0 * Math.pow(radius, 2.0) * Math.PI;
		double circum = 2.0 * Math.PI * radius;
		System.out.println("The volume of your sphere is:");
		System.out.println(volume);
		System.out.println("The surface area of your sphere is:");
		System.out.println(surfarea);
		System.out.println("The circumference of your sphere is:");
		System.out.println(circum);
	}
	
	public static void sphereVol(){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the volume of the sphere:");
		double volume = start.nextDouble();
		double radius = Math.pow(((3.0 * volume) / 4. * Math.PI), (1.0/3.0));
		double surfarea = 4.0 * Math.pow(radius, 2.0) * Math.PI;
		double circum = 2.0 * Math.PI * radius;
		System.out.println("The radius of your sphere is:");
		System.out.println(radius);
		System.out.println("The surface area of your sphere is:");
		System.out.println(surfarea);
		System.out.println("The circumference of your sphere is:");
		System.out.println(circum);
	}
}
