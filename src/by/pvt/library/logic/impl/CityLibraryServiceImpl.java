package by.pvt.library.logic.impl;

import by.pvt.library.dao.BookDao;
import by.pvt.library.dao.impl.FileBookDaoImpl;
import by.pvt.library.logic.LibraryService;
import by.pvt.library.model.Book;
import by.pvt.library.model.Catalog;

public class CityLibraryServiceImpl implements LibraryService {
	private BookDao dao = new FileBookDaoImpl();

	@Override
	public Catalog getMainCatalog() {
		Catalog catalog = new Catalog();
		Book[] books = dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT_&_BOOK_CATALOG");
		return catalog;
	}

}
