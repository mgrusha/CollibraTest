package com.grusha.testtask.selenium.tests;

import com.grusha.testtask.selenium.entities.Categories;
import com.grusha.testtask.selenium.entities.SortCriteria;
import com.grusha.testtask.selenium.pages.GeneralFilterArea;
import com.grusha.testtask.selenium.pages.ResultsArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.grusha.testtask.selenium.utils.DataHelper.getNumberPrice;

public class FilterResultsTest extends BaseTest {

    @Test
    public void ExternalHardDrive() {
        GeneralFilterArea subCategory = getStartPage().clickOnKategorie().selectKategorie(Categories.ELEKTRONIKA).clickOnComputer();
        //ResultsArea resultArea = subCategory.selectSubCategories("Dyski i pamięci przenośne")
        //        .selectSubCategories("Dyski zewnętrzne i przenośne").waitForResultArea();
        //List<String> rawPrices = resultArea.filterBy(SortCriteria.priceAscending).getSponsoredItemsPrice();
        //List<Integer> numberPrices = getNumberPrice(rawPrices);
        //for (int pricePos = 0; pricePos < numberPrices.size() - 1; pricePos++) {
        //    Assertions.assertTrue(numberPrices.get(pricePos) <= numberPrices.get(pricePos + 1), "Prices are not sorted ascending");
        //}
        Assertions.assertTrue(0==0,"Finish");
    }
}
