package practiceTestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class VerifyLogin {
	
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
	void VerifyEndResult() throws InterruptedException {
		
		String expectedValue = "ITlearn360";
		String actualValue = browserObject.findElement(By.xpath("//*[@id=\"logo\"]/a/span/text()")).getText();
		assertEquals(expectedValue,actualValue);
		Thread.sleep(3000);
	
	}
	
	@AfterTest
	void after() {
		
		browserObject.close();
		
	}
	
	

}
