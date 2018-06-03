package com.grusha.testtask.selenium.pages;


import com.grusha.testtask.selenium.entities.Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartPage extends BaseNavigationPage {

    private static final By KATEGORIE = By.xpath("//div[@data-description='header dropdown categories_dropdown']");

    public StartPage(WebDriver driver) {
        super(driver);
    }

    public SubCategoriesChooserPage selectKategorie(Categories category){
        driver.findElement(By.xpath(category.xpath())).click();
        return new SubCategoriesChooserPage(driver);
    }

    public StartPage clickOnKategorie(){
        driver.findElement(KATEGORIE).click();
        return this;
    }
}
