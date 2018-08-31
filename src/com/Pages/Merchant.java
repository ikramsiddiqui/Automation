package com.Pages;


import java.util.List;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




/**
 * @author ikram
 *
 */
public class Merchant{
	
	
	WebDriver driver;

	public void LoginPageNew(WebDriver Idriver){
		
		this.driver =Idriver;
	}
	
	//merchant tab xpath
	
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-3']")
	WebElement merchantName;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-select-5']/div/div[1])]")
	WebElement selectCountry;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-4']")
	WebElement aliasName;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-5']")
	WebElement titleName;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-6']")
	WebElement descriptionName;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-7']")
	WebElement heading1Name;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-8']")
	WebElement searchTerm1Name;
	@FindBy(how = How.XPATH, using=".//*[@id='cdk-step-content-0-0']/form/div[8]/button/span")
	WebElement clickNext;
	//Xpath of  merchant tab on side menu
	@FindBy(how = How.XPATH, using=".//*[@id='main-navigation']/fuse-nav-vertical-group[1]/div[2]/fuse-nav-vertical-collapse[1]/a/span")
	WebElement clickMerchant;
	//Xpath of  List merchant tab on side menu
	@FindBy(how = How.XPATH, using=".//*[@id='main-navigation']/fuse-nav-vertical-group[1]/div[2]/fuse-nav-vertical-collapse[1]/div/fuse-nav-vertical-item[1]/a")
	WebElement clickListMerchant;
	//Xpath of Add merchant tab on side menu
	@FindBy(how = How.XPATH, using=".//*[contains(text(),'Add Merchant')]")
	WebElement clickAddMerchant;
	
	//Xpath of logo tab
	@FindBy(how = How.XPATH, using=".//*[@id='cdk-step-content-0-1']/form/div[4]/div/div/div/fancy-image-uploader/div/div[1]/div/button/div")
	WebElement logoimage;
	@FindBy(how = How.XPATH, using=".//*[@id='cdk-step-content-0-1']/form/div[5]/button[2]")
	WebElement imageNextButton;
	
	//xpath of category tab
	@FindBy(how = How.XPATH, using=".//*[@id='mat-select-8']/div")
	WebElement category;
	  
	
	//xpath of affiliate tab
	
	@FindBy(how = How.XPATH, using=".//*[@id='mat-select-9']/div/div[2]/div")
	WebElement affiliate;
	@FindBy(how = How.ID, using="mat-input-10")
	WebElement affiliateId;
	@FindBy(how = How.XPATH, using=".//*[@id='cdk-step-content-0-3']/form/div[3]/button[2]")
	WebElement affiliateClickNext;
	
	//xpath of url
	@FindBy(how = How.ID, using="mat-input-11")
	WebElement redirectUrl;
	@FindBy(how = How.ID, using="mat-input-13")
	WebElement domainUrl;
	/*@FindBy(how = How.ID, using="mat-input-13")
	WebElement normalizedUrl;*/
	@FindBy(how = How.XPATH, using=".//*[@id='cdk-step-content-0-4']/form/div[3]/button[2]")
	WebElement urlClickNext;
	@FindBy(how = How.XPATH, using=".//*[@id='cdk-step-content-0-5']/form/div[4]/button[2]")
	WebElement clickFinish;
	@FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/mat-table/mat-row[1]/mat-cell[9]/div/button/span/mat-icon")
	WebElement clickUpdateButton;
	@FindBy(how = How.XPATH, using=".//*[@id='cdk-overlay-4']/div/div/button")
	WebElement UpdateButton;
	
	
	
	
	public void Click_Merchant(){
	
		clickMerchant.click();
	}
	
