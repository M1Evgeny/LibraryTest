package by.pvt.library.runner;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class CopyOfMainApp {
	private static final String FILE_PATH = "resources/sample.txt";

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		try (BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(FILE_PATH))) {
			int count;
			byte[] bytes = new byte[1024];
			do {
				count = bis.read(bytes);
			} while (count > 0);
			System.out.println(new String(bytes));
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println();

		try (BufferedReader reader = new BufferedReader(new FileReader(
				FILE_PATH))) {
			String str = null;
			while ((str = reader.readLine()) != null) {
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
