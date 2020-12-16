package DateTime;
import java.time.LocalDate;

public class Birthday {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1995,12,13);
		int count = 0;
		for (LocalDate y = birthday; y.isBefore(today); y= y.plusYears(1)) {
			if(y.isLeapYear()) {
				count++;
			}
		}
		System.out.println("生まれてから今までのうるう年は" + count + "回です");
	}

}