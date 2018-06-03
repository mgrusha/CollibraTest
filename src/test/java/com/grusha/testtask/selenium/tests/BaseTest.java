package com.grusha.testtask.selenium.tests;

import com.grusha.testtask.selenium.pages.StartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;

    protected WebDriver getDriver(){
        return driver;
    }

    protected void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public StartPage getStartPage() {
        driver.get("https://allegro.pl/");
            return new StartPage(driver).closeAdvertisementWindows();
}

    @BeforeEach
    public void setup(){
        initDriver();

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}

