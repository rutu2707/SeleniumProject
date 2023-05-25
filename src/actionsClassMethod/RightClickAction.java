package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[text()='4.9.0']"));
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        act.contextClick(element).perform();

	}

}
