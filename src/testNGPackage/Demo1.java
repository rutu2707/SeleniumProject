package testNGPackage;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo1 {
  @Test
  public void demo1Method() {
	  
	  Reporter.log("It's method of demo1 class", true);
	  
  }
}
