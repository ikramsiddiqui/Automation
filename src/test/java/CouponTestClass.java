package test.java;

import com.Pages.CMS_Login;
import com.Pages.Coupon;
import com.Pages.Merchant;
import com.helper.browserfactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CouponTestClass {
    WebDriver driver = browserfactory.startBrowser("chrome", "http://pubapp.westus.cloudapp.azure.com/codesadmin/apps/dashboards/project/");

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

    @Test (priority = 1)
    public void Coupon() throws InterruptedException{
        Coupon Add_Coupon =PageFactory.initElements(driver, Coupon.class);
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.ClickCoupon();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
        Add_Coupon.ClickListCoupon(driver);
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.ClickAddCoupon();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.CouponTitle("30% off in macys");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.TypeMerchant(driver);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Add_Coupon.Description("Auotmation tester");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Add_Coupon.CouponStartTime(driver,"12:22AM");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Add_Coupon.SelectEndDate(driver);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Add_Coupon.CouponEndTime(driver,"12:02PM");
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Add_Coupon.CouponTag(driver,"Coupon tag");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.Restriction(driver,"restrict");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.CustomButton(driver, "custom");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.SelectPriority(driver);
        driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
        Add_Coupon.ClickCashBack();
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.EnterCashBack("4");
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
         Add_Coupon.CouponType(driver);
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        Add_Coupon.CouponCode(driver,"QWERAS");
        driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
        Add_Coupon.Category(driver);
        driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
        Add_Coupon.SeasonalEvent(driver);
        driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
       Add_Coupon.AddCouponButton(driver);


    }

    @Test(priority = 2)
     public void UpdateCoupon() throws InterruptedException{
    Coupon Add_Coupon =PageFactory.initElements(driver, Coupon.class);
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    Add_Coupon.ClickCoupon();
    driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
    Add_Coupon.ClickListCoupon(driver);
    driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
    Add_Coupon.ClickUpdateCoupon();
    driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
    Add_Coupon.UpdateCouponName("20% off in Newegg");
    driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
    Add_Coupon.UpdateMerchantCoupon(driver);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.UpdateCouponDescription("Newegg Coupon Description");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.UpdateStartTime("02:22AM");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.UpdateEndTime(driver,"02:22PM");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.UpdateCouponTag(driver,"Newegg Coupon Tag");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     Add_Coupon.UpdateCouponRestriction(driver,"Restriction update");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.UpdateCouponPriority(driver);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     Add_Coupon.UpdateCustomButton(driver,"custom");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.UpdateClickCashback(driver);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
/*

        if( driver.findElement(By.xpath(".//*[@id='mat-input-27']")).isEnabled()){
            System.out.println("Element is Enable");
        }else{
            System.out.println("Element is Disabled");
        }*/
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.UpdateCouponType(driver);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    Add_Coupon.ClickUpdateButton(driver);
  driver.close();

}

}

