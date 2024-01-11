package com.itlearn.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestMoreInfoPage {
	
	WebDriver driver;
	
	public RequestMoreInfoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"menu-item-13318\"]/a/span") WebElement freeCourses;
	@FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/div/div[1]/h3") WebElement faq1;
	@FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/div/div[3]/h3") WebElement faq2;
	@FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/div/div[5]/h3") WebElement faq3;
	@FindBy(xpath = "//*[@id=\"footer-widget-area\"]/div[1]/div[2]/div/div/a/button") WebElement requestDemo;
	@FindBy(name = "name") WebElement username;
	@FindBy(name = "useremail") WebElement email;
	@FindBy(name = "contact") WebElement contactno;
	@FindBy(name = "city") WebElement cityname;
	@FindBy(className = "btnsubmit") WebElement submitButton;
	
	public void SeeFaqs() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1500)", "");
		faq1.click();
		Thread.sleep(1000);
		faq2.click();
		Thread.sleep(1000);
		faq3.clear();
		Thread.sleep(1000);
	}
	
	public void RequestInquiry(String yourname, String youremail, String contactnum, String nameofcity) {
		requestDemo.click();
		username.sendKeys(yourname);
		email.sendKeys(youremail);
		contactno.sendKeys(contactnum);
		cityname.sendKeys(nameofcity);
		submitButton.click();
	}

}