	public void Click_ListMerchant(){
	
		clickListMerchant.click();
	}
	public void Click_AddButton(){
		
		clickAddMerchant.click();
	}
	public void MerchantName(String name){
	
		merchantName.sendKeys(name);
	}
	public void Alias(String alias){
		
		aliasName.sendKeys(alias);
	}
   public void Title(String title){
		
		titleName.sendKeys(title);
	}
   public void Description(String description){
	
	descriptionName.sendKeys(description);
}
   public void Heading1(String heading){
		
	heading1Name.sendKeys(heading);
} 
   public void SearchTerm(String searchterm){
		
		searchTerm1Name.sendKeys(searchterm);
	}
	public void MerchantField(WebDriver driver , String merchant){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement merchantName = driver.findElement(By.xpath(".//*[@id='mat-input-9']"));
		jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",merchantName);
		merchantName.sendKeys(merchant);
	}
	public void BasicClickNext(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",clickNext);
		   clickNext.click();


}
	public void SelectCountry(WebDriver driver){
		   WebElement selectCountry = driver.findElement(By.xpath(".//*[@id='mat-select-5']/div/div[1]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		selectCountry.click();
	       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	       driver.findElement(By.xpath(".//*[contains(text(),'Pakistan')]")).click();
      
	}
	public void SelectBarcode(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement selectBarcode = driver.findElement(By.xpath(".//*[@id='mat-select-6']/div/div[1]"));
		jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectBarcode);
		selectBarcode.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(text(),'barcode-001')]")).click();

	}

	public void SelectMerchantTier(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement selectMerchantTier = driver.findElement(By.xpath(".//*[@id='mat-select-7']/div/div[1]"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectMerchantTier);
		jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectMerchantTier);
		selectMerchantTier.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(text(),'TIER1')]")).click();

	}

	public void logo(String Imagepath){
		
		logoimage.sendKeys(Imagepath);
	}	
	
	public void ImageNextButton(){

		/*driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	   jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",imageNextButton);
	   imageNextButton.click();*/
	      			
	}

	//click category dropdown
	public void Category(WebDriver driver){

		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		// Add_Merchant.Category(driver)
		WebElement categorydropDown = driver.findElement(By.xpath(".//*[@id='mat-select-8']/div"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",categorydropDown);
		categorydropDown.click();
		WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-1"));
		List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
		System.out.println(options);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		for ( WebElement we: options) {
			if ( we.getText().contains( "Leather" ) )
			{
				we.click();
				break; }
		}

	     /*driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS); 
	     jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",category);
	     category.click();
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     WebElement selectCategory = driver.findElement(By.xpath(".//*[@id='mat-option-280']/span"));
	     jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectCategory);
	     selectCategory.click();*/
      
	}
	
     public void CategoryNextButton(){
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 JavascriptExecutor jsx = (JavascriptExecutor)driver;
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebElement element2 = driver.findElement(By.xpath(".//*[@id='cdk-step-content-0-2']/form/div[3]/button[2]"));
       jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element2);
       element2.click();
}
	
   public void SelectAffiliateNetwork(){

	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   JavascriptExecutor jsx = (JavascriptExecutor)driver;
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",affiliate);
	       affiliate.click();
	       //Select affiliate Network
	       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	       WebElement selectAfililate = driver.findElement(By.xpath(".//*[@id='mat-option-288']/span"));
	       jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectAfililate);
	       selectAfililate.click();
   } 
	
	public void Affiliate_Network(){
		
	      affiliate.click();
	}
	public void Affiliate_ID(String ID){
		
	      affiliateId.sendKeys(ID);
	}
	public void AffiliateNextClick(){

		
	      affiliateClickNext.click();
	}
	
	
	public void Redirect_Url(String RedirectUrl){

		
	      redirectUrl.sendKeys(RedirectUrl);
	}
	public void Domain_Url(String DomainURl){

		
	      domainUrl.sendKeys(DomainURl);
	}
/*	public void Normalized_Url(String NormalizedUrl){

		
	      normalizedUrl.sendKeys(NormalizedUrl);
	}*/
	public void UrlNextClick(){

		
	      urlClickNext.click();
	}

public void FinsihButton(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	JavascriptExecutor jsx = (JavascriptExecutor)driver;
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",clickFinish);
	  clickFinish.click();
}

public void ClickUpdate(){
     clickUpdateButton.click();
	
}
public void UpdateButton(){
  UpdateButton.click();
	
}

}
