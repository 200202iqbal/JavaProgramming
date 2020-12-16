package DateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthday2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate today = LocalDate.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y-MM-dd eeee");
		LocalDate birth = LocalDate.of(1995,12, 13);//　自分の誕生日
		System.out.println(birth.format(fmt));
		System.out.println(today.isAfter(birth));
		
		/*JapaneseDate jtoday = JapaneseDate.from(today);
		DateTimeFormatter jfmt = DateTimeFormatter.ofPattern("Gy-MM-dd eeee");
		System.out.println(jtoday.format(jfmt));*/
	}

}
