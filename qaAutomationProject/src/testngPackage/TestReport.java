package testngPackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestReport {
	
	@Test
    public void loginTest() {
        System.out.println("sample login test");
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\anupa\\Desktop\\Report\\extent.html"); //path to store html file
        // create ExtentReports and attach reporter(s)
//        ExtentReports extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//        // creates a toggle for the given test, adds all log events under it
//        ExtentTest logger = extent.createTest("Login Test");
//        // log(Status, details)
//        logger.log(Status.INFO, "This step shows usage of login test");
//        logger.log(Status.PASS, "TESTING PASSED");
//        extent.flush();
    }

}

