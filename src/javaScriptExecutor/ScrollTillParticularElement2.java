package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularElement2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement element = driver.findElement(By.xpath("//div[text()='Casual Shoes']"));
		Point loc = element.getLocation();
		int xAxis = loc.getX();
		int yAxis = loc.getY();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("window.scrollBy(" + xAxis + "," + (yAxis-500) + ")");

		Thread.sleep(2000);
		driver.quit();
	}

}
