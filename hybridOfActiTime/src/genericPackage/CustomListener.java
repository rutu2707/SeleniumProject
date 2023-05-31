package genericPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListener extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		Reporter.log("Test Execution started", true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		Reporter.log("Test Executed successfully", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String failedMethod = result.getMethod().getMethodName();
		BaseTest bt = new BaseTest();
		bt.failedMethodTakeScreenshotMethod(failedMethod);

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		Reporter.log("Test Execution skipped", true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		Reporter.log("onTestFailedButWithinSuccessPercentage", true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("onTestFailedWithTimeout", true);
	}

	@Override
	public void onStart(ITestContext context) {

		Reporter.log("onStart", true);
	}

	@Override
	public void onFinish(ITestContext context) {

		Reporter.log("onFinish", true);
	}

}
