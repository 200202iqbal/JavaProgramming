package Lambda2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

interface Predicate
{
	boolean test(Book book);
}

class Book
{
	private String code;
	private String language;
	private String author;
	private LocalDate date;
	private int price;

	public Book (String code, String language, String author, LocalDate date, int price)
	{
		this.code= code;
		this.date=date;
		this.language = language;
		this.price = price;
		this.author= author;
	}

	public String toString()
	{
		return "Book: ( code = " + code + ", language = " + language + ", author = " + author
				+ ", date = " + date + ", price = " + price + ")";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}


public class BookListSample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Book> list = Arrays.asList
				( new Book ("120","German", "Janzen", LocalDate.of(2017, 9, 18),1500),
				  new Book("310", "japanese", "田中宏", LocalDate.of(2018,3,5), 5500),
				  new Book("400", "english", "Alcott", LocalDate.of(2018,2,11), 4500),
				  new Book("100", "japanese", "森下花", LocalDate.of(2018,1,10), 2200),
				  new Book("410", "english", "Hunter", LocalDate.of(2017,12,11), 5500)
				  );
		// 入力したBookListをすべて表示する
				list.forEach(System.out::println);
				System.out.println();
				// 値段の高い順にならべかえて、BookList をすべて表示する。
				// CompLambdaを参考に以下にプログラムを書いてください。
				list.sort((o1,o2) -> o2.getPrice() - o1.getPrice());
				list.forEach(System.out::println);


			}
		// 最初は使わないのでコメントにしてあります。のちに使います。
//			public static void listup(List<Book> list, Predicate p) {
//				for(Book book :list) {
//					if(p.test(book)) {
//						System.out.println(book);
//					}
//				}
//			}

}
