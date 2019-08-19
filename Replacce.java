package industry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replacce {
	static void wordReplace(String filePath, String old, String newWord) {
		File file = new File(filePath);
		String replacingWord = "";
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String read = reader.readLine();
			while (read != null) {
				replacingWord = replacingWord + read + System.lineSeparator();
				read = reader.readLine();
			}
			String Change = replacingWord.replaceAll(old, newWord);
			writer = new FileWriter(file);
			writer.write(Change);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		wordReplace("D:\\\\Atmecs1.txt", "ATMECS", "Company");
	}
}
