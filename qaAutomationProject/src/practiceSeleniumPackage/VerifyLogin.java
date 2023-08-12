package practiceSeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe" );
		WebDriver browserObject = new ChromeDriver();
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.findElement(By.id("loginlabel")).click();
		browserObject.findElement(By.name("log")).sendKeys("Demo12");
		browserObject.findElement(By.name("pwd")).sendKeys("Test123456$");
		browserObject.findElement(By.className("button-primary")).submit();
		
		

	}

}
