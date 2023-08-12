package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
	
	       ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php/");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Tithi");
	        
	        browserObject.findElement(By.name("email")).sendKeys("tithi@gmail.com");
	        
	        browserObject.findElement(By.name("website")).sendKeys("www.itlearn360.com");
	        
	        browserObject.findElement(By.name("comment")).sendKeys("This is a good website");
	        
	        browserObject.findElement(By.name("submit")).click();
	}

}
