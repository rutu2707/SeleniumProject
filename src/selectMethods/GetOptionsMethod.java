package selectMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/admin/Desktop/Videos/MultiSelectStaticDropDown.html");
		WebElement element = driver.findElement(By.name("menu"));
		Select sel = new Select(element);
		List<WebElement> allOptions = sel.getOptions();

		for (int i = 0; i < allOptions.size(); i++) {
			String option = allOptions.get(i).getText();
			System.out.println(option);
		}
	}

}
