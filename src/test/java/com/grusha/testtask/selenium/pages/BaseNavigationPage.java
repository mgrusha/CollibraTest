package com.grusha.testtask.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseNavigationPage {
    protected WebDriver driver;
    public final int DEFAULT_TIMEOUT = 20;

    public BaseNavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    public StartPage closeAdvertisementWindows() {
        List<WebElement> closeAdvBtn = driver.findElements(By.xpath("//button[@data-analytics-interaction-value='closeIcon']"));
        if (closeAdvBtn.size() > 0) {
            closeAdvBtn.get(0).click();
        }
        return new StartPage(driver);
    }

}
