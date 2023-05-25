package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest3 {
  @Test
 public void test3Method1() {
	  
	  Reporter.log("test3Method1 method From DemoTest3",true);
  }
  
  @Test
  public void test3Method2()
  {
	  Reporter.log("test3Method2 method from DemoTest3",true);
  }
  
  @Test
  public void test3Method3()
  {
	  Reporter.log("test3Method3 method from DemoTest3",true);
  }
}
