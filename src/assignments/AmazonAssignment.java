package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung phones");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='contextualIngressPtLabel_deliveryShortLine']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("413132");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-button-input']/following-sibling::span[@id='buyBackApplyButton-announce']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-button-input']/following-sibling::span[@id='buyBackApplyButton-announce']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit.delete.5536c1b3-19a4-498e-9f39-804ac031f159']")).click();
		
	}

}
