package industry;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpSearch {
	Scanner scan = new Scanner(System.in);

	public void find(ArrayList<String[]> employe) {
		if (employe.isEmpty()) {
			System.out.println("Employee database is empty");
		} else {
			System.out.println("Enter Employee id to find that person");
			String EmployeeName = scan.next();
			for (int inital = 0; inital < employe.size(); inital++) {
				String[] Temp = employe.get(inital);

				if (Temp[1].equals(EmployeeName)) {
					for (String str : Temp) {
						System.out.print(str + "    ");
					}
					System.out.println("");
				}
			}
		}
	}

	public void Search(ArrayList<String[]> employe, String Designation) {
		if (employe.isEmpty()) {
			System.out.println("Employee database is empty");
		} else {
			System.out.println();
			for (int inital = 0; inital < employe.size(); inital++) {
				String[] Temp = employe.get(inital);
				if (Temp[3].equals(Designation)) {
					for (String detail : Temp) {
						System.out.printf(detail + "\t\t");
					}
					System.out.println("");
				}
			}
		}
	}

	
}
