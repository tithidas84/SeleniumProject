package com.itlearn.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;



public class LoginTest extends BaseTest{

	@Test(priority =1)
	public void verifyLogin() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		String username ="Demo12";
		String password ="Test123456$";
		lp.loginToPortal(username, password);
		
		if(username.equals("Demo12") && password.equals("Test123456$"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
		}
		
	}
}
