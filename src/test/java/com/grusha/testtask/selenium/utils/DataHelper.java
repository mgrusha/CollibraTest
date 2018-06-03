package com.grusha.testtask.selenium.utils;

import java.util.List;
import java.util.stream.Collectors;

public class DataHelper {
    public static List<Integer> getNumberPrice(List<String> rawPrices){
        return rawPrices.stream().map(e ->e.replace(",00 zł","")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());

    }
}
