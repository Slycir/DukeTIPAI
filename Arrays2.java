public class Arrays2{
	public static void main(String[] args){
		int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(sum2d(array2));
	}//main
	
	public static int sum2d(int[][] array){
		int num1 = 0;
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				num1 = num1 + array[i][j];
			}//for
		}//for
		return num1;
	}//sum2d
}//class