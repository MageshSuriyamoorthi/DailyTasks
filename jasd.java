package readingXlsx;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class jasd {


	private static HSSFWorkbook xlWBook;
	private static HSSFSheet xlSheet;
	private static HSSFRow xlRow;
	private static HSSFCell xlCell;
	//private static String UserDir=System.us
	private static String filePath = "D:\\eclipse-workspace\\Training\\";
	private static String fileName = "Book1.xlsx";

	public static void main(String[] args) throws InterruptedException {
		try {
			FileInputStream xlFile = new FileInputStream(filePath + fileName);
			xlWBook = new HSSFWorkbook(xlFile);
			xlSheet = xlWBook.getSheetAt(0);
			int noOfRows = xlSheet.getPhysicalNumberOfRows();
			xlRow = xlSheet.getRow(0);
			int noOfColumns = xlRow.getLastCellNum();
			String[][] excelData = new String[noOfRows][noOfColumns];
			for (int r = 1; r < noOfRows; r++) {
				for (int c = 0; c < noOfColumns; c++) {
					xlRow = xlSheet.getRow(r);
					xlCell = xlRow.getCell(c);
					excelData[r][c] = xlCell.getStringCellValue();
				}
			}
			String[][] isExecuted = new String[noOfRows][1];
			for (int row = 1; row < noOfRows; row++) {
				isExecuted[row][0] = excelData[row][noOfColumns - 1];
				if (isExecuted[row][0].equalsIgnoreCase("yes")) {
					for (int col = 0; col < noOfColumns; col++) {
						System.out.println(excelData[row][col]);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	