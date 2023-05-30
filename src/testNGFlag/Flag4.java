package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {

	@Test(priority = 1)
	public void methodA() {

		Reporter.log("methodA of class Flag4 ", true);
	}

	@Test
	public void methodZ() {

		Reporter.log("methodZ of class Flag4", true);
	}

	@Test(priority = 2 , description = "methodS executed ")
	public void methodS() {

		Reporter.log("methodS of class Flag4", true);
	}

}
