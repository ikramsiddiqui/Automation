package com.Listener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pages.CMS_Login;
import com.Pages.Category;
import com.Pages.Merchant;
import com.helper.browserfactory;



public class Category_Testcase {
	WebDriver driver =browserfactory.startBrowser("chrome", "http://pubapp.westus.cloudapp.azure.com/codesadmin/pages");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//Cms login test case
	@Test 
	public void CMSlogin(){
	  
	  //create Login page and Add Merchant object
		CMS_Login CMSLogin = PageFactory.initElements(driver,CMS_Login.class);  
	  
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     //USer Email
       CMSLogin.UserEmail("k122023@nu.edu.pk");
     //User Password
       CMSLogin.UserPassword("123456789");
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     //Click Login button
       CMSLogin.ClickLogin();
       
	}
	
	@Test 
	public void Category() throws InterruptedException{
	  Merchant Add_Merchant =PageFactory.initElements(driver, Merchant.class);
	  Category Add_Category =PageFactory.initElements(driver, Category.class);
	  //click Merchant
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      Add_Merchant.Click_Merchant();
      driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       Add_Category.Click_Category();
       driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
       Add_Category.Click_ListCategory();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       Add_Category.Click_AddCategory();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       Add_Category.CategoryName("selenium");
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       Add_Category.CategoryDescription("Selenium category");
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       Add_Category.Click_AddCategory();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       Add_Category.ClikcSubCategory();
       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       Add_Category.SubCategoryDescription("Sub category");
	}
	}
