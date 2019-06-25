import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(toArray("Hello World!!")));
		int[] input = {2, 7, 6, 8, 10, 24};
		System.out.println(allEven(input));
		int[] input1 = {7, 3, 19, 0, 12, 1, 109, 77, 66, -34};
		System.out.println(Arrays.toString(increasing(input1)));
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
	
	public static int[] increasing(int[] para) {
		int num1 = 0;
		int num2 = 0;
		int[] randNum = para;
		int girth2 = randNum.length;
		for(int i = 0; i < girth2; i++) {
			for(int w = 1; w <= girth2 - 1; w++) {
				num1 = randNum[w - 1];
				num2 = randNum[w];
				if(num2 < num1) {
					randNum[w] = num1;
					randNum[w - 1] = num2;
				}
			}
		}
		return randNum;
	}
}