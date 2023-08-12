package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void testing()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
				WebDriver browserObject = new ChromeDriver();
				
				// 3. Open the web page https://www.amazon.com/
				 browserObject.get("https://www.amazon.com/");
	}
}
