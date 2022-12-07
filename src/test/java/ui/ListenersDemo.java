package ui;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class ListenersDemo extends testUtils implements ITestListener{
	
	
	public void onTestStart(ITestResult result){
		System.out.println("Test is started");
		
		}
	

	public void onTestFailure(ITestResult result) {
		try {
			getScreenshot ();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	
}
