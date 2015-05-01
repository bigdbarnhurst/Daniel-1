import java.util.*;

public class Cube {

	public static void cubeSide() {
		double height = 0;
		double surfarea = 0;
		double volume = 0;
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the height of your cube:");
		height = start.nextDouble();
		surfarea = 6 * height * height;
		volume = Math.pow(height, 3);
		System.out.println("The surface area of your cube is:");
		System.out.println(surfarea);
		System.out.println("The volume of your cube is:");
		System.out.println(volume);

	}
	
	public static void cubeVol() {
		double height = 0;
		double surfarea = 0;
		double volume = 0;
		Scanner start = new Scanner(System.in);
		System.out.println("Enter the volume of your cube:");
		volume = start.nextDouble();
		height = Math.pow(volume, (1.0/3.0));
		surfarea = 6 * height * height;
		System.out.println("The surface area of your cube is:");
		System.out.println(surfarea);
		System.out.println("The height of your cube is:");
		System.out.println(height);
	}
}