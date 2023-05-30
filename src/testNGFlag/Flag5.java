package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {

	@Test
	public void loginMethod() {
		Reporter.log("login Performed!!", true);
	}

	@Test(dependsOnMethods = "loginMethod")
	public void createUser() {

		Reporter.log("user Created!!", true);
	}

	@Test(dependsOnMethods = "createUser")
	public void logoutMethod() {
		Reporter.log("logout Performed!!", true);
	}

}
