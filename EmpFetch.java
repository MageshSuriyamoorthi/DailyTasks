package industry;

import java.util.ArrayList;

public class EmpFetch extends EmpCreate {
	public void empFetch(ArrayList<String[]> emp) {
		if (emp.isEmpty()) {
			System.out.println("There is no Table");
		} else {
			System.out.println("Enter the Employee id to start to fetch");
			int empid = sc.nextInt();
			for (int inital = 0; inital < emp.size(); inital++) {
				String[] Temp = emp.get(inital);
				if (Temp[0].equals(Integer.toString(Empid))) {

					for (String fet : Temp) {
						System.out.printf(fet + "\t\t");
					}
					System.out.println();
				}

			}
		}
	}
}