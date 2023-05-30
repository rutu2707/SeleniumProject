package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
  @Test(description ="this method does login")//default value is empty
  public void loginMethod() {
	  
	  Reporter.log("you are done with login", true);
  }
}
