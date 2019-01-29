package com.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Coupon {

    WebDriver driver;

    public void LoginPageNew(WebDriver Idriver){

        this.driver =Idriver;
    }

    @FindBy(how = How.XPATH, using=".//*[@id='main-navigation']/fuse-nav-vertical-group[1]/div[2]/fuse-nav-vertical-collapse[3]/a/span")
    WebElement clickCoupon;
    @FindBy(how = How.ID, using="automationId-list-coupons")
    WebElement clickListCoupon;
    @FindBy(how = How.ID, using="automationId-add-coupon")
    WebElement clickAddCoupon;
    @FindBy(how = How.ID, using= "automationId-coupon-title")
    WebElement couponTitle;
    @FindBy(how = How.ID, using="automationId-coupon-merchantName")
    WebElement typeMerchant;
    @FindBy(how = How.ID, using="automationId-coupon-description")
    WebElement  couponDescription;
    @FindBy(how = How.ID, using="automationId-coupon-startTime")
    WebElement  couponStartTime;
    @FindBy(how = How.ID, using="automationId-coupon-endTime")
    WebElement  couponEndTime;
    @FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/div/form/div[4]/div/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button")
    WebElement clickEndDate;
    @FindBy(how = How.ID, using="automationId-coupon-tags")
    WebElement couponTag;
    @FindBy(how = How.ID, using="automationId-coupon-restrictions")
    WebElement couponRestrict;
    @FindBy(how = How.ID, using="automationId-coupon-customBtnText")
    WebElement customButton;
    @FindBy(how = How.ID, using="automationId-coupon-cashback")
    WebElement clickCashBack;
    @FindBy(how = How.ID, using="automationId-coupon-cashbackPercentage")
    WebElement cbPercent;
    @FindBy(how = How.ID, using="automationId-coupon-couponType")
    WebElement couponType;
    @FindBy(how = How.ID, using="automationId-coupon-code")
    WebElement couponCode;
    @FindBy(how = How.CSS, using="mat-checkbox[id^='automationId-coupon-category-']")
    WebElement couponCategory;
    @FindBy(how = How.CSS, using="mat-checkbox[id^='automationId-coupon-seasonalEvent-']")
    WebElement couponSeasonalEvent;
    @FindBy(how = How.ID, using="automationId-coupon-submitBtn")
    WebElement addCouponButton;


    /*---------------------------------------Update Coupon Xpath----------------------------*/

    @FindBy(how = How.XPATH, using=".//*[contains(text(),'more_vert')]")
    WebElement clickUpdateCoupon;
    @FindBy(how = How.ID, using = "cdk-describedby-message-148")
    WebElement clickUpdate;
    @FindBy(how = How.ID, using="mat-input-25")
    WebElement updateCouponTitle;
    @FindBy(how = How.ID, using="mat-input-26")
    WebElement updateMerchantName;
    @FindBy(how = How.XPATH, using=".//*[@id='ngxEditor']/div/div")
    WebElement updateCouponDescription;
    @FindBy(how = How.ID, using="mat-input-31")
    WebElement updateCouponTag;
    @FindBy(how = How.ID, using="mat-input-32")
    WebElement updateCouponRestriction;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-select-12'] |.//*[@id='mat-select-17']")
    WebElement updateCouponPriority;
    @FindBy(how = How.ID, using="mat-input-35")
    WebElement updateCustomButton;
    @FindBy(how = How.XPATH, using=".//*[contains(text(),'Cashback Coupon')]")
    WebElement updateClickCashBack;
    @FindBy(how = How.XPATH, using=".//*[@id='mat-select-13'] | .//*[@id='mat-select-18']")
    WebElement updateCouponType;
    @FindBy(how = How.ID, using= "mat-input-28")
    WebElement updateStartTime;
    @FindBy(how = How.ID, using="mat-input-30")
    WebElement updateEndTime;
    @FindBy(how = How.XPATH, using=".//*[contains(text(),'Update Coupon')]")
    WebElement clickUpdateButton;







    /*---------------------------------------ADD Coupon field method----------------------------*/

    public void ClickCoupon(){
        clickCoupon.click();
    }
    public void ClickListCoupon(WebDriver driver){
        clickListCoupon.click();
    }
    public void ClickAddCoupon() {

        clickAddCoupon.click();
    }
    public void CouponTitle(String title){
        couponTitle.sendKeys(title);
    }
    public void  TypeMerchant(WebDriver driver) {
        try {
        typeMerchant.sendKeys("ma");
        WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-0"));
        List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
        System.out.println(options);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            for (WebElement we : options) {
                if (we.getText().contains("MAC Cosmetics")) {
                    we.click();
                    break;
                }


            }
        } catch (StaleElementReferenceException e) {
       System.out.println("Exception handle");
        }
    }

    public void Description(WebDriver driver, String description){
        Actions actions = new Actions(driver);
        actions.moveToElement(couponDescription);
        actions.click();
        actions.sendKeys(description);
        actions.build().perform();

    }
    public void CouponStartTime(WebDriver driver ,String couponstarttime){
        couponStartTime.sendKeys(couponstarttime);
    }

    public void SelectEndDate(WebDriver driver){
        JavascriptExecutor ced = (JavascriptExecutor)driver;
        ced.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",clickEndDate);
        clickEndDate.click();
        WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-1"));
        List<WebElement> options = optionsContainer.findElements(By.className("mat-calendar-body-cell-content"));
        System.out.println(options);
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
        for ( WebElement e: options) {
            if ( e.getText().contains( "30" ) )
            {
                e.click();
                break; }
        }
    }
    public void CouponEndTime(WebDriver driver,String couponendtime){
        JavascriptExecutor cet = (JavascriptExecutor)driver;
        cet.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",couponEndTime);
        couponEndTime.sendKeys(couponendtime);

    }
    public void CouponTag(WebDriver driver ,String tag){
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",couponTag);
        couponTag.sendKeys(tag);

    }
    public void  Restriction(WebDriver driver ,String restriction){
        JavascriptExecutor sx = (JavascriptExecutor)driver;
        sx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",couponRestrict);
        couponRestrict.sendKeys(restriction);
    }

    public void CustomButton(WebDriver driver , String custombutton) {
        JavascriptExecutor x = (JavascriptExecutor) driver;
        x.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", customButton);
        customButton.sendKeys(custombutton);
    }
    public void SelectPriority(WebDriver driver){
        WebElement selectPriority = driver.findElement(By.id("automationId-coupon-priority"));
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectPriority);
        selectPriority.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[contains(text(),'High')]")).click();
    }
    public void  ClickCashBack(){
        clickCashBack.click();
    }

    public  void EnterCashBack(String cbpercent){
        cbPercent.sendKeys(cbpercent);
    }
    public void CouponType(WebDriver driver){


        JavascriptExecutor jc = (JavascriptExecutor)driver;
        jc.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",couponType);
        couponType.click();
        WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-3"));
        List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
        System.out.println(options);
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
     for ( WebElement w: options) {
            if ( w.getText().contains( "Code" ) )
            {
                w.click();
                break; }
        }

    }

   public void CouponCode(WebDriver driver ,String code){
    JavascriptExecutor j = (JavascriptExecutor) driver;
    j.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", couponCode);
    couponCode.sendKeys(code);

}
   public  void  Category(WebDriver driver){
       JavascriptExecutor j = (JavascriptExecutor) driver;
       j.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", couponCategory);
       couponCategory.click();
   }
   public void SeasonalEvent(WebDriver driver){
       JavascriptExecutor s = (JavascriptExecutor) driver;
       s.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", couponSeasonalEvent);
       couponSeasonalEvent.click();
   }
   public void  AddCouponButton(WebDriver driver){

       JavascriptExecutor b = (JavascriptExecutor) driver;
       b.executeScript("arguments[0].scrollIntoViewIfNeeded(true);", addCouponButton);
       addCouponButton.click();

   }



    /*---------------------------------------Update Coupon field method----------------------------*/

