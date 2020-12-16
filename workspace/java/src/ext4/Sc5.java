package ext4;
import java.util.Scanner;

public class Sc5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner (System.in);
		//文字列(一行)
		System.out.println("文字列(一行) ?");
		String ln = sc.nextLine();
		System.out.println("文字列(一行) : " + ln);
		
		//整数
		System.out.println("整数 ? ");
		int n = sc.nextInt();
		System.out.println("整数 : " + n);
		
		//文字
		System.out.println("文字列 (空白が区切り) ?");
		String str = sc.next();
		System.out.println("文字列 (空白が区切り) : " + str );
		
		//小数点
		System.out.println("浮動小数点 ?");
		double db = sc.nextDouble();
		System.out.println("浮動小数点 ?" + db);
		
		
	}

}
