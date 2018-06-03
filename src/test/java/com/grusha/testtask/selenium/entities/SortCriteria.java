package com.grusha.testtask.selenium.entities;

public enum SortCriteria {
    priceAscending("cena: od najniższej");

    private String innerText;

    SortCriteria(String innerText) {
        this.innerText = innerText;
    }

    public String innerText(){
        return innerText;
    }
}
