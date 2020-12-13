package com.grusha.testtask.selenium.pages;


import com.grusha.testtask.selenium.entities.Categories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Step;

public class StartPage extends BaseNavigationPage {

    private static final By KATEGORIE = By.xpath("//div[@data-description='header dropdown categories_dropdown']");

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @Step("Select category")
    public SubCategoriesChooserPage selectKategorie(Categories category){
        driver.findElement(By.xpath(category.xpath())).click();
        return new SubCategoriesChooserPage(driver);
    }

    @Step("Click on category")
    public StartPage clickOnKategorie(){
      //  driver.findElement(KATEGORIE).click();
        return this;
    }
}
