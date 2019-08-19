package industry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringFind {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\Atmecs.txt");
		String[] words = null;
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		String input = "ATMECS";
		String st="COMPANY";
		int count = 1;
		while ((s = br.readLine()) != null) {
			words = s.split(" ");
			for (String word : words) {
				if (word.equals(input)) {
				 st.replaceAll( "ATMECS/Atmecs.txt", "COMPANY/Atmecs1.txt" );
					count++;
				}
			}
		}
		System.out.println(count);
	
		fr.close();
	}

}
