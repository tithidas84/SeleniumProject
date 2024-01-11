package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	//constructor
	public LoginPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
	
	
@FindBy(name="log") WebElement uname;
	

	@FindBy(name="pwd") WebElement pass;
	
	@FindBy(name="wp-submit") WebElement loginButton;

	@FindBy(xpath="//*[@id=\"gk-login-toggle\"]/i") WebElement logoutimage;
	
	@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclick;
	
	@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logoutclik;
	
	public void loginToPortal(String userName , String passWord) throws InterruptedException {
		
		loginclick.click();
		
	 uname.sendKeys(userName);
	 Thread.sleep(4000);
	 pass.sendKeys(passWord);
	 loginButton.click();
	 
	 
	}
	public void logout()
	{
		logoutimage.click();
		logoutclick.click();
	}
}
