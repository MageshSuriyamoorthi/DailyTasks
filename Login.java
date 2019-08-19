package industry;

import java.util.Scanner;

public class Login {
	public static void login() throws CustomException1 {
		Scanner scan = new Scanner(System.in);
		String Sector[] = { "Finance", "IT", "Developer", "Tester" };
		String SectorPasswrd[] = { "a4.asd@123", "a4.abc@123", "a4.zxc@234", "a5.abcd@23" };
		System.out.println("enter username");
		String user_name1 = scan.nextLine();
		System.out.println("enter password");
		String password1 = scan.nextLine();
		if (Sector.equals("Finance") && SectorPasswrd.equals("a4.asd@123")) {
			System.out.println("login successfully");
			EmpMenu Emp = new EmpMenu();
			Emp.Menu();
		} else if (Sector.equals("IT") && SectorPasswrd.equals("a4.abc@123")) {
			System.out.println("login successfully");
			EmpMenu Emp = new EmpMenu();
			Emp.Menu();
		} else if (Sector.equals("Developer") && SectorPasswrd.equals("a4.zxc@234")) {
			System.out.println("login successfully");
			EmpMenu Emp = new EmpMenu();
			Emp.Menu();
		} else if (Sector.equals("Tester") && SectorPasswrd.equals("a5.abcd@23")) {
			System.out.println("login successfully");
			EmpMenu Emp = new EmpMenu();
			Emp.Menu();
		} else {
			System.out.println("Username or password is Incorrect type valid username or password");
			login();
		}
	}
}
