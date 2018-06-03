package com.grusha.testtask.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Period;

import static java.util.concurrent.TimeUnit.SECONDS;

public class GeneralFilterArea extends BaseNavigationPage {
    private static final String SUB_CATEGORIES = "//div[@id='opbox-category-tree']//a[contains(text(), '%s')]";
    private static final By RESULTS_AREA = By.id("opbox-listing");

    public GeneralFilterArea(WebDriver driver) {
        super(driver);
    }

    public GeneralFilterArea selectSubCategories(String categoryName) {
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        driver.findElement(By.xpath(String.format(SUB_CATEGORIES, categoryName))).click();
        return this;
    }

    public ResultsArea waitForResultArea(){
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(
                ExpectedConditions.visibilityOf(driver.findElement(RESULTS_AREA)));
        return new ResultsArea(driver);
    }
}
