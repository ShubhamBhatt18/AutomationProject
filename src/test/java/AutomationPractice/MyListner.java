package AutomationPractice;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class MyListner implements ITestListener {
 
	Base bas=new Base();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		
		try {
			bas.getScreenshot(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		
		try {
			bas.getScreenshot(result.getName());
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

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
