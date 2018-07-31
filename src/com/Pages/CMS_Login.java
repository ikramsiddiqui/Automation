package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CMS_Login {
		WebDriver driver;
		
		public void LoginPageNew(WebDriver Idriver){
			
			this.driver =Idriver;
		}
		@FindBy(how = How.ID, using="mat-input-0")
		WebElement userEmailID;
		@FindBy(how = How.ID, using="mat-input-1")
		WebElement userPassword;
		@FindBy(how = How.XPATH, using=".//*[@id='login-form']/form/button")
		WebElement loginButton;
		
		//Enter Email address
		public void UserEmail(String email){
			userEmailID.sendKeys(email);
			
		}
		//Enter Password 
		public void UserPassword(String password){
		    userPassword.sendKeys(password);
		}
		//click login
		public void ClickLogin(){
		    loginButton.click();
		}
		
		
}
