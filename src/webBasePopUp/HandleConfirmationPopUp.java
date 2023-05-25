package webBasePopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("file:///C:/Users/admin/Desktop/Videos/ConfirmationPopUp.html");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    Thread.sleep(2000);
	    Alert al = driver.switchTo().alert();
	    System.out.println(al.getText());
	    Thread.sleep(2000);
	    al.accept();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
