package test.java;

import com.Pages.CMS_Login;

import com.Pages.User;
import com.helper.browserfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserTestCase {
    WebDriver driver = browserfactory.startBrowser("chrome", "https://codes.pdn.coupons.com/codesadmin/");

    //@Test
    @Test (priority = 0)
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

    @Test(priority = 1)
    public void User() throws InterruptedException{
        User Add_User =PageFactory.initElements(driver, User.class);
        //click List User
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Add_User.Click_ListUser(driver);


        //click Add USer
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
       Add_User.Click_AddUser();



        //click the First name
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Add_User.FirstName("Quotient");
        //Enter Last name
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        Add_User.LastName("user");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        Add_User.ActiveUser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        Add_User.UserName("QuotiUser");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        Add_User.UserType("Internal");

        //Enter email Addres
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Add_User.EmailAddress("quotient321@qa.com");

       //Enter Phone number
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Add_User.PhoneNumber("9632587410");

        //Enter User Name
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Add_User.SetPassword("123456789");

        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Add_User.ConfirmPassword("123456789");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        Add_User.UserRole(driver);


       driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
         Add_User.AddUserButton(driver);

    }


    @Test (priority = 2)
    public  void UpdateUser(){
        User Add_User =PageFactory.initElements(driver, User.class);
        //click Merchant
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Add_User.Click_ListUser(driver);
        //driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
      //  Add_User.ClickUpdateUser();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.ClickUpdateButton();
        Add_User.ClickUpdateButton();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.UpdateFirstName("sdasdasd");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.UpdateLastNAme("asdasd");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.UpdateEmail("QA1@gmail.com");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.ClickUserStatus();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.UpdatePhoneNO("0333333621");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.UpdateUserType("asdas");
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.RemoveUserRole();
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Add_User.UpdateUserRole(driver);
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_User.UpdateUserButton(driver);
        driver.close();





    }

}
