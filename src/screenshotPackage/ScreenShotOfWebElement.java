package screenshotPackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfWebElement {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.instagram.com");

		WebElement button = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));

		if (button.isEnabled()) {
			System.out.println("you can login");
		}

		else {
			System.out.println("you can't login");

			File src = button.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/ss.png");

			Files.copy(src, dest);

		}

	}
}
