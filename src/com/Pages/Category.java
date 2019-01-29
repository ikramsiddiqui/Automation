package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Category {
    WebDriver driver;
    JavascriptExecutor jsx = (JavascriptExecutor) driver;

    public void LoginPageNew(WebDriver Idriver) {

        this.driver = Idriver;
    }

    @FindBy(how = How.XPATH, using = ".//*[contains(text(),'Categories')]")
    WebElement clickCategory;
    //Xpath of  List merchant tab on side menu
    @FindBy(how = How.XPATH, using = ".//*[contains(text(),'List Categories')]")
    WebElement clickListCategory;
    //Xpath of Add merchant tab on side menu
    @FindBy(how = How.XPATH, using = ".//*[contains(text(), 'Add Categories')]")
    WebElement clickAddcategory;
    @FindBy(how = How.ID, using = "automationId-merchantCategory-name")
    WebElement categoryName;
    @FindBy(how = How.ID, using = "automationId-merchantCategory-description")
    WebElement categoryDescription;
    @FindBy(how = How.ID, using = "automationId-merchantCategory-addSubCategoryBtn")
    WebElement clickSubCategory;
    @FindBy(how = How.ID, using = "automationId-merchantCategory-subCategory-name-0")
    WebElement subCategoryName;
    @FindBy(how = How.ID, using = "automationId-merchantCategory-subCategory-description-0")
    WebElement subCategoryDescription;
    @FindBy(how = How.ID, using = "automationId-merchantCategory-normalizedName")
    WebElement categoryNormalized;
    @FindBy(how = How.ID, using = "automationId-merchantCategory-subCategory-Normalizedname-0")
    WebElement subcategoryNormalized;

    @FindBy(how = How.ID, using = "automationId-merchantCategory-status")
    WebElement categoryStatus;


    public void Click_Category() {


        clickCategory.click();
    }

    public void Click_ListCategory() {

        clickListCategory.click();
    }

    public void Click_AddCategory() {

        clickAddcategory.click();
    }

    public void CategoryName(String Categoryname) {

        categoryName.sendKeys(Categoryname);
    }

    public void CategoryDescription(String Categorydescription) {

        categoryDescription.sendKeys(Categorydescription);
    }

    public void ClikcSubCategory() {

        clickSubCategory.click();

    }

    public void SubCategoryName(String SubCategoryname) {

        subCategoryName.sendKeys(SubCategoryname);
    }

    public void SubCategoryDescription(String SubCategorydescription) {

        subCategoryDescription.sendKeys(SubCategorydescription);
    }

    public void NormalizedName(String normalizedName) {
        categoryNormalized.sendKeys(normalizedName);
    }

    public void SubNormalizedName(String subNormalizedName) {
        subcategoryNormalized.sendKeys(subNormalizedName);
    }


    public void CategoryStatus() {
      categoryStatus.click();
    }
}