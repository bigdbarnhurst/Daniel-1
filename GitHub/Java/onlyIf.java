public class onlyIf{
	
	public static void main(String args[]) {
		int [] grades = 
		{12, 50, 39, 70, 85, 91, 100};
		int num = 3;
		
		if(grades[num] >= 90){
			System.out.println("A");
		}	else if(grades[num] >= 80){
			System.out.println("B");
		}	else if(grades[num] >= 70){
			System.out.println("C");
		}	else if(grades[num] >= 60){
			System.out.println("D");
		}	else{
			System.out.println("Fail!");
		}	
	}
}

