package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.amazon.com/");

		driver.findElement(By.xpath("//input[@placeholder='Search Amazon']")).sendKeys("samsung", Keys.ENTER);

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath(
				"(//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::div[@class='sg-col-inner']/descendant::span[@class='a-price-whole'])[1]"));
		String priceOfPhone = element.getText();
		System.out.println(priceOfPhone);
	}

}
