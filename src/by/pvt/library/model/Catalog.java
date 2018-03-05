package by.pvt.library.model;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Catalog {

	private Book[] books;
	private String title;
	private Date createDate;

	public Catalog() {
		super();
	}

	public Catalog(Book[] books, String title, Date createDate) {
		super();
		this.books = books;
		this.title = title;
		this.createDate = createDate;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String toString() {
		return String.format("Catalogs title: %s, create date: %s", getTitle(), getDate());
	}

	// TODO is it the correct way to set date??
	private String getDate() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, new Locale("BY"));
		return df.format(new Date());

	}
}
