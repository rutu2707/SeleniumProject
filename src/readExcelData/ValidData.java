package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidData {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-7qk9up4/login.do");

		// username
		FileInputStream fis = new FileInputStream("./data/ActiTime.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Valid");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);

		// password
		FileInputStream fis2 = new FileInputStream("./data/ActiTime.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("Valid");
		Row row2 = sheet2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String data2 = cell2.getStringCellValue();
		System.out.println(data2);

		driver.findElement(By.name("username")).sendKeys(data);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(data2);
		driver.findElement(By.id("loginButton")).click();
	}

}
