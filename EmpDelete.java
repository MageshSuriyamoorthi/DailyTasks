package industry;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpDelete {
	Scanner sc = new Scanner(System.in);

	public ArrayList<String[]> delete(ArrayList<String[]> employe) {
		if (employe.isEmpty()) {
			System.out.println("Employee Details are null");
			return null;
		} else {
			System.out.println("Enter the Employee id to find the Employee");
			int Empid = sc.nextInt();
			for (int inital = 0; inital < employe.size(); inital++) {
				String[] Temp = employe.get(inital);
				if (Temp[0].equals(Integer.toString(Empid))) {
					System.out.println("Successfully Deleted Employee_id" + Temp[0]);
					employe.remove(inital);
				}
			}
			return employe;
		}
	}
}