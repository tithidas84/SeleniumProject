package practiceTestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PaymentPage {
	
ChromeDriver browserObject;
	
	@BeforeTest
	void beforeTestExecutes() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		browserObject = new ChromeDriver();
		browserObject.manage().window().maximize();
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
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
	
	@Test(priority=3)
	void offeredAcademies(){
		
		WebElement offAcd = browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a"));
		offAcd.click();
	}
	
	@Test(priority=4)
	void subscribe() {
		JavascriptExecutor js = (JavascriptExecutor) browserObject;
		js.executeScript("window.scrollBy(0,250)", "");	
		WebElement subscBtn = browserObject.findElement(By.xpath("//*[@id=\"tab-academies\"]/div/div/ul/li[4]/form/div/button"));
		subscBtn.click();
	}
	
	
	@AfterTest
	void after() {
		
//		browserObject.close();
		
	}
	

}