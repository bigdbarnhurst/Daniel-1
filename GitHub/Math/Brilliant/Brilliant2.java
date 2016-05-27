public class Brilliant2 {
	public static void main (String args[]) {
		int trial = 0;
		for(trial = 0; ; trial++){
			if(
				trial % 2 == 1 &&
				trial % 3 == 2 &&
				trial % 4 == 3 &&
				trial % 5 == 4 &&
				trial % 6 == 5 &&
				trial % 7 == 6 &&
				trial % 8 == 7 &&
				trial % 9 == 8 &&
				trial % 10 == 9){
				break;
			}	
		}
		System.out.println("Is it the number?");
		System.out.println(trial);
	}
}

