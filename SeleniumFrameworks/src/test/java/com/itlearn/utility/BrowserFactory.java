package com.itlearn.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
public static WebDriver startApplication(WebDriver driver,String browserName,String url)
{
	if(browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver1.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(op);
	}
	else if(browserName.equals("FireFox")) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
	}
	else if(browserName.equals("IE")) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
        driver = new FirefoxDriver();
	}
	else
	{
		System.out.println("The driver is not avilable ");
	}
	
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
}

public static void quitBrowser(WebDriver driver) {
	
	driver.close();
	// TODO Auto-generated method stub
	
}
}
