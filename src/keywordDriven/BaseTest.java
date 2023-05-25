package keywordDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IAutoConstant {

	static WebDriver driver;

	public void openBrowser(String browserValue, String url) {

		if (browserValue.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);

		}

		else if (browserValue.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);

		} else if (browserValue.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}

	}

	public void closeBrowser() {

		driver.quit();
	}
}
