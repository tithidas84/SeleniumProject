package testngPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginCode {

	 ChromeDriver   browserObject;
	@Test(priority =1)
	void login() throws InterruptedException
	{
		 
	      WebElement username = browserObject.findElement(By.name("Email"));
		// 7. Get reference of Password input box by locate the id method.
	      WebElement password = browserObject.findElement(By.name("Password"));
		// 8. Get reference of login button by locate the classname method.
	      WebElement submitBtn = browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		// 9. Clear the Email input box.
	      username.clear();
		// 10. Provide/Enter the correct email to email input box through reference.
	      username.sendKeys("admin@yourstore.com");
	// 11. Clear the Password input box.
	      password.clear();
		// 12. Provide/Enter the correct password to password input box through reference.
	      password.sendKeys("admin");
		// 13. Submit the button.
	      submitBtn.click();
	      System.out.println("End Result: Form submitted");
	      Thread.sleep(2000);
	}
	@Test(priority=2)
	void dashboard()
	{
		String expectedValue= "Dashboar";
		String actualValue=browserObject.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		
		assertEquals(expectedValue,actualValue);
		}
	
	@BeforeTest
	void beforeTestExecute()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 3. Initialize WebDriver object through ChromeDriver class.
      browserObject = new ChromeDriver();
	        System.out.println("Open /close  cnn.com in chrome browser");
		
      browserObject.get("https://admin-demo.nopcommerce.com/login");
	// 6. Get reference of Email input box by locate the id method.
	}
	
	@AfterTest
	void after()
	{
		browserObject.close();
	}
}
