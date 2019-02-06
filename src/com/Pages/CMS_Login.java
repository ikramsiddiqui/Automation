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

		@FindBy(how = How.ID, using="login-email")
		WebElement userEmailID;
		@FindBy(how = How.ID, using="login-password")
		WebElement userPassword;
		@FindBy(how = How.ID, using="login-sendCode")
		WebElement loginButton;
	@FindBy(how = How.ID, using="login-securityCode")
	WebElement enterCode;
	@FindBy(how = How.ID, using="login-loginButton")
	WebElement clickButton;
		
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

		public void EnterSecurityCode(){
			enterCode.sendKeys("234786");
		}
		public void  ClickSubmit(){
			clickButton.click();
		}
		
}
