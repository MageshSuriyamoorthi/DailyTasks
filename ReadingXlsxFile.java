package readingXlsx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingXlsxFile {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the file to read");
		String read=scan.next();
		FileInputStream excelFile = new FileInputStream("D:\\\\eclipse-workspace\\\\readingXlsx\\\\"+read+".xls");

		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);

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
		

	}
}
