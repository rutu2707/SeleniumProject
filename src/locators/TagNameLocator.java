package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Videos/usernametextbox.html");

		Thread.sleep(2000);

		driver.findElement(By.tagName("input")).sendKeys("admin");
		Thread.sleep(2000);

		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);

		driver.findElement(By.tagName("input")).sendKeys("admin");// work for these because it is first suggession
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("manager");// does not work for these because it is second
																	// suggession
	}

}
