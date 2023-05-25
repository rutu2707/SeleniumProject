package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {
  @Test
  public void test2Method1() {
	  Reporter.log("test2Method1 method From DemoTest2",true);
  }
  
  @Test
  public void test2Method2()
  {
	  Reporter.log("test2Method2 method From DemoTest2",true);
  }
  
  @Test
  public void test2Method3()
  {
	  int i=10;
	  int j=0;
	  int res=i/j;
	  Reporter.log("test2Method3 method From DemoTest2",true);
  }
}
