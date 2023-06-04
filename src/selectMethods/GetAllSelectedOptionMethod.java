package selectMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/admin/Desktop/Videos/MultiSelectStaticDropDown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDown);

		Thread.sleep(2000);
		for (int i = 0; i < 5; i++) {

			sel.selectByIndex(i);
		}
		List<WebElement> options = sel.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {

			String opt = options.get(i).getText();
			System.out.println(opt);
		}

	}

}