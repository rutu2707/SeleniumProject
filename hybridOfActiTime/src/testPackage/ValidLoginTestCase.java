package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;

@Listeners(CustomListener.class)
public class ValidLoginTestCase extends BaseTest {
	
	@Test
	public void validTestCase() throws IOException, InterruptedException
	{
		BaseTest bt = new BaseTest();
		bt.setUp();               //open browser and go and launch ActiTime 
		Flib flib = new Flib();    
		LoginPage lp = new LoginPage(driver);
		String username = flib.readPropertyData(PROP_PATH,"username");
		String password = flib.readPropertyData(PROP_PATH,"password");
		lp.validLogin(username,password);  // login
        Thread.sleep(2000);
        
       

	}

}