import java.util.Scanner;

public class HelloName{
	public static String helloName(String name) {
		String x = "Hello " + name + "!";
		return x;
	}
	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		String name = y.nextLine();
		helloName(name);
	}
}
