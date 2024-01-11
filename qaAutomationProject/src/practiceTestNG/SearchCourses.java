package practiceTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchCourses {
	
ChromeDriver browserObject;
	
	@BeforeTest
	void beforeTestExecutes() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserObject = new ChromeDriver();
		browserObject.get("http://www.itlearn360.com/");
		
	}
	
	@Test(priority=1)
	void verifyLogin() {
		
		WebElement username = browserObject.findElement(By.name("log"));
		WebElement password = browserObject.findElement(By.name("pwd"));
		WebElement submitBtn = browserObject.findElement(By.name("wp-submit"));
		username.clear();
		username.sendKeys("Demo12");
		password.clear();
		password.sendKeys("Test123456$");
		submitBtn.submit();
	}
	
	@Test(priority=2)
	void searchCourses(){
		
		WebElement search = browserObject.findElement(By.id("search_course"));
		search.sendKeys("Automation Testing");
		search.submit();
	
	}
	
	@AfterTest
	void after() {
		
		browserObject.close();
		
	}
	
	

}



