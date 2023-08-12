package practiceSeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
WebDriver browserObject = new ChromeDriver();
browserObject.get("http://demo.itlearn360.com/");
browserObject.findElement(By.id("loginlabel")).click();
browserObject.findElement(By.id("user_login")).sendKeys("Demo12");
browserObject.findElement(By.id("user_pass")).sendKeys("Test123456$");
browserObject.findElement(By.className("button-primary")).submit();
WebElement search = browserObject.findElement(By.id("search_course"));
search.sendKeys("Automation Testing");
search.submit();




	}

}
