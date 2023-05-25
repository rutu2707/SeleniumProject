package testNGPackage;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo2 {
  @Test
  public void Demo2Method() {
	  
	  Reporter.log("It's method of demo2 class", true);
  }
}
