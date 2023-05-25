package windowBasePopUp;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-7qk9up4/login.do");

		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		

		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();

		
		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();

		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));

		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
	
		act.doubleClick(target).perform();
	    Thread.sleep(2000);

		// To Handle FileUplaod Pop up ....

//		File file = new File("./autoit/Fileup.exe");
//		String absolutePath = file.getAbsolutePath();
//		Thread.sleep(2000);
//		Runtime.getRuntime().exec(absolutePath);
//		Thread.sleep(2000);
//		Runtime.getRuntime().exec(absolutePath);
//


		// close the browser
			driver.quit();






	}
}
