package test.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.CMS_Login;
import com.Pages.Merchant;
import com.helper.browserfactory;

public class TestingClass {

	WebDriver driver =browserfactory.startBrowser("chrome", "http://pubapp.westus.cloudapp.azure.com/codesadmin/apps/dashboards/project/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//@Test
	@Test 
	public void CMSlogin(){
	  
	  //create Login page and Add Merchant object
	  CMS_Login CMSLogin = PageFactory.initElements(driver,CMS_Login.class);  
	  
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //USer Email
       CMSLogin.UserEmail("Coupon@user.com");
     //User Password
       CMSLogin.UserPassword("12345678");
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
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   
	  Add_Merchant.Click_AddButton();
			  
			 //Enter merchant name
		    driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   Add_Merchant.MerchantName("AutoTester5");
	System.out.println("1");
		 //Select country 
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		  Add_Merchant.SelectCountry(driver);
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


		/*   Add_Merchant.SearchTerm("Aselenium");

		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   Add_Merchant.Merchant("Aselenium");
*/

/*
		  *//* driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);*//*
		   Add_Merchant.SelectBarcode(driver);*/

		/*   driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		   Add_Merchant.SelectMerchantTier(driver);*/

		   //Click Nextbuttton
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    JavascriptExecutor jsx = (JavascriptExecutor)driver;
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		  WebElement element = driver.findElement(By.xpath(".//*[@id='cdk-step-content-0-0']/form/div[9]/button/span"));
		 jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element);
		 element.click();
		 
		   //**************************************LOGO TAb*******************************\
		    //   Upload image  
	/*	 System.out.println("3");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		    Add_Merchant.logo("D:\\ikram\\Quotient\\test.jpg");*/

		
			 //click  next
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		   // Add_Merchant.ImageNextButton();    
		      driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		       WebElement element1 = driver.findElement(By.xpath(".//*[@id='cdk-step-content-0-1']/form/div[5]/button[2]"));
		       js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element1);
		       element1.click();
			   
   
		     ///------------------------------------Category TAb--------------------------------------------/////
			   //click category dropdown
		       driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
		      // Add_Merchant.Category(driver);
		       
		 WebElement categorydropDown = driver.findElement(By.xpath(".//*[@id='mat-select-8']/div"));
		     driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		  
		        js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",categorydropDown);
		     categorydropDown.click();
		     System.out.println("3");
		     WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-1"));
		     
		     List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
		  
		    	    for ( WebElement we: options) { 
		        
		    	        if ( we.getText().contains( "Shoes" ) )
		    	        	{
		    	  we.click();
		        	break;
		    	        	}
		    	    	 
		    	        }
		    	 System.out.println("Usama");

		       //click Category tab  next button
		       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		       
		    //  js.executeScript("scroll(0, 1000);");
		     

		       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		    WebElement element2 =  driver.findElement(By.xpath(".//*[@id='cdk-step-content-0-2']/form/div[3]/button[2]"));
		      js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element2);
		      element2.click();
		       
		      
		    ///------------------------------------Affiliate Network TAb--------------------------------------------/////
		       
		       
		       //Click  Affiliate network drop down
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   WebElement AffiliateNetworkdropDown = driver.findElement(By.xpath(".//*[@id='mat-select-9']/div"));
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",AffiliateNetworkdropDown);
		   AffiliateNetworkdropDown.click();
		   WebElement AffiliateNetworkoptionsContainer = driver.findElement(By.id("cdk-overlay-2"));
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   List<WebElement> allOptions = AffiliateNetworkoptionsContainer.findElements(By.className("mat-option-text"));
		    	    for ( WebElement w: allOptions) {
		    	        if ( w.getText().contains("In House"))
		    	        	{
		    	  w.click();
		        	break;
		        	}
		    	    }

		   //Click  Affiliate network status drop down
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   WebElement AffiliateNetworkStatusdropDown = driver.findElement(By.xpath(".//*[@id='mat-select-10']/div"));
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",AffiliateNetworkStatusdropDown);
		   AffiliateNetworkStatusdropDown.click();
		   WebElement AffiliateNetworkStatusOptionsContainer = driver.findElement(By.id("cdk-overlay-3"));
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		   List<WebElement> StatusOptions = AffiliateNetworkStatusOptionsContainer.findElements(By.className("mat-option-text"));
		   for ( WebElement s: StatusOptions) {
			   if ( s.getText().contains("Deactivated"))
			   {
				   s.click();
				   break;
			   }
		   }

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
		  /*------------------------------------Management TAb--------------------------------------------*/
		  
		  /*  Add_Merchant.FinsihButton();*/
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		    WebElement FinishButton = driver.findElement(By.xpath(" .//*[@id='cdk-step-content-0-5']/form/div[4]/button[2]"));
		    js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",FinishButton);
		    FinishButton.click();	      
}

       @Test(enabled=false)
	   public void UpdateMerchant() throws InterruptedException{
    	   Merchant Add_Merchant =PageFactory.initElements(driver, Merchant.class);
		     System.out.println("4");
  //click Merchant
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		     Add_Merchant.ClickUpdate();
		     
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
           Add_Merchant.UpdateButton();
       
       } 
	}
