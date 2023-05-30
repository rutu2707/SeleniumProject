package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
	@Test(groups = "Functional Testing")
	public void methodFT1() {
		Reporter.log("Functional Test 1", true);
	}

	@Test(groups = "Smoke Tetsing")
	public void methodST1() {
		Reporter.log("Somke Test 1 ", true);

	}

	@Test(groups = "Integration Testing")
	public void methodIT1() {
		Reporter.log("Integration Test 1", true);

	}

	@Test(groups = "Functional Testing")
	public void methodFT2() {
		Reporter.log("Functional Test 2", true);
	}

	@Test(groups = "Smoke Tetsing")
	public void methodST2() {
		Reporter.log("Somke Test 2 ", true);

	}

	@Test(groups = "Integration Testing")
	public void methodIT2() {
		Reporter.log("Integration Test 2 ", true);

	}

	@Test(groups = "Functional Testing")
	public void methodFT3() {
		Reporter.log("Functional Test 3 ", true);
	}

	@Test(groups = "Smoke Tetsing")
	public void methodST3() {
		Reporter.log("Somke Test 3 ", true);

	}

	@Test(groups = "Integration Testing")
	public void methodIT3() {
		Reporter.log("Integration Test 3 ", true);

	}

	@Test(groups = "Functional Testing")
	public void methodFT4() {
		Reporter.log("Functional Test 4 ", true);
	}

	@Test(groups = "Smoke Tetsing")
	public void methodST4() {
		Reporter.log("Somke Test 4 ", true);

	}

	@Test(groups = "Integration Testing")
	public void methodIT4() {
		Reporter.log("Integration Test 4 ", true);

	}

	@Test(groups = "Functional Testing")
	public void methodFT5() {
		Reporter.log("Functional Test 5 ", true);
	}

	@Test(groups = "Smoke Tetsing")
	public void methodST5() {
		Reporter.log("Somke Test 5 ", true);

	}

	@Test(groups = "Integration Testing")
	public void methodIT5() {
		Reporter.log("Integration Test 5 ", true);

	}

	@Test(groups = "Functional Testing")
	public void methodFT6() {
		Reporter.log("Functional Test 6 ", true);
	}

	@Test(groups = "Smoke Tetsing")
	public void methodST6() {
		Reporter.log("Somke Test 6 ", true);

	}

	@Test(groups = "Integration Testing")
	public void methodIT6() {
		Reporter.log("Integration Test 6 ", true);

	}
}
