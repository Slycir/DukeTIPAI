import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(toArray("Hello World!!")));
		int[] input = {2, 7, 6, 8, 10, 24};
		System.out.println(allEven(input));
	}
	
	public static char[] toArray(String S) {
		int girth = S.length();
		char[] letts = new char[girth];
		char lett = ' ';
		for(int i = 0; i < girth; i++) {
			lett = S.charAt(i);
			letts[i] = lett;
		}
		return letts;
	}
	
	public static boolean allEven(int[] numbers) {
		int num = 0;
		int girth1 = numbers.length;
		for(int i = 0; i < girth1; i++) {
			num = numbers[i];
			if(num % 2 == 1) {
				return false;
			} else {
				
			}
		}
		return true;
	}
}