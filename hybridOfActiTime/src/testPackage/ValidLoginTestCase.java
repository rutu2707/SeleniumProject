package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.ProjectAndCustomerCreationPage;
import pagePackage.UsersListPage;

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
        HomePage hp = new HomePage(driver);
        hp.userModuleMethod();     // go to user module 
        Thread.sleep(2000);
        
        UsersListPage ulp = new UsersListPage(driver);
        String username1 = flib.readExcelData(EXCEL_PATH,"mgr",1,0);
        String password1 = flib.readExcelData(EXCEL_PATH,"mgr",1,1);
        String firstName = flib.readExcelData(EXCEL_PATH,"mgr",1,2);
        String lastName = flib.readExcelData(EXCEL_PATH,"mgr",1,3);
        
        ulp.createUserMethod(username1 , password1 , firstName , lastName);
		ulp.selectCheckBox();
		ulp.managerCreateMethod();
		Thread.sleep(2000);
		hp.taskModuleMethod();
		ProjectAndCustomerCreationPage task = new ProjectAndCustomerCreationPage(driver);
		String projectName = flib.readExcelData(EXCEL_PATH,"customer&projectList",1,0);
		task.createCustomerMethod(projectName);
		Thread.sleep(2000);
		String customerName = flib.readExcelData(EXCEL_PATH,"customer&projectList",1,1);
		task.createProjectMethod(projectName,customerName);

	}

}