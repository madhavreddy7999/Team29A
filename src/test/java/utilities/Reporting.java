package utilities;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting implements ITestListener{
	
	public ExtentSparkReporter reporter;
	
	public ExtentReports extent;
	
	public ExtentTest test;
	
	public void onStart (ITestContext context) {
		
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new date());
		String repName="Test-Report-"+timestamp+".html";
				
		reporter=new ExtentSparkReporter("./Reports/"+repName);
		
		reporter.config().setDocumentTitle("Automation Testing Report");
		reporter.config().setReportName("Login Functionality Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
	    extent.attachReporter(reporter);	
	    
	    extent.setSystemInfo("user","Madhav");
	    extent.setSystemInfo("hostname","LocalHost");
	    extent.setSystemInfo("environment","QA");
	    extent.setSystemInfo("OS","Windows10");
	    
	}
	
	
	    public void onTestSuccess(ITestResult tr) {
	    	test=extent.createTest(tr.getName());
	    	test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));  	
	    }
	    public void onTestFailure(ITestResult tr) {
	    	test=extent.createTest(tr.getName());
	    	test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.RED)); 
	    }
	    
	    public void onTestSkipped(ITestResult tr) {
	    	test=extent.createTest(tr.getName());
	    	test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE)); 
	    	
	    }
	    
	    public void onFinish(ITestContext context) {
	    	extent.flush();
	    	
	    }

	    	
	    	

	    	
	    	
	    }

