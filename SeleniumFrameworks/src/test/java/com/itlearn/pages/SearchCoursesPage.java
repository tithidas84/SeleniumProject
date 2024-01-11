package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCoursesPage {
	
 WebDriver driver;
 public SearchCoursesPage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath="//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement searchButton;
 
 public void clickSearch() {
	 
	 searchButton.click();
 }
}
