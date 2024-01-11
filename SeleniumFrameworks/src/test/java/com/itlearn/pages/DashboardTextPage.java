package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardTextPage {
	
    WebDriver driver;
	public DashboardTextPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="lg_button") WebElement dashboard;
	
	public String getDashboardText() {
		 String actualValue = dashboard.getText();
		 return actualValue;
	}
}
