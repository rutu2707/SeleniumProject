package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-7qk9up4/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.xpath("//A[@class='content administration']/IMG[@class='sizer']")).click();

		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		Actions act = new Actions(driver);

		act.doubleClick(target).perform();
		Thread.sleep(2000);

		// driver.navigate().to("file:///C:/Users/admin/Desktop/Videos/SingleSelectStaticDropDown.html");
		// WebElement element = driver.findElement(By.name("menu"));
		// act.doubleClick(element).perform();
		driver.quit();

	}

}
