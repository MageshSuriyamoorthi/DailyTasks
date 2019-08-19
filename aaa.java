package industry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class aaa {
	public static void main(String[] args) throws IOException{
	    Scanner scan = new Scanner(System.in);  
	    File employeeDetails = new File("E.txt");
	    PrintWriter pw = new PrintWriter(new FileWriter(employeeDetails, true));

	    for(int i=0; i<3; i++){
	      //  FileWriter fw = new FileWriter("Employees.txt", true);
	        try{
	            boolean repeat = false;

	            System.out.println("Enter name: ");
	            String name = scan.next();
	            pw.println("name: " + name);

	            System.out.println("Enter job title: ");
	            String jobTitle = scan.next();
	            pw.println("Job title: " + jobTitle);

	            do{
	                try{
	                    System.out.println("Enter age: ");
	                    int age = scan.nextInt();
	                    pw.println("Age: " + age);
	                    repeat = true;
	                }
	                catch(InputMismatchException ex){
	                    System.err.println("Invalid age please enter a whole number."); 
	                    scan.next();
	                    continue;
	                }
	            }while(repeat==false);
	            do{
	                try{
	                    System.out.println("Enter salary per year: ");
	                    double salary = scan.nextDouble();
	                    pw.println("Salary: " + salary);
	                    repeat = false;
	                }
	                catch(InputMismatchException ex){
	                    System.err.println("Invalid salary please enter a decimal."); 
	                    scan.next();
	                    continue;   
	                } 
	                catch(MissingFormatArgumentException ex){
	                    System.err.println("Invalid salary please enter a decimal.");
	                    scan.next();
	                    continue;
	                }
	            }while(repeat);
	        }finally{
	            pw.close();
	           // fw.close();
	        }
	    }
	    scan.close();
	}
	}

