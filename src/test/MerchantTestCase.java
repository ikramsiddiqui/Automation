package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.thoughtworks.qdox.model.expression.Add;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.CMS_Login;
import com.Pages.Merchant;
import com.helper.browserfactory;

public class MerchantTestCase {

	WebDriver driver =browserfactory.startBrowser("chrome", "http://localhost:4200/apps/dashboards/project/");

	//@Test
	@Test (priority = 0)
	public void CMSlogin() throws InterruptedException {
	  
	  //create Login page and Add Merchant object
	  CMS_Login CMSLogin = PageFactory.initElements(driver,CMS_Login.class);  
	  
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //USer Email
       CMSLogin.UserEmail("admin@quotient.com");
     //User Password
       CMSLogin.UserPassword("123456789");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

     //Click Login button
  CMSLogin.ClickLogin();
       Thread.sleep(5000);
       CMSLogin.EnterSecurityCode();
		Thread.sleep(5000);
       CMSLogin.ClickSubmit();
       
	}

       @Test	(enabled = true)
		public void Merchant() throws InterruptedException{
		Merchant Add_Merchant =PageFactory.initElements(driver, Merchant.class);
		//click Merchant
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.Click_Merchant();
	      //click List Merchant
           Thread.sleep(10000);
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Add_Merchant.Click_ListMerchant();
		  //click Add Merchant
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       Add_Merchant.Click_AddButton();
	      //Enter merchant name
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   Add_Merchant.MerchantName("AutoTester5");
		 //Select country 
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.SelectCountry(driver);
		   driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		   Add_Merchant.Alias("selenium");
		   //Enter title
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.Title("selenium");
		   //Enter Description
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.Description("selenium");
		   //Enter breadcrumb
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Add_Merchant.SelectBreadCrumb(driver);
		   //Enter Heading1
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.Heading1(driver,"Selenium");
		   //Enter search term
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.SearchTerm("Aselenium");
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.SelectBarcode(driver);
		   //Selecte Merchant
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.linkToMasterUsStore(driver);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   Add_Merchant.SelectMerchantTier(driver);
		   //Click Nextbuttton
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   Add_Merchant.ClickNext(driver);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   //**************************************LOGO TAb*******************************\

	       //click  next image tab
		    Thread.sleep(20000);
		   Add_Merchant.ImageNextButton(driver);

		   //click  tab  next button
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   Add_Merchant.Category(driver);
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           Add_Merchant.CategoryNextButton(driver);

		    ///------------------------------------Affiliate Network TAb--------------------------------------------/////
		       
		   //Click  Affiliate network drop down
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   Add_Merchant.SelectAffiliateNetwork(driver);
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   //Add_Merchant.SelectAffiliateStatus(driver);
		   //Click  Affiliate network status drop down
		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		   //Enter Affiliate network ID
		   Add_Merchant.Affiliate_ID("12");
		   //Enter Affiliate next button
		   Add_Merchant.AffiliateNextClick();
		   ///------------------------------------URl TAb--------------------------------------------/////
		   //Enter  Redirect Url
		   Add_Merchant.Redirect_Url("https://www.google.com/");
		   //Enter  Domain Url
		   Add_Merchant.Domain_Url("https://www.google.com/");
		   Add_Merchant.UrlNextClick();
		   //*------------------------------------Management TAb--------------------------------------------*//*

		   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
         // Add_Merchant.UserManager(driver);

		//   Add_Merchant.FinsihButton(driver);
	//	  driver.quit();

}

       @Test(enabled = false)
	   public void UpdateMerchant() throws InterruptedException{
    	   Merchant Add_Merchant =PageFactory.initElements(driver, Merchant.class);
		     System.out.println("4");
  //click Merchant
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Add_Merchant.ClickUpdate();
		     
		   /*  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           Add_Merchant.UpdateButton();*/
       
       } 
	}
