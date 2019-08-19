package readingXlsx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadXlsx {
	void Write() throws IOException
	{
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.println("Enter the file name");
		name=scan.nextLine();
		FileOutputStream excelFile = new FileOutputStream("D:\\eclipse-workspace\\readingXlsx\\" + name + ".xlsx");
	

	WorkBook wb=new WorkBook(excelFile);
        XSSFSheet sheet = (XSSFSheet) wb.createSheet("Java Sheet");
         
        Object[][] bookData = {
                {"Head First Java", 79},
                {"Effective Java", 36},
                {"Clean Code", 42},
                {"Thinking in Java", 35}
        };
 
        int rowCount = 0;
         
        for (Object[] aBook : bookData) {
            Row row = sheet.createRow(++rowCount);
             
            int columnCount = 0;
             
            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
             
        }
    }


}
