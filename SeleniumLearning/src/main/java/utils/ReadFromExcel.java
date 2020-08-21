package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		String xlfilename= "TestData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook("./Data/"+xlfilename);//filename
		XSSFSheet sheet = workbook.getSheetAt(0);//sheet
		int lastrowinsheet = sheet.getLastRowNum();//last rownum
		System.out.println(lastrowinsheet);
		for (int i = 1; i <=lastrowinsheet; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int k = 0; k <3; k++) {
				XSSFCell cell = row.getCell(k);
				String value= cell.getStringCellValue();
				System.out.println(value);
			}
		}
		workbook.close();
	}
}
