package by.pvt.library.runner;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MainApp {
	private static final String file = "resources/sample.txt";

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		try (InputStream is = new FileInputStream(file)) {
			int count;
			byte[] bytes = new byte[1024];
			do {
				count = is.read(bytes);
				// count = is.read();
				// System.out.print((char) (count));
			} while (count > 0);
			System.out.println(new String(bytes));
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println();

		try (Reader reader = new FileReader(file)) {
			int count2;
			char[] chars = new char[1024];
			do {
				count2 = reader.read(chars);
				// count2 = reader.read();
				// System.out.print((char) (count2));
			} while (count2 > 0);
			System.out.println(new String(chars));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
