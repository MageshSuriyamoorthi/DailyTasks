package industry;

import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) throws Exception 
	{
		Login login = new Login();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter option to access");
		System.out.println("1.normal Employee Details   2.File handling Employee Details");
		int Opt = scan.nextInt();
		Input input=new Input();
		switch (Opt) {
		case 1:
			System.out.println("EMPLOYEE MANAGEMENT");
			try {
				Login.login();
			} catch (CustomException1 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case 2:
		System.out.println("EMPLOYEE MANAGEMENT THROUGH FILE HANDLING");
			
		input.main(args);
	}
}
}