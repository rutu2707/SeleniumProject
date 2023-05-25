package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter an browser name ");
		String browserName = sc.next();

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (browserName.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		else {
			System.out.println("enter valid browser name ");
		}

	}
}
