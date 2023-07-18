package testPackage;

import java.io.IOException;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.ProjectAndCustomerCreationPage;

public class CreateCustomerAndProject extends BaseTest  {
	public static void main(String[] args) throws InterruptedException, IOException {
	
	BaseTest bt = new BaseTest();
	bt.setUp();               //open browser and go and launch ActiTime 
	Flib flib = new Flib();    
	LoginPage lp = new LoginPage(driver);
	String username = flib.readPropertyData(PROP_PATH,"username");
	String password = flib.readPropertyData(PROP_PATH,"password");
	lp.validLogin(username,password);  // login
    Thread.sleep(2000);
	HomePage hp = new HomePage(driver);
     
    hp.taskModuleMethod();     // go to task module 
   
    Thread.sleep(2000);
	hp.taskModuleMethod();
	ProjectAndCustomerCreationPage task = new ProjectAndCustomerCreationPage(driver);
	String projectName = flib.readExcelData(EXCEL_PATH,"CustomerAndProject",1,0);
	task.createCustomerMethod(projectName);
	Thread.sleep(2000);
	String customerName = flib.readExcelData(EXCEL_PATH,"CustomerAndProject",1,1);
	task.createProjectMethod(projectName,customerName);
}
}
