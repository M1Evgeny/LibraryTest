package by.pvt.library.dao.impl;

import by.pvt.library.dao.BookDao;
import by.pvt.library.model.Book;

public class FileBookDaoImpl implements BookDao {

	@Override
	public Book[] readAll() {
		Book[] books = new Book[100];
		// change this code: take books from library.txt file
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		books[3] = new Book();
		books[4] = new Book();

		return books;
	}

}
