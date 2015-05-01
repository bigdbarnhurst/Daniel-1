import java.util.Scanner;

class FactorialZ{
	public static void main(String[] args){
		Scanner start = new Scanner(System.in);
		int test = start.nextInt();
		int test1 = test;
		long[] testArray;
		long[] secondArray;
		testArray = new long[test];
		secondArray = new long[test];
		for(int i = 0; i < test; i++){
			testArray[i]=start.nextLong();
		}
		int p = test - 1;
		while(p >= 0){
			secondArray[p] = factorZero(testArray[p]);
			p--;
		}
		for(int i = 0; i < test1 ; i++){
			System.out.println(secondArray[i]);
		}
	}


	public static long factorZero(long x){
		long count = 0;
		for(int i = 5; i <= x; i *= 5){
			count = count + x/i;
		}
		return count;
	}
}