package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CheckDashboard {
	
ChromeDriver browserObject;
	
	@BeforeTest
	void beforeTestExecutes() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		
	}
	
	@Test(priority=1)
	void verifyLogin() throws InterruptedException {
		
		browserObject.findElement(By.id("loginlabel")).click();
		WebElement username = browserObject.findElement(By.name("log"));
		WebElement password = browserObject.findElement(By.name("pwd"));
		WebElement submitBtn=browserObject.findElement(By.name("wp-submit"));
		
		username.sendKeys("Demo12");
		password.sendKeys("Test123456$");
		submitBtn.submit();
	}
	
	@Test(priority=2)
	void searchCourses(){
		
		browserObject.findElement(By.className("lg_button")).click();
		
		WebElement dashBoard = browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[1]/a"));
		Assert.assertEquals(true, dashBoard.isDisplayed());
        System.out.println("Dashboard is displayed – Assert passed"); 
	
	}
	
	@AfterTest
	void after() {
		
		browserObject.close();
		
	}
	

}
