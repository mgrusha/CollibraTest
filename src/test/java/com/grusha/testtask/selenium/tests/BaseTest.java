package com.grusha.testtask.selenium.tests;

import com.grusha.testtask.selenium.pages.StartPage;
import com.sun.jndi.toolkit.url.Uri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;

    protected WebDriver getDriver(){
        return driver;
    }

    protected void initDriver() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

       // driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public StartPage getStartPage() {
        driver.get("https://allegro.pl/");
            return new StartPage(driver).closeAdvertisementWindows();
}

    @BeforeEach
    public void setup() throws MalformedURLException {
        initDriver();

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}

