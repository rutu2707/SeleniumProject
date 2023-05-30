package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
  @Test(invocationCount = 10) //default value is 1 
  public void method() {
	  
	  Reporter.log("method of Flag3 class", true);
  }
}
