package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
WebDriver browserObject = new ChromeDriver();
browserObject.get("http://www.google.com/");
browserObject.findElement(By.id("APjFqb")).sendKeys("khov home");
browserObject.findElement(By.name("btnK")).submit();
//browserObject.close();

	}

}
