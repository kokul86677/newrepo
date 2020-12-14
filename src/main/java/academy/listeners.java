package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listeners extends browserpath implements ITestListener  {
	ExtentTest t;
	ExtentReports test =extentreporterNG.config();
	ThreadLocal<ExtentTest> l = new ThreadLocal<ExtentTest>();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	 t = test.createTest(result.getMethod().getMethodName());
	 l.set(t);
	
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	l.get().log(Status.PASS, "success");
		
		
	}

	public void onTestFailure(ITestResult result) {
		l.get().fail(result.getThrowable());
		WebDriver driver = null;
		String testcasename=result.getMethod().getMethodName();
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			
		}
		try {
			l.get().addScreenCaptureFromPath(getscreenshotpath(testcasename,driver),result.getMethod().getMethodName());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}



	
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	 test.flush();
	}

}
