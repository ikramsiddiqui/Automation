package test.java;

import com.Pages.CMS_Login;
import com.Pages.Merchant;
import com.Pages.User;
import com.helper.browserfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserTestcCase {
    WebDriver driver = browserfactory.startBrowser("chrome", "http://pubapp.westus.cloudapp.azure.com/codesadmin/apps/dashboards/project/");

    //@Test
    @Test
    public void CMSlogin(){

        //create Login page and Add Merchant object
        CMS_Login CMSLogin = PageFactory.initElements(driver,CMS_Login.class);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //USer Email
        CMSLogin.UserEmail("k122023@nu.edu.pk");
        //User Password
        CMSLogin.UserPassword("12345678");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Click Login button
        CMSLogin.ClickLogin();

    }

    @Test
    public void Merchant() throws InterruptedException{
        User Add_User =PageFactory.initElements(driver, User.class);
        //click Merchant
       /* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Add_User.Click_ListUser();
*/


        //click List Merchant
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
     Add_User.Click_AddUser();
}
}
