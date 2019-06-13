import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(helloWorld());
		lineSpace();
		System.out.println("Enter an integer:");
		int response = in.nextInt();
		lineSpace();
		isEven(response);
		lineSpace();
		System.out.println("Enter another integer:");
		int response1 = in.nextInt();
		lineSpace();
		isAdd(response1);
	}//main
	
	public static String helloWorld() {
		return "Hello World!";
	}//helloWorld
	
	public static void isEven(int x) {
		if(x % 2 == 0) {
			System.out.println(x + " is even!");
		} else {
			System.out.println(x + " is odd!");
		}//ifElse

	}//isEven
	
	public static void isAdd(int x) {
		if(x % 2 == 0) {
			System.out.println(x + 1);
		} else {
			System.out.println(x - 1);
		}//ifElse

	}//isAdd
	
	public static void lineSpace() {
		System.out.println("      ");
	}//lineSpace 
		
}//HelloWorld