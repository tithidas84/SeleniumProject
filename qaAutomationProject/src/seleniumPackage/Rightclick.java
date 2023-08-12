package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver browserObject;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
		browserObject = new ChromeDriver();
		// 3. Open the web page http://swisnl.github.io/jQuery-contextMenu/demo.html
		browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        
        // 4. In case of RightClick we use Actions class.Create object and pass the driver to the reference
        Actions action = new Actions(browserObject);    
	// 5. Locate the button using xpath and store the value in the reference that is rightClickElement
        WebElement rightClickElement = browserObject.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Thread.sleep(3000);
       // 6. Using the action reference call the contextclick method and pass  element to perform right click
        action.contextClick(rightClickElement).build().perform();
		
	}

}
