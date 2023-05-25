package methodsOfWebEement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.selenium.dev/");

		WebElement element = driver.findElement(By.xpath("//h2[.='News']"));

		String tagNameOfNews = element.getTagName();

		System.out.println(tagNameOfNews);

		driver.navigate().to("https://www.amazon.in/");
		WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
		String tagName = element1.getTagName();
		System.out.println(tagName);

	}

}
