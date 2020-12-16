package Lambda;

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

	public Book(String code,String language, String author, LocalDate date, int price)
	{
		this.code = code;
		this.language = language;
		this.author = author;
		this.date = date;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "Book : [code = " + code + " ,language = " + language + " ,author = " + author +
				" , date = "+ date + " , pricee = " + price + " ]";
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
public class BookListSample1 {

	public static void main(String[] args)
	{
		List<Book> list = Arrays.asList(
				new Book("120","German","Janssen",LocalDate.of(2017, 9, 18),1500),
				new Book("310","Japanese","Tanaka",LocalDate.of(2018, 3, 5),5500),
				new Book("400","English", "Alcott",LocalDate.of(2018, 2, 11),4500),
				new Book("100","Japanese","Morishita",LocalDate.of(2018, 1, 10),2200),
				new Book("410","English","Hunter",LocalDate.of(2017, 12, 11),5500)
				);
		//listup ( list , p );
		listup(list,book -> "Tanaka".equals(book.getAuthor()));

		listup(list,book -> book.getPrice() <= 3000);
		//mencari buku dengan bahasa Inggris
		listup(list,book -> book.getLanguage().equals("English"));

		listup(list,book -> "English".equals(book.getAuthor()));
		System.out.println();
		//mencari buku dengan tanggal sebelum 2018/1/1
		listup(list, book -> book.getDate().isBefore(LocalDate.of(2018, 1, 1)));
		System.out.println();
		listup(list,book -> Integer.parseInt(book.getCode()) >= 400);
	}
	public static void listup(List<Book> list, Predicate p)
	{
		for(Book book : list)
		{
			if(p.test(book))
			{
				System.out.println(book);
			}
		}
	}

}
