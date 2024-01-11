package com.itlearn.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;
import com.itlearn.utility.ReadExelData;


public class LoginDataProviderTest extends BaseTest{
	
	String fileName=System.getProperty("user.dir")+"\\TestData\\TestDataSheet.xlsx";

	@Test(priority =1,dataProvider="LoginDataProvider")
	public void VerifyLogin(String userEmail,String userPwd) throws Exception
	{
		LoginPage lp=new LoginPage(driver);
//		String username ="Demo12";
//		String password ="Test123456$";
		System.out.println(userEmail );
		System.out.println(userPwd);
		lp.loginToPortal(userEmail, userPwd);
		
		if(userEmail.equals("Demo12") && userPwd.equals("Test123456$"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
			lp.logout();
		}
		else
	{
			System.out.println("The test failed ");
			captureScreenShot(driver,"VerifyLogin");
			Assert.assertTrue(false);
		}
	}
	
	
	@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		
		
		int ttlRows= ReadExelData.getRowCount(fileName, "TestData");
		int ttlColumns= ReadExelData.getColCount(fileName, "TestData");
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExelData.getCellValue(fileName, "TestData", i, j);
			}
		}
		return data;
	}

	
	
	
	

}
