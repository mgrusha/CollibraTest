package com.grusha.testtask.selenium.pages;

import com.grusha.testtask.selenium.entities.SortCriteria;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.LinkedList;
import java.util.List;

public class ResultsArea extends BaseNavigationPage {

    private static final By ORDER_BY = By.xpath("//select[@data-cookie='order']");
    private static final By SPONSORED_ITEMS = By.xpath("//h2[contains(text(), 'Lista promowanych ofert')]/../..//article");
    private static final By ITEM_PRICE = By.xpath("//div/div/div[2]/div[2]/div/span/span");
    private static final By RESULTS_AREA = By.id("opbox-listing");

    public ResultsArea(WebDriver driver) {
        super(driver);
    }

    public ResultsArea filterBy(SortCriteria sortCriteria) {
        Select sortBy = new Select(driver.findElement(ORDER_BY));
        sortBy.selectByVisibleText(sortCriteria.innerText());
        WebDriverWait wait = new WebDriverWait(driver, DEFAULT_TIMEOUT);
        wait.until(
                ExpectedConditions.visibilityOf(driver.findElement(RESULTS_AREA)));
        return this;
    }

    public List<String> getSponsoredItemsPrice() {
        List<String> prices = new LinkedList<String>();
        for (WebElement item : driver.findElements(SPONSORED_ITEMS)) {
            prices.add(item.findElement(ITEM_PRICE).getText());
        }
        return prices;
    }
}
