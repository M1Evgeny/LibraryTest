package by.pvt.library.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

import by.pvt.library.dao.BookDao;
import by.pvt.library.model.Author;
import by.pvt.library.model.Book;

public class FileBookDaoImpl implements BookDao {

	private static final String FILE_PATH = "resources/library.txt";
	private static final String COMMA = ",";
	private static final String NEW_LINE = "\n";

	@Override
	public Book[] readAll() {
		Book[] books = new Book[5];
		createBooks(books);
		return books;
	}

	private void createBooks(Book[] books) {
		String sentense = readFile();
		if (sentense != null && sentense != "") {
			String[] sentenses = splitInfo(sentense, NEW_LINE);
			if (books != null) {
				for (int j = 0; j < sentenses.length; j++) {
					String[] words = splitInfo(sentenses[j], COMMA);
					String[] newWords = replaseComma(words, COMMA);
					createBook(newWords, books, j);
				}
			}
		}
	}

	private String readFile() {
		String info = null;
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
			while ((info = br.readLine()) != null) {
				sb.append(info);
				sb.append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	// private String replaseComma(String sentense, String regex) {
	// String newSentens = null;
	// if (sentense != null) {
	// Matcher matcher = Pattern.compile(regex).matcher(sentense);
	// if (matcher.find()) {
	// newSentens = matcher.replaceAll("");
	// }
	// }
	// return newSentens;
	// }

	private String[] replaseComma(String[] sentense, String regex) {
		int sentenseCount = 0;
		String[] newSentense = null;
		if (sentense != null) {
			newSentense = new String[sentense.length];
			for (String s : sentense) {
				if (s != null) {
					newSentense[sentenseCount] = s.replaceAll(regex, "").trim();
					sentenseCount++;
				}
			}
		}
		return newSentense;
	}

	private String[] splitInfo(String info, String regex) {
		Pattern pattern = Pattern.compile(regex);
		return pattern.split(info);
	}

	private void createBook(String[] words, Book[] books, int bookNumber) {
		if (words != null && books != null) {
			books[bookNumber] = new Book();
			books[bookNumber].setId(parseStringToInt(words[0]));
			books[bookNumber].setTitle(words[1]);
			books[bookNumber].setYear(parseStringToInt(words[2]));
			Author author = new Author();
			author.setId(parseStringToInt(words[3]));
			author.setName(words[4]);
			author.setLastName(words[5]);
			books[bookNumber].setAuthor(author);
		}
	}

	private int parseStringToInt(String s) {
		int id = 0;
		if (s != null) {
			try {
				id = Integer.parseInt(s);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		return id;
	}

}
