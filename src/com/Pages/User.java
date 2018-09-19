package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class User {


    WebDriver driver;

    public void LoginPageNew(WebDriver Idriver){

        this.driver =Idriver;
    }


    @FindBy(how = How.XPATH, using=".//*[@id='main-navigation']/fuse-nav-vertical-group[4]/div[2]/fuse-nav-vertical-item[4]/a")
    WebElement clickListUser;
    @FindBy(how = How.XPATH, using=".//*[contains(text(),'Add User')]")
    WebElement clickAddUser;
    @FindBy(how = How.XPATH, using=".//*[contains(text(), 'User Status')]")
    WebElement clickActiveUser;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-3']")
    WebElement firstName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-4']")
    WebElement lastName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-5']")
    WebElement emailAddress;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-6']")
    WebElement phone;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-7']")
    WebElement userName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-8']")
    WebElement userType;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-9']")
    WebElement setPassword;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-10']")
    WebElement confirmPassword;
    @FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/div/div/form/div[9]/button/span")
    WebElement clickAddButton;

    /*-----------------------------------Update User Xpath-------------------------------------------*/

    @FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/mat-table/mat-row[3]/mat-cell[8]/div/button/span/mat-icon")
    WebElement clickupdateuser;
    @FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/mat-table/mat-row[3]")
    WebElement clickupdatebutton;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-14']")
    WebElement updateFirstName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-15']")
    WebElement updateLastName;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-16']")
    WebElement updateEmail;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-17']")
    WebElement updatePhoneNo;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-input-18']")
    WebElement updateUserType;
    @FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/div/div/form/div[8]/mat-chip-list/div/mat-chip/mat-icon")
    WebElement removeUserRole;
    @FindBy(how = How.XPATH, using=".//*[contains(text(),'UPDATE USER')]")
    WebElement updateButton;





    public void Click_ListUser(WebDriver driver){

        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(".//*[contains(text(),'List User')]"));
        js.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element);
        element.click();
    }

    public void Click_AddUser(){

        clickAddUser.click();
    }
    public  void ActiveUser(){
        clickActiveUser.click();
    }
    public void FirstName(String name){

        firstName.sendKeys(name);
    }

    public  void LastName(String lastname)
    {
        lastName.sendKeys(lastname);
    }
    public  void UserName(String username){
        userName.sendKeys(username);
    }
    public  void UserType(String usertype   ){
        userType.sendKeys(usertype);
    }
    public  void EmailAddress(String emailaddress)
    {
        emailAddress.sendKeys(emailaddress);
    }
    public  void PhoneNumber(String phonenumber)
    {
        phone.sendKeys(phonenumber);
    }
    public  void SetPassword(String setpassword)
    {
        setPassword.sendKeys(setpassword);
    }
    public  void ConfirmPassword(String confirmpassword)
    {
        confirmPassword.sendKeys(confirmpassword);
    }
    public void UserRole(WebDriver driver){
        WebElement UserRole = driver.findElement(By.id("mat-select-0"));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        JavascriptExecutor jr = (JavascriptExecutor)driver;
        jr.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",UserRole);
        UserRole.click();
        WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-0"));
        List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
        System.out.println(options);
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        for ( WebElement we: options) {
            if ( we.getText().contains( "super-admin" ) )
            {
                we.click();
                break; }
        }
    }
    public  void AddUserButton(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement AddButton = driver.findElement(By.xpath(".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/div/div/form/div[9]/button"));
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",AddButton);
        AddButton.click();;
    }


    /*-----------------------------------Update User method-------------------------------------------*/

    public  void ClickUpdateUser(){
        clickupdateuser.click();
    }
    public  void ClickUpdateButton(){
        clickupdatebutton.click();
    }
    public void UpdateFirstName(String updatename){
        updateFirstName.clear();
        updateFirstName.sendKeys(updatename);
    }
    public void UpdateLastNAme(String updatelastname){
       updateLastName.clear();
        updateLastName.sendKeys(updatelastname);
    }
    public void UpdateEmail(String updateemail){
        updateEmail.clear();
        updateEmail.sendKeys(updateemail);
    }
    public void UpdatePhoneNO(String updatephoneno){
        updatePhoneNo.clear();
        updatePhoneNo.sendKeys(updatephoneno);
    }
    public void UpdateUserType(String updateusertype){
        updateUserType.clear();
        updateUserType.sendKeys(updateusertype);
    }
    public void ClickUserStatus(){
        clickActiveUser.click();
    }

    public void RemoveUserRole(){
        removeUserRole.click();
    }

    public  void UpdateUserRole(WebDriver driver){
        WebElement updateUserRole = driver.findElement(By.id("mat-select-3"));
        JavascriptExecutor r = (JavascriptExecutor)driver;
        r.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateUserRole);
        updateUserRole.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //driver.findElement(By.xpath(".//*[contains(text(),'Merchant')]")).click();
        WebElement UseroptionsContainer = driver.findElement(By.id("cdk-overlay-2"));
        List<WebElement> Useroptions = UseroptionsContainer.findElements(By.className("mat-option-text"));
        System.out.println(Useroptions);
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);

        for ( WebElement u: Useroptions) {
            if ( u.getText().contains( "publisher" ) )
            {
                u.click();
                break; }
        }

    }

    public  void UpdateUserButton(WebDriver driver){

        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateButton);
        updateButton.click();
    }

}
