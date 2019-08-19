package readingXlsx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class CreateWriteReadXlxs {
	Scanner scan = new Scanner(System.in);
	String name;
	int sheetNo;
	Workbook wb = new XSSFWorkbook();
		void Create() throws FileNotFoundException {
			Scanner scan = new Scanner(System.in);

			System.out.println("Enter a Excel file name");
			
			name = scan.nextLine();
			OutputStream fileOut = new FileOutputStream(name + ".xlsx");
		}
	/*	void write() throws IOException
{
			FileInputStream excelFile = new FileInputStream("D:\\eclipse-workspace\\readingXlsx\\" + name + ".xlsx");

			XSSFWorkbook workbook =  new XSSFWorkbook(excelFile);

			XSSFSheet sheet = workbook.getSheetAt(0);

			Iterator<Row> rowIt = sheet.rowIterator();
			while (rowIt.hasNext()) {
				Row row = rowIt.next();
				Iterator<Cell> cellIt = row.cellIterator();
				while (cellIt.hasNext()) {
					Cell cell = cellIt.next();
					System.out.println(cell.toString() + ";");
				}

				System.out.println();
			
			}
			
			
		}*/

	}