public void ClickUpdateCoupon(WebDriver driver){
        clickUpdateCoupon.click();
    }
    public void ClickUpdate(WebDriver driver){
    clickUpdate.click();

    }
public void UpdateCouponName(WebDriver driver ,String updatecoupontitle){
        updateCouponTitle.clear();
        updateCouponTitle.sendKeys(updatecoupontitle);
}
public void UpdateMerchantCoupon(WebDriver driver){
        updateMerchantName.clear();
    updateMerchantName.sendKeys("N");
    WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-6"));
    List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
    System.out.println(options);
    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   try{ for ( WebElement w: options) {
        if ( w.getText().contains( "N fini" ) )
        {
            w.click();
            break; }
    }}
   catch (Exception e) {

       System.out.println("Exception occurred");
   }

}
public void UpdateCouponDescription(String updatecoupondescription){
        updateCouponDescription.clear();
        updateCouponDescription.sendKeys(updatecoupondescription);
}
public void UpdateCouponTag(WebDriver  driver, String updatecoupontag){
    JavascriptExecutor CT = (JavascriptExecutor)driver;
    CT.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateCouponTag);
        updateCouponTag.clear();
        updateCouponTag.sendKeys(updatecoupontag);
}
public void UpdateCouponRestriction(WebDriver driver ,String updatecouponrestriction){
    JavascriptExecutor cr = (JavascriptExecutor)driver;
    cr.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateCouponRestriction);
    updateCouponRestriction.clear();
    updateCouponRestriction.sendKeys(updatecouponrestriction);

}
public void UpdateCouponPriority(WebDriver driver){
    JavascriptExecutor cp = (JavascriptExecutor)driver;
    cp.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateCouponPriority);
    updateCouponPriority.click();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.findElement(By.xpath(".//*[contains(text(),'Low')]")).click();
}
public void UpdateCustomButton(WebDriver driver ,String updatecustom){
    JavascriptExecutor ccb = (JavascriptExecutor)driver;
    ccb.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateCustomButton);
    updateCustomButton.clear();
    updateCustomButton.sendKeys(updatecustom);
}
public void UpdateClickCashback(WebDriver driver){
    JavascriptExecutor ccb = (JavascriptExecutor)driver;
    ccb.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateClickCashBack);
    updateClickCashBack.click();
}
public void UpdateCouponType(WebDriver driver){
    JavascriptExecutor jc = (JavascriptExecutor)driver;
    jc.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateCouponType);
    updateCouponType.click();
    WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-8"));
    List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
    System.out.println("type" +options);
    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
     for ( WebElement w: options) {
        if ( w.getText().contains( "Sale" ) )
        {
            w.click();
            break; }
    }
}
public void UpdateStartTime(String updatestarttime){

   // updateStartTime.click();
    updateStartTime.sendKeys(updatestarttime);

}
public void UpdateEndTime(WebDriver driver ,String updateendtime){
    JavascriptExecutor cet = (JavascriptExecutor)driver;
    cet.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",updateEndTime);
   // updateEndTime.clear();
    updateEndTime.sendKeys(updateendtime);
}
public  void  ClickUpdateButton(WebDriver driver){
    JavascriptExecutor jc = (JavascriptExecutor)driver;
    jc.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",clickUpdateButton);
    clickUpdateButton.click();
}
}



