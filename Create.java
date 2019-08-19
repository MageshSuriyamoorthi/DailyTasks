package readingXlsx;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Scanner;



import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create {
 public void CsvWriter() throws IOException{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the no of datas to enter");
	 int no=s.nextInt();
	 System.out.println("Enter the Name,Desg,ID");
	 for(int i=0;i<no;i++)
	 {
		 String name=s.nextLine();
		 String Desg=s.nextLine();
		 int Id=s.nextInt();
 List<List<String>> rows = Arrays.asList(
		  Arrays.asList(name+","+Desg+","+Id)
		);
	 }
	 List<List<String>> rows = Arrays.asList(
			);
FileWriter csvWriter = new FileWriter("D:\\eclipse-workspace\\\\readingXlsx\\StoreDetails.xlxs");
csvWriter.append("Name");
csvWriter.append("\t");
csvWriter.append("Role");
csvWriter.append("\t");
csvWriter.append("Id");
csvWriter.append("\t");
csvWriter.append("\n");

for (List<String> rowData : rows) {
   csvWriter.append(String.join("\t", rowData));
   csvWriter.append("\n");
}

csvWriter.flush();
csvWriter.close();
 System.out.println("done");
 }
}



