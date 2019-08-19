package industry;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of employee Details to be entered");
		int number = scan.nextInt();
		int[] a = new int[number];
		InputStream in = System.in;
		for (int initial = 0; initial < a.length; initial++) {
			System.out.println("Enter the details of the Employee:" + (initial + 1));
			System.out.println("enter the id ");
			String id = scan.next();
			System.out.println("Name:");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Gender:");
			String gender = scan.next();
			System.out.println("Age:");
			String age = scan.next();
			System.out.println("Phoneno:");
			String phoneno = scan.next();
			System.out.println("JoiningDate: ");
			String joiningDate = scan.next();
			System.out.println("Experience: ");
			String experience = scan.next();
			System.out.println("Skills:");
			String skills = scan.next();

			BufferedWriter bw = new BufferedWriter(
					new FileWriter("D:\\eclipse-workspace\\Training\\src\\industry\\SecureDetails.txt", true));
			String s = id + "," + name + "," + gender + "," + age + "," + phoneno + "," + joiningDate + "," + experience
					+ "," + skills + " \n";
			bw.write(s);
			bw.flush();
		}
		System.out.println("would you like to fetch details of employee or not");
		System.out.println("1.Yes  2.No");
		int opto = scan.nextInt();
		switch (opto) {
		case 1:
			Fetch.main(args);
		case 2:
			break;
		}
	}

}
