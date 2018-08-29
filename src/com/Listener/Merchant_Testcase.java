/*
package com.Listener;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pages.Merchant;
import com.Pages.CMS_Login;
import com.helper.browserfactory;

@Listeners(ListenerTest.class)



public class Merchant_Testcase {
	
	WebDriver driver =browserfactory.startBrowser("chrome", "https://codes.pdn.coupons.com/codesadmin/apps/dashboards/project/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//Cms login test case
	@Test 
	public void CMSlogin(){
	  
	  //create Login page and Add Merchant object
		CMS_Login CMSLogin = PageFactory.initElements(driver,CMS_Login.class);  
	  
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //USer Email
       CMSLogin.UserEmail("admin@quotient.com");
     //User Password
       CMSLogin.UserPassword("123456789");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //Click Login button
       CMSLogin.ClickLogin();
       
	}
	
	@Test 
	public void Merchant() throws InterruptedException{
	  Merchant Add_Merchant =PageFactory.initElements(driver, Merchant.class);
	  //click Merchant
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      Add_Merchant.Click_Merchant();
      
      //click List Merchant
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  Add_Merchant.Click_ListMerchant();  
	  
	  //click Add Merchant
     Thread.sleep(2000);
	  Add_Merchant.Click_AddButton();
	  
	 //Enter merchant name
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
   Add_Merchant.MerchantName("Bselenium");
   
   //Select country 
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
  Add_Merchant.SelectCountry(driver);
      WebElement Country = driver.findElement(By.xpath(".//*[@id='mat-select-5']/div/div[1]"));
       Country.click();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       driver.findElement(By.xpath(".//*[contains(text(),'Pakistan')]")).click();

    
  	 //Enter Alias 
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
   Add_Merchant.Alias("selenium");
   
	 //Enter title 
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
   Add_Merchant.Title("selenium");
   
	 //Enter Description
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
   Add_Merchant.Description("selenium");
   
   //Enter Heading1
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
   Add_Merchant.Heading1("Aselenium");
   
   //Enter search term
   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
   Add_Merchant.SearchTerm("Aselenium");
  
   
   //Click Nextbuttton
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   //Add_Merchant.BasicClickNext();
 //Add_Merchant.BasicClickNext();
   JavascriptExecutor jsx = (JavascriptExecutor)driver;
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
  WebElement element = driver.findElement(By.xpath(".//*[@id='cdk-step-content-0-0']/form/div[8]/button/span"));
 jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element);
 element.click();
  
 
 
 
 
     //**************************************LOGO TAb*******************************\
    //   Upload image  
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
    Add_Merchant.logo("D:\\ikram\\Quotient\\test.jpg");
    
    
	 //click  next
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   // Add_Merchant.ImageNextButton();
       
//       driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
//       WebElement element1 = driver.findElement(By.xpath(".//*[@id='cdk-step-content-0-1']/form/div[5]/button[2]"));
//       js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element1);
//       element1.click();
//

       
       
       
       
     ///------------------------------------Category TAb--------------------------------------------/////
     
      

       //click category dropdown
       driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
      // Add_Merchant.Category(driver);
       
 WebElement categorydropDown = driver.findElement(By.xpath(".//*[@id='mat-select-8']/div"));
     driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
  
        js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",categorydropDown);
     categorydropDown.click();
     
     WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-1"));
     
     List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
  
    	    for ( WebElement we: options) { 
        
    	        if ( we.getText().contains( "Leather" ) )
    	        	{
    	  we.click();
        	}
    	    	 
    	        }
    	 System.out.println("Usama");

       //click Category tab  next button
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
       
    //  js.executeScript("scroll(0, 1000);");
       System.out.println("printp");

       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
    WebElement element2 =  driver.findElement(By.xpath(".//*[@id='cdk-step-content-0-2']/form/div[3]/button[2]"));
      js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element2);
      element2.click();

       ///------------------------------------Affiliate Network TAb--------------------------------------------/////
       
       
       //Click  Affiliate network drop down 
     //  Add_Merchant.SelectAffiliateNetwork();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     WebElement affiliate = driver.findElement(By.xpath("//*[@id='mat-select-9']/div/div[1]"));
    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
      js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",affiliate);
       affiliate.click();
       //Select affiliate Network
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      WebElement selectAfililate = driver.findElement(By.xpath(".//*[contains(text(),'Ratuken')]"));
      js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectAfililate);
       selectAfililate.click();
      
       //Enter Affiliate network ID
       Add_Merchant.Affiliate_ID("12");
       
       //Enter Affiliate next button 
       Add_Merchant.AffiliateNextClick();
     
       
       
       
  ///------------------------------------URl TAb--------------------------------------------/////
  
       //Enter  Redirect Url 
  Add_Merchant.Redirect_Url("https://www.google.com/");
  
  //Enter  Domain Url 
  Add_Merchant.Domain_Url("https://www.google.com/");
  Add_Merchant.Normalized_Url("https://www.google.com/");
  
//Enter normalized Url
  Add_Merchant.UrlNextClick();

  
  
------------------------------------Management TAb--------------------------------------------

  
  Add_Merchant.FinsihButton();

  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
  WebElement FinishButton = driver.findElement(By.xpath(" .//*[@id='cdk-step-content-0-5']/form/div[4]/button[2]"));
  js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",FinishButton);
  FinishButton.click();
 
	}
   @Test(dependsOnMethods= "Merchant")
   public void Logout(){
	   
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	   WebElement logoutButton= driver.findElement(By.xpath(" .//*[contains(text(),'Logout')]"));
	   js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",logoutButton);
	   logoutButton.click();
   }

  
	}
	

*/
