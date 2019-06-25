import java.util.Arrays;

public class Arrays3{
	public static void main(String[] args){
		int[][] aa = {{9,8,7},{6,5,4},{3,2,1}};
		int[][] bb = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(diff2d(aa, bb)));
	}//main
	
	public static int[][] diff2d(int[][] a1, int[][] a2){
		int[][] test = new int[3][3];
		for(int i = 0; i < a1.length; i++){
			for(int j = 0; j < a1[i].length; j++){
				test[i][j] = a1[i][j] - a2[i][j];
			}//for
		}//for
		return test;
	}//diff2d
}//class