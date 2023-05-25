package selectMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAllMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/admin/Desktop/Videos/MultiSelectStaticDropDown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));

		Select sel = new Select(dropDown);

		Thread.sleep(4000);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(5);
		sel.selectByIndex(6);
		sel.selectByIndex(7);
		sel.selectByIndex(8);
		sel.selectByIndex(9);
		
		Thread.sleep(2000);
		sel.deselectAll();
	}

}