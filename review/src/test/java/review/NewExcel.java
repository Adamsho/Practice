package review;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcel {
	public static void main(String[] args) throws IOException {
		
		String path =".src/test/resources/testdata/Book1.xls";
		FileInputStream input = new FileInputStream(path);

		XSSFWorkbook workbook = new XSSFWorkbook(input);

		XSSFSheet worksheet = workbook.getSheet("Sheet2");

		int rowsCount = worksheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows: " + rowsCount);
	}
}
