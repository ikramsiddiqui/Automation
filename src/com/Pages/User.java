package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class User {


    WebDriver driver;

    public void LoginPageNew(WebDriver Idriver){

        this.driver =Idriver;
    }

    //merchant tab xpath
    @FindBy(how = How.XPATH, using=".//*[@id='main-navigation']/fuse-nav-vertical-group[4]/div[2]/fuse-nav-vertical-item[4]/a")
    WebElement clickListUser;
    //Xpath of  List merchant tab on side menu
    @FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[1]/div[3]/button/span/mat-icon")
    WebElement clickAddUser;
    //Xpath of Add merchant tab on side menu
    @FindBy(how = How.XPATH, using="//*[@id='mat-input-5']']")
    WebElement firstName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-6]")
    WebElement lastName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-7']")
    WebElement emailAddress;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-8']")
    WebElement phone;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-9']")
    WebElement userName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-10']")
    WebElement userType;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-11']")
    WebElement setPassword;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-12']")
    WebElement confirmPassword;




    public void Click_ListUser(){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(".//*[contains(text(),'List User')]"));
        js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element);
        element.click();
    }

    public void Click_AddUser(){

        clickAddUser.click();
    }
    public void FirstName(String name   ){

        firstName.sendKeys(name);
    }

    public  void LastName(String lastname){
        lastName.sendKeys(lastname);
    }

    public  void EmailAddress(String emailaddress){
        emailAddress.sendKeys(emailaddress);
    }
    public  void PhoneNumber(String phonenumber){
        phone.sendKeys(phonenumber);
    }
    public  void SetPassword(String setpassword){
        setPassword.sendKeys(setpassword);
    }
    public  void ConfirmPassword(String confirmpassword){
        confirmPassword.sendKeys(confirmpassword);
    }


}
