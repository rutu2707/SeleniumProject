package methodsOfWebEement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement usernameTB = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTB = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));

		System.out.println(usernameTB.isDisplayed());// true

		if (usernameTB.isDisplayed()) {
			usernameTB.sendKeys("Admin");
		}

		else {
			System.out.println("Exception");
		}

		if (passwordTB.isDisplayed()) {
			passwordTB.sendKeys("admin123");
		}

		else {
			System.out.println(" Exception");
		}

		if (button.isDisplayed()) {
			button.click();
		}

		else {
			System.out.println("Will get Exception!!");
		}

	}

}
