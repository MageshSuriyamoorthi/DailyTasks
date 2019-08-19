package industry;

import java.util.ArrayList;

class Detailas {
	protected ArrayList<String[]> values() {
		ArrayList<String[]> EmployeeData = new ArrayList<String[]>(100);
		String Emplo1[] = { "1122", "nita", "22", "developer", "java", "50000" };
		String Emplo2[] = { "1011", "magess", "23", "tester", "selenium", "55000" };
		EmployeeData.add(Emplo1);
		EmployeeData.add(Emplo2);

		return EmployeeData;
	}
}