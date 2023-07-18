package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib implements IAutoConstant {

	public String readExcelData(String EXCEL_PATH, String fileName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(fileName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String value = cell.getStringCellValue();
		return value;

	}

	public int rowCount(String EXCEL_PATH, String fileName) throws IOException {

		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(fileName);
	    int value = sheet.getLastRowNum();
		return value;

	}

	public void writeCellData(String EXCEL_PATH, String sheetName, int rowCount, int cellCount, String value) throws IOException {

		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(EXCEL_PATH);
		wb.write(fos);

	}

	public String readPropertyData(String PROP_PATH, String keyValue) throws IOException {

		FileInputStream fis = new FileInputStream(PROP_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(keyValue);
		return value;

	}

}
