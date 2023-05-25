package windowBasePopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-7qk9up4/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo' and (@type='file')]"));
	
		Actions act = new Actions(driver);
		act.doubleClick(element);

	}
}
