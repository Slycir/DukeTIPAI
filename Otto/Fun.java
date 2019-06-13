import java.util.Scanner;

public class fun {
	public static void main(String[] args) {
		Scanner in;
		in = new Scanner(System.in);
		System.out.println("Enter a word:");
		String response = in.nextString();
		lineSpace();
		System.ou.println(response);
	}//main
	
	public static void lineSpace() {
		System.out.println("      ");
	}//lineSpace 
	
}//Fun