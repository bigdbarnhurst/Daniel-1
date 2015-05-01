class Comparison{
	public static void main(String[] args){
		int[] Num = {
			10, 20, 10, 20, 30, 10, 30
		};
		if(Num[1] == Num[2])
			System.out.print("True");
			
		System.out.println("");
		
		if(Num[1] == Num[3])
			System.out.print("True");
			
		System.out.println("");
		
		if(Num[3] > Num[4])
			System.out.print("True");
			
		System.out.println("");
		
		if(Num[5] <= Num[4])
			System.out.println("True");
		
		boolean iforthen;
		String result;
		
		if((Num[2] == Num[4]) || (Num[2] >= Num[3]));
			iforthen = true;
		
		result = iforthen ? "Great" : "Boo!";
		
		System.out.println("Boolean iforthen is " + iforthen);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Instances");
		System.out.println("");
		
		Shape A1 = new Circle();
		Shape A2 = new Square();
		Shape A3 = new Rectangle();
		
		System.out.println("A1 is a Circle: " + (A1 instanceof Circle));
		System.out.println("A2 is a Circle: " + (A2 instanceof Circle));
		System.out.println("A3 is a Rectangle: " + (A3 instanceof Rectangle));
		System.out.println("A2 is a Rectangle: " + (A2 instanceof Rectangle));
	}
}

interface Shape{}
class Circle implements Shape{}
class Square extends Rectangle implements Shape{}
class Rectangle implements Shape{}

