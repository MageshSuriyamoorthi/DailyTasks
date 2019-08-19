package industry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpMenu {
//declare the list for store the Employee Details Array
	ArrayList<String[]> EmployeeData = new ArrayList<String[]>(100);

	public void Menu() {
		int options;
		Scanner scan = new Scanner(System.in);
		loop: do {
			System.out.println("MENU");
			System.out.println(" 1. Create Employee\n 2. Fetch Employee\n 3. Delete\n 4.search\n 5. Logout");
			System.out.println("Choose the options");
			options = scan.nextInt();

			switch (options) {
			case 1:
				EmpCreate createEmp = new EmpCreate();
				try {
					try {
						EmployeeData.addAll(createEmp.PersonalDetails());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (CustomException1 e) {
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println(" Only By Id\n ");
				int id = scan.nextInt();
				EmpSearch searchs = new EmpSearch();
				String Empid = scan.next();
				searchs.Search(EmployeeData, Empid);

				break;
			case 3:
				EmpDelete delete = new EmpDelete();
				delete.delete(EmployeeData);
				break;
			case 4:
				System.out.println(" 1. By Name\n 2. By Employee Designation\n ");
				System.out.println("Choose the options");
				int id1 = scan.nextInt();
				EmpSearch search = new EmpSearch();
				switch (id1) {
				case 1:
					System.out.println("Enter the name to find the Employee's");
					String Empname = scan.next();
					search.Search(EmployeeData, Empname);

					break;
				case 2:

					System.out.println("Enter the Designation to find the Employee's");
					String Designation = scan.next();
					search.Search(EmployeeData, Designation);
					break;
				}
				break;
			case 5:
				System.out.println("Logout successfully");
				break loop;
			}
		} while (true);
		Login log = new Login();
		try {
			log.login();
		} catch (CustomException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan.close();
	}
}
