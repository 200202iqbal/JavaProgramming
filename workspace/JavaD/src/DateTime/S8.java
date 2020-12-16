package DateTime;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class S8 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		DateTimeFormatter ltf = DateTimeFormatter.ofPattern("hh時mm分ss秒a");
		System.out.println(time.format(ltf));
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

	}

}