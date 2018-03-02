package by.pvt.library.dao;

import by.pvt.library.model.Book;

//dao - data access object

public interface BookDao {
	Book[] readAll();
}
