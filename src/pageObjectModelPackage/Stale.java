package pageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://desktop-7qk9up4/login.do");
		driver.findElement(By.name("username")).sendKeys("admin",Keys.ENTER);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		driver.findElement(By.name("username")).click();
		driver.navigate().refresh();
		driver.findElement(By.name("username")).sendKeys("admin",Keys.ENTER);
		
		
	}
}
