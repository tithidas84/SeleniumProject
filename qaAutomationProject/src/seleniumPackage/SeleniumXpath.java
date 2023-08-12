package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	
	       ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php/");
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        
	        Thread.sleep(4000);
	        browserObject.findElement(By.xpath("//input[@value ='male']")).click();
	        
	        browserObject.findElement(By.name("submit")).click();
	        
	}

}
