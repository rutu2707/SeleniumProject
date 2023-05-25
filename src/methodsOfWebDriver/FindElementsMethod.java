package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.switchTo().activeElement().sendKeys("Poha");

		List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for (int i = 0; i <= pohaOptions.size() - 1; i++) {

			String poha = pohaOptions.get(i).getText();
			System.out.println(poha);
			Thread.sleep(2000);

		}

		// for( WebElement poha : pohaOptions) {

		// System.out.println(poha.getText());

		// }

	}

}
