package ex1;
import java.util.Random;
import java.util.Scanner ;
public class BranchRep9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int rnd = new Random().nextInt(6)+1;
		int inp = 0;
		int cnt = 0;
		System.out.println(rnd);
		do
		{
			if (cnt != 0)
			{
				System.out.println("違います");
			}
			System.out.print("数: ");
			inp = sc.nextInt();
			cnt++;
			
			
		}while(inp != rnd);

		System.out.println(cnt + "回目で正解です");
	}

}
