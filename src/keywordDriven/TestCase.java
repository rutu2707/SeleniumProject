package keywordDriven;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestCase extends BaseTest  {

	public static void main(String[] args) throws IOException, InterruptedException {

		Flib flib = new Flib();
        
		BaseTest bs = new BaseTest();
		bs.openBrowser("chrome", "http://desktop-7qk9up4/login.do");
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "username"));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
	
	}

}
