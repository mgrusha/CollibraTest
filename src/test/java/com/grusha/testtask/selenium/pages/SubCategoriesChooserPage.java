package com.grusha.testtask.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubCategoriesChooserPage extends BaseNavigationPage {

    private static final By KOMPUTERY = By.xpath("//div[@data-box-name='category - Elektronika']//li/a[contains(text(), 'Komputery')]");


    public SubCategoriesChooserPage(WebDriver driver) {
        super(driver);
    }

    public GeneralFilterArea clickOnComputer() {
        driver.findElement(KOMPUTERY).click();
        return new GeneralFilterArea(driver);
    }

}
