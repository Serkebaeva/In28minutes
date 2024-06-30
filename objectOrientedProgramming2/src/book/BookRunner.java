package book;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOP with java", "Ranga");
		System.out.println(book);
		book.addReview(new Review(10, "Great book", 5));
		System.out.println(book);
		book.addReview(new Review(101, "awesome", 5));
		System.out.println(book);

	}

}
