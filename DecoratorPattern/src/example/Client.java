package example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Client {
	public static void main(String[] args) {
		int result = 0;
		InputStream inputStream = null;
		try {
			inputStream = new ToUpperCaseInputStream(new BufferedInputStream(new FileInputStream("file path")));

			while ((result = inputStream.read()) >= 0) {
				System.out.print((char) result);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
