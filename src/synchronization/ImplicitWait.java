package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdrdiver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.instagram.com");
		
        Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("rutu2707");
		driver.findElement(By.name("password")).sendKeys("rutu");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
}
