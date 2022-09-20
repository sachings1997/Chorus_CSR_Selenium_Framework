package org.main.generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public  class ListenerImplementation  implements ITestListener{
     private ExtentReports report;
     public static ExtentReports stest;
     private ExtentTest test;
     
     
    
    	 
    	 
     

	@Override//@BM
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
		
		stest=stest;
		
	}

	@Override//@AM
	public void onTestSuccess(ITestResult result) {
		test.pass(result.getMethod().getMethodName()+"pass");
		
		
	}

	@Override //@AM
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.fail(result.getMethod().getMethodName()+"fail");
		test.fail(result.getThrowable());
		System.out.println(Thread.currentThread().getId());
		String path=new WebDriverUtility().screenshot(Baseclass.sdriver);
		test.addScreenCaptureFromBase64String(path);
	try {
		new WebDriverUtility().screenShot(Baseclass.sdriver, Baseclass.sjavaUtiltiy, result.getMethod().getMethodName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		//this is used to store the screenshot photo in screeshot folder
	//	 new WebDriverUtility().screenShot(Baseclass.sjavaUtiltiy,Baseclass.sdriver);
		
	}

	@Override //AM
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.skip("Test1 skip");
		test.fail(result.getThrowable());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentSparkReporter spark = new ExtentSparkReporter("./extentReport/extentreport.html");
		spark.config().setDocumentTitle("org.chouerTest");
		spark.config().setReportName("ReportName-chouerTest");
		spark.config().setTheme(Theme.DARK);
		report= new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Author", "Sachin gs");
		report.setSystemInfo("browser", "chrome");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		
	}

}
