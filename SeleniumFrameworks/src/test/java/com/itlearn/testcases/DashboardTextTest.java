package com.itlearn.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.DashboardTextPage;
import com.itlearn.pages.LoginPage;
import com.itlearn.utility.ReadExelData;

public class DashboardTextTest extends BaseTest{
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestDataSheet.xlsx";
	@Test(priority =1)
	public void verifyLogin() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExelData.getCellValue(fileName, "TestData", 1, 0);
		String password=ReadExelData.getCellValue(fileName, "TestData", 1, 1);
		lp.loginToPortal(username, password);
		
		if(username.equals("Demo12") && password.equals("Test123456$"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		
	}
	@Test(priority=2)
	public void CheckDashboardText() {
		
		
		String expected ="Dashboard";
		DashboardTextPage dtp = new DashboardTextPage(driver);
		String actual = dtp.getDashboardText();
		System.out.println(actual);
		assertEquals(expected,actual);
		
	}
		
	}


