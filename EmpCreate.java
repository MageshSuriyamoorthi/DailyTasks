package industry;

import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class EmpCreate {
	protected int Empid;
	private int EmpAge;
	private String EmpName;
	private String EmpGender;
	private String EmpEligibility;
	private int Exp;
	Scanner sc = new Scanner(System.in);
	ArrayList<String[]> EmployeeData = new ArrayList<String[]>(100);

	public ArrayList<String[]> PersonalDetails() throws CustomException1,IOException {

		System.out.println("Enter the Professional & Personal Details of Employee:");
		String[] Details = new String[6];

		for (int initial = 0; initial < Details.length; initial++) {

			if (initial == 0) {
				System.out.println("Enter the Employee id:");
				Empid = sc.nextInt();
				if (Empid == 0) {
					throw new CustomException1("Employee id never be zero");
				}
				Details[initial] = Integer.toString(Empid);
			}
			if (initial == 1) {
				System.out.println("Enter the Employee name:");
				EmpName = sc.next();
				Details[initial] = EmpName;
			}
			if (initial == 2) {
				System.out.println("Enter the Gender:");
				EmpGender = sc.next();
				Details[initial] = EmpGender;
			}
			if (initial == 3) {
				System.out.println("Enter the Employee age:");
				EmpAge = sc.nextInt();
				Details[initial] = Integer.toString(EmpAge);
			}
			if (initial == 4) {
				System.out.println("Enter the Employee Phone No:");
				int EmpNo = sc.nextInt();
				Details[initial] = Integer.toString(EmpNo);
			}
			if (initial == 6) {
				System.out.println("Enter the DOJ Employee:");
				int doj = sc.nextInt();
				Details[initial] = Integer.toString(doj);
			}

			if (initial == 6) {
				System.out.println("Enter the Experience of Employee:");
				Exp = sc.nextInt();
				Details[initial] = Integer.toString(Exp);
			}
			if (initial == 7) {
				System.out.println("Enter the Skills of Employee:");
				EmpEligibility = sc.next();
				Details[initial] = EmpEligibility;
				EmployeeData.add(Details);
				System.out.println("Employee Details Sucessfully Completed");
				return EmployeeData;
			}
		}
		return EmployeeData;
	}
}