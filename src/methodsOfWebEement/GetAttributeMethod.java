package methodsOfWebEement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/downloads/");

		WebElement value = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));

		String linkValue = value.getAttribute("href");
		System.out.println(linkValue);
		WebElement value1 = driver.findElement(By.xpath("//h1[@class='display-1']"));
		String textValue = value1.getAttribute("class");
		System.out.println(textValue);
		

	}
}
