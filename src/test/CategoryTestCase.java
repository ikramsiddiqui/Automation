package test;

import com.Pages.CMS_Login;
import com.Pages.Merchant;
import com.Pages.Category;
import com.helper.browserfactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;




@Test
public class CategoryTestCase {

    WebDriver driver = browserfactory.startBrowser("chrome", "http://localhost:4200/apps/dashboards/project/");


    @Test (priority = 0)
    public void CMSlogin() throws InterruptedException {

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
        Thread.sleep(5000);
        CMSLogin.EnterSecurityCode();
        Thread.sleep(5000);
        CMSLogin.ClickSubmit();

    }
    @Test(priority = 1)
    public void AddCategory() throws InterruptedException {
        Merchant Add_Merchant = PageFactory.initElements(driver, Merchant.class);
        Category Add_Category = PageFactory.initElements(driver, Category.class);
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
        Add_Category.CategoryStatus();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.CategoryName("selenium");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.CategoryDescription("Selenium category");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.NormalizedName("Selenium category");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.Click_AddCategory();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.ClikcSubCategory();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.SubCategoryName("sub category");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.SubCategoryDescription("Sub category");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Add_Category.SubNormalizedName("Sub");

    }
}

