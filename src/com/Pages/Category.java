package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Category {
	WebDriver driver;
	 JavascriptExecutor jsx = (JavascriptExecutor)driver;
	public void LoginPageNew(WebDriver Idriver){
		
		this.driver =Idriver;
	}
	@FindBy(how = How.XPATH, using=".//*[contains(text(),'Categories')]")
	WebElement clickCategory;
	//Xpath of  List merchant tab on side menu
	@FindBy(how = How.XPATH, using=".//*[contains(text(),'List Categories')]")
	WebElement clickListCategory;
	//Xpath of Add merchant tab on side menu
	@FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[1]/div[3]/button/span/mat-icon")
	WebElement clickAddcategory;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-4']")
	WebElement categoryName;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-5']")
	WebElement categoryDescription;
	@FindBy(how = How.XPATH, using=".//*[@id='file-manager']/mat-sidenav-container/mat-sidenav-content/div/div[2]/fuse-file-list/div/div/form/div[4]/button")
	WebElement clickSubCategory;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-17']")
	WebElement subCategoryName;
	@FindBy(how = How.XPATH, using=".//*[@id='mat-input-18']")
	WebElement subCategoryDescription;
	
	
	
	public void Click_Category(){
		

		clickCategory.click();
	}
	
	public void Click_ListCategory(){
	
		clickListCategory.click();
	}
	public void Click_AddCategory(){
		
		clickAddcategory.click();
	}
	
	public void CategoryName(String Categoryname){
	
		categoryName.sendKeys(Categoryname);
	}
	public void CategoryDescription(String Categorydescription){
		
		categoryDescription.sendKeys(Categorydescription);
	}
	
public void ClikcSubCategory(){
		
		clickSubCategory.sendKeys();
	}
	public void SubCategoryName(String SubCategoryname){
		
		subCategoryName.sendKeys(SubCategoryname);
	}
 public void SubCategoryDescription(String SubCategorydescription){
		
		subCategoryDescription.sendKeys(SubCategorydescription);
	}
	
}
