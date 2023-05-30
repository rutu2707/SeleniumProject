package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {

	@Test(enabled = true)//default value is true 
	public void methodA() {
		Reporter.log("methodA of class Flag2", true);
	}

	@Test
	public void methpodZ() {

		Reporter.log("methodZ of class Flag2", true);
	}
}
