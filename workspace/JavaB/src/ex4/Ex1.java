package ex4;

public class Ex1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] array = new int [2][3];
		int[][] score = new int [][] {{10,20,30}, {30,40,50}};
		
		for ( int j = 0; j < score.length ; j++) {
			for (int i = 0; i< score[0].length ; i++)
			{
			System.out.print(score[j][i] + "\t");
		}
			System.out.println();
		
	}

}}
