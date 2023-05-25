package testNGPackage2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseA3 {
	@Test
	public void testCase3Method() {

		System.setProperty("webdrdiver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("SELENIUM",Keys.ENTER);
	}
}
