package com.grusha.testtask.selenium.entities;

public enum Categories {
    KOMPUTER("//div[@data-group-id='header-layers-desktop_Elektronika']"),
    ELEKTRONIKA("//div[@data-group-id='departments_Elektronika']");;

    private String xpath;

    Categories(String xpath) {
        this.xpath = xpath;
    }

    public String xpath(){
        return xpath;
    }
}
