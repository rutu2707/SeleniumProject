package testNGPackage2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest1 {
	  @Test
	  public void test1Method1() {
		  Reporter.log("test1Method1 method From DemoTest1",true);
	  }
	  
	  @Test
	  public void test1Method2()
	  {
		  Reporter.log(" test1Method2 method From DemoTest1",true);
	  }
	  
	  @Test
	  public void  test1Method3()
	  {
	    Reporter.log("test1Method3 method from DemoTest1",true);	  
	  }
}
