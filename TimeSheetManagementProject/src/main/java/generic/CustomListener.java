package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener extends BaseTest implements ITestListener {

	public void onTestStart(ITestResult result) {

		Reporter.log("Test Execution started", true);
	}

	public void onTestSuccess(ITestResult result) {

		Reporter.log("Test Executed successfully", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String failedMethod = result.getMethod().getMethodName();
		BaseTest bt = new BaseTest();
		bt.faliedMethodToTakeScreenshot(failedMethod);

	}

	public void onTestSkipped(ITestResult result) {

		Reporter.log("Test Execution skipped", true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		Reporter.log("onTestFailedButWithinSuccessPercentage", true);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout", true);
	}

	public void onStart(ITestContext context) {

		Reporter.log("onStart", true);
	}

	public void onFinish(ITestContext context) {

		Reporter.log("onFinish", true);
	}

}
