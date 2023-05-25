package methodsOfWebEement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//orangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));

		Rectangle rect = button.getRect();

		// get the Location of WebElemet

		int xaxis = rect.getX();
		int yaxis = rect.getY();

		System.out.println(" x axis :" + xaxis + "  Y axis :" + yaxis);

		// get the height & width of webelement
		int h = rect.getHeight();
		int w = rect.getWidth();
		System.out.println("Height :" + h + "  Width :" + w);

		//selenium.dev
		driver.navigate().to("https://www.selenium.dev/");

		WebElement element = driver.findElement(By.xpath("//h4[text()='Selenium IDE']"));
		Rectangle rect1 = element.getRect();
		int xaxis1 = rect1.getX();
		int yaxis1 = rect1.getY();
		System.out.println("Xaxis: " + xaxis1 + "Yaxis: " + yaxis1);

		int height = rect1.getHeight();
		int width = rect1.getWidth();
		System.out.println("Height :" + height + "Width : " + width);

	}

}
