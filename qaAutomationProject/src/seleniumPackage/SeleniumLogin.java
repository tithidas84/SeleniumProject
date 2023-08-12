package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browserObject;
	       // 1. setup the property of WebDriver to perform "linktext" through chrome web browser.
	        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	        browserObject = new ChromeDriver();
	       
		// 3. Open the web page https://www.google.com/
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        
	        WebElement email=browserObject.findElement(By.id("Email"));
	        email.clear();
	        email.sendKeys("admin@yourstore.com");
	        WebElement pass= browserObject.findElement(By.id("Password"));
	        pass.clear();
	        pass.sendKeys("admin");
	        
	        browserObject.findElement(By.className("button-1")).click();
	}

}
