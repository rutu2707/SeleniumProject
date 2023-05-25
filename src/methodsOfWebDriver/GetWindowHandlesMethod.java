package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		WebElement element = driver.findElement(By.linkText("Open a popup window"));
		Point loc = element.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + xaxis + "," + (yaxis - 250) + ")");

		Thread.sleep(2000);

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		element.click();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

	}

}
