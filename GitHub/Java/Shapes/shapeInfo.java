import java.util.*;

public class shapeInfo {

	public static void main(String[] args) {
		int x = 12;
		Scanner start = new Scanner(System.in);
		System.out.println("Choose your shape:");
		System.out.println("1. Cube\n2. Sphere\n3. Cone");
		x = start.nextInt();
		int y;
			
		switch(x){
			
		case 1:	System.out.println("Choose which information you have:");
			System.out.println("1. Side length\n2. Volume"); 
			y = start.nextInt();
			
			switch(y){
			
				case 1: new Cube().cubeSide();
					break;
					
				case 2: new Cube().cubeVol();
					break;
					
				default: System.out.println("That is not in the range of options.");
					 break;
				}
				break;
					
		case 2: System.out.println("Chosse which information you have:");
			System.out.println("1. Radius\n2. Volume");
			y = start.nextInt();
			
			switch(y){
			
				case 1: new Sphere().sphereRadius();
					break;
					
				case 2: new Sphere().sphereVol();
					break;
				
				default: System.out.println("That is not in the range of options");
					 break;
				}
				break;
				
		case 3:	System.out.println("Choose which information you have:");
				System.out.println("1. Radius, Height"); 
				y = start.nextInt();
			
				switch(y){
			
					case 1: new Cone().coneRadius();
						break;
				}
				break;
				
				
		default: System.out.println("That is not in the range of options.");
				break;
    }

  }
}


