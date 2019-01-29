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
	
	@FindBy(how = How.ID, using="automationId-merchant-name")
	WebElement merchantName;
	/*@FindBy(how = How.ID, using="mat-select-0 | mat-select-5")
	WebElement selectCountry;*/
	@FindBy(how = How.ID, using="automationId-merchant-alias")
	WebElement aliasName;
	@FindBy(how = How.ID, using="automationId-merchant-title")
	WebElement titleName;
	@FindBy(how = How.ID, using="automationId-merchant-description")
	WebElement descriptionName;
	@FindBy(how = How.ID, using="automationId-merchant-h1")
	WebElement heading1Name;
	@FindBy(how = How.ID, using="automationId-merchant-searchTerms")
	WebElement searchTerm1Name;
	@FindBy(how = How.ID, using="automationId-merchant-next")
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
	@FindBy(how = How.ID, using="automationId-merchant-next1")
	WebElement imageNextButton;
	
	//xpath of category tab
	@FindBy(how = How.ID, using="automationId-merchant-Category")
	WebElement category;
	  
	
	//xpath of affiliate tab
	
	@FindBy(how = How.ID, using="automationId-merchant-affiliateNetwork")
	WebElement affiliate;
	@FindBy(how = How.ID, using="automationId-merchant-affiliateStatus")
	WebElement affiliateStatus;
	@FindBy(how = How.ID, using="automationId-merchant-affiliateMerchantId")
	WebElement affiliateId;
	@FindBy(how = How.ID, using="automationId-merchant-next3")
	WebElement affiliateClickNext;
	
	//xpath of url
	@FindBy(how = How.ID, using="automationId-merchant-redirectUrl")
	WebElement redirectUrl;
	@FindBy(how = How.ID, using="automationId-merchant-domainUrl")
	WebElement domainUrl;
	/*@FindBy(how = How.ID, using="mat-input-13")
	WebElement normalizedUrl;*/
	@FindBy(how = How.ID, using="automationId-merchant-next4")
	WebElement urlClickNext;
	@FindBy(how = How.ID, using="automationId-merchant-finishBtn")
	WebElement clickFinish;
	@FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/div/mat-table/mat-row[2]")
	WebElement clickUpdateButton;
	/*@FindBy(how = How.XPATH, using=".//*[@id='cdk-overlay-4']/div/div/button")
	WebElement UpdateButton;
	*/
	
	
	
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
   public void Heading1(WebDriver driver, String heading){

	   JavascriptExecutor H1 = (JavascriptExecutor)driver;
	   H1.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",heading1Name);
	heading1Name.sendKeys(heading);
} 
   public void SearchTerm(String searchterm){
		
		searchTerm1Name.sendKeys(searchterm);
	}
	public void linkToMasterUsStore(WebDriver driver){
		WebElement merchantName =driver.findElement(By.id("automationId-merchant-linkToMasterUsStore"));
		merchantName.sendKeys("N");
		WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-2"));
		List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
		System.out.println(options);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		for ( WebElement w: options) {
			if ( w.getText().contains( "N fini" ) )
			{
				w.click();
				break; }
		}
	}
	public void ClickNext(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor bn = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		bn.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",clickNext);
		clickNext.click();


}
	public void SelectCountry(WebDriver driver){
          WebElement selectCountry = driver.findElement(By.id("automationId-merchant-country"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		selectCountry.click();
	       driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	       driver.findElement(By.xpath(".//*[contains(text(),'Pakistan')]")).click();
      
	}
	public void SelectBreadCrumb(WebDriver driver){
		WebElement selectBarcode = driver.findElement(By.id("automationId-merchant-breadcrumb"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		selectBarcode.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(text(),'Academic Software')]")).click();

	}
	public void SelectBarcode(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor bcx = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement selectBarcode = driver.findElement(By.id("automationId-merchant-barcodeFormat"));
		bcx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectBarcode);
		selectBarcode.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(text(),'barcode-001')]")).click();

	}

	public void SelectMerchantTier(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor smt = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement selectMerchantTier = driver.findElement(By.id("automationId-merchant-merchantTire"));
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		smt.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",selectMerchantTier);
		selectMerchantTier.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[contains(text(),'TIER1')]")).click();

	}

	public void logo(String Imagepath){
		
		logoimage.sendKeys(Imagepath);
	}	
	
	public void ImageNextButton(WebDriver driver){
		JavascriptExecutor nxt = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   nxt.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",imageNextButton);
		imageNextButton.click();
	      			
	}

	//click category dropdown
	public void Category(WebDriver driver){

		JavascriptExecutor ccx = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebElement categorydropDown = driver.findElement(By.id("automationId-merchant-merchantCategory"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		ccx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",categorydropDown);
		categorydropDown.click();
		//driver.findElement(By.id("automationId-merchant-merchantCategory-0")).click();
		WebElement optionsContainer = driver.findElement(By.id("cdk-overlay-5"));
		List<WebElement> options = optionsContainer.findElements(By.className("mat-option-text"));
		System.out.println(options);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		for ( WebElement we: options) {
			if ( we.getText().contains( "Department Stores" ) )
			{
				we.click();
				break; }
		}

      
	}
	
     public void CategoryNextButton(WebDriver driver){
		 JavascriptExecutor jsx = (JavascriptExecutor)driver;
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebElement element2 = driver.findElement(By.id("automationId-merchant-next2"));
       jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",element2);
       element2.click();
}
	
   public void SelectAffiliateNetwork(WebDriver driver){

	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   JavascriptExecutor jsx = (JavascriptExecutor)driver;
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       jsx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",affiliate);
	       affiliate.click();
	   WebElement AffiliateNetworkoptionsContainer = driver.findElement(By.id("cdk-overlay-6"));
	   System.out.println(AffiliateNetworkoptionsContainer);
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   List<WebElement> allOptions = AffiliateNetworkoptionsContainer.findElements(By.className("mat-option-text"));
	   for ( WebElement w: allOptions) {
		   if ( w.getText().contains("In House"))
		   {
			   w.click();
			   break;
		   }
	   }
   }

   public void SelectAffiliateStatus(WebDriver driver){
	   WebElement AffiliateNetworkStatusdropDown = driver.findElement(By.xpath(".//*[@id='mat-select-10'] "));
	   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	   JavascriptExecutor anx = (JavascriptExecutor)driver;
	   driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	   anx.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",AffiliateNetworkStatusdropDown);
	   AffiliateNetworkStatusdropDown.click();
	   WebElement AffiliateNetworkStatusOptionsContainer = driver.findElement(By.id("cdk-overlay-6"));
	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   List<WebElement> StatusOptions = AffiliateNetworkStatusOptionsContainer.findElements(By.className("mat-option-text"));
	   for ( WebElement s: StatusOptions) {
		   if ( s.getText().contains("Deactivated"))
		   {
			   s.click();
			   break;
		   }
	   }
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

	public void UrlNextClick(){

		
	      urlClickNext.click();
	}
	public void  UserManager(WebDriver driver){
		JavascriptExecutor us = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		WebElement ManagerdropDown = driver.findElement(By.id("automationId-merchant-manager"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		us.executeScript("arguments[0].scrollIntoViewIfNeeded(true);",ManagerdropDown);
		ManagerdropDown.click();
		//ManagerdropDown.sendKeys("I");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		WebElement ManagerContainer = driver.findElement(By.id("cdk-overlay-7"));
		List<WebElement> Manageroptions = ManagerContainer.findElements(By.className("mat-option-text"));
		System.out.println(Manageroptions);
		for ( WebElement M: Manageroptions) {
			if ( M.getText().contains("non admin (nonadmin)"))
			{
				M.click();
				break; }
		}
	}

public void FinsihButton(WebDriver driver){
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
  //UpdateButton.click();
	
}

}
