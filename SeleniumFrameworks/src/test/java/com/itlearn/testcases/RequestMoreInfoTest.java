package com.itlearn.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;
import com.itlearn.pages.RequestMoreInfoPage;

public class RequestMoreInfoTest extends BaseTest{
	
	@Test(priority=1)
	
	public void VerifyLogin() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
		String username = "Demo12";
		String password = "Test123456$";
		lp.loginToPortal(username, password);
		
		if(username.equals("Demo12")&&password.equals("Test123456$")){
			System.out.println("TestPassed");
			Assert.assertTrue(true);
		}
		
	}
	@Test(priority=2)
	public void SeeFacts() throws InterruptedException {
		RequestMoreInfoPage rmi = new RequestMoreInfoPage(driver);
		rmi.SeeFaqs();
		
	}
	@Test(priority=3)
	public void RequestMoreInquiry() {
		RequestMoreInfoPage rmi = new RequestMoreInfoPage(driver);
		String yourname = "Rahul";
		String youremail = "rahul@gmail.com";
		String contactnum = "2234567880";
		String nameofcity = "Allen";
		rmi.RequestInquiry( yourname, youremail, contactnum, nameofcity);
		
	}
	
	

}
