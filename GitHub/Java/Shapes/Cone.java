import java.util.*;

public class Cone {
	public static void coneRadius(){
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the radius of your cone:");
		double radius = start.nextDouble();
		System.out.println("Enter the height of your cone:");
		double height = start.nextDouble();
		double volume = (1.0/3.0) * Math.PI * height * Math.pow(radius, 2);
		double surfarea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
		double slantheight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
		double basarea = Math.PI * Math.pow(radius, 2);
		System.out.println("The volume of your cone is:");
		System.out.println(volume);
		System.out.println("The surface area of your cone is:");
		System.out.println(surfarea);
		System.out.println("The slant height of your cone is:");
		System.out.println(slantheight);
		System.out.println("The base area of your cone is:");
		System.out.println(basarea);
	}

	
}
