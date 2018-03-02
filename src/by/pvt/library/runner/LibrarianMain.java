package by.pvt.library.runner;

import by.pvt.library.logic.LibraryService;
import by.pvt.library.logic.impl.CityLibraryServiceImpl;
import by.pvt.library.model.Book;
import by.pvt.library.model.Catalog;

public class LibrarianMain {

	public static void main(String[] args) {
		LibraryService service = new CityLibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);
	}

	private static void viewCatalogInfo(Catalog catalog) {
		for (Book book : catalog.getBooks()) {
			System.out.println(book);
		}
	}
}
