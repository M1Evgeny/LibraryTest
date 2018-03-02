package by.pvt.library.model;

public class Book {
	private int id;
	private String Title;
	private int year;
	private Author author;

	public Book() {

	}

	public Book(int id, String title, int year) {
		super();
		this.id = id;
		Title = title;
		this.year = year;
	}

	public Book(int id, String title, int year, Author author) {
		super();
		this.id = id;
		Title = title;
		this.year = year;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return String.format("Books title = %s, id = %s, year = %s, %s",
				getTitle(), getId(), getYear(), author);

	}

}
