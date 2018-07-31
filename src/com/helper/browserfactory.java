package com.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class browserfactory {
  static WebDriver driver;
 public static WebDriver startBrowser(String BrowserName , String Url) {
	// System.out.println("1");
	  if(BrowserName.equals("firefox")){
		  driver = new FirefoxDriver();
	  }
	  else if (BrowserName.equals("chrome")){
	//	  System.out.println("2");
			System.setProperty("webdriver.chrome.driver","D:\\ikram\\chromedriver_win32\\chromedriver.exe");
		//	System.out.println("3");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  }
	  else if (BrowserName.equals("IE")){
		 
	  }
	//  System.out.println("4");
	  driver.manage().window().maximize();
	//  System.out.println("5");
		driver.get(Url);
	//	System.out.println("6");	
	 return driver;
		
		
}
 
}
