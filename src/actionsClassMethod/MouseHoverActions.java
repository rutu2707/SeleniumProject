package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();

		Thread.sleep(2000);
		WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);

		Thread.sleep(2000);
		act.moveToElement(coins).perform();

		driver.findElement(By.xpath("//span[text()='1 gram' and (contains(@data-p,'gold-coins-2'))]")).click();

		WebElement coinpic = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		if (coinpic.isDisplayed()) {
			System.out.println("You are at right page ");
		} else {
			System.out.println("You are at wrong page ");
		}
	}
}
