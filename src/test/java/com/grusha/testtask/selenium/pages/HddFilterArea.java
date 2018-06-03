package com.grusha.testtask.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HddFilterArea extends GeneralFilterArea {

    private static final By diskVolumeFrom = By.id("pojemnosc-dysku-gb-od");
    private static final By diskVolumeTo = By.id("pojemnosc-dysku-gb-do");

    public HddFilterArea(WebDriver driver) {
        super(driver);
    }

    public HddFilterArea filterByVolume(String minVol, String maxVol){
        driver.findElement(diskVolumeFrom).sendKeys(minVol);
        driver.findElement(diskVolumeTo).sendKeys(maxVol);
        return this;
    }
}
