package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.WomenPage;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() {

        homePage.mouseHoverOnWomenMenu();
        homePage.mouseHoverOnTops();
        homePage.clickOnJacketsLink();

        // Verify the products name display in alphabetical order
        Assert.assertEquals(womenPage.jacketsNameListBefore, womenPage.jacketNameListAfter);
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homePage.mouseHoverOnWomenMenu();// Mouse Hover on Women Menu
        homePage.mouseHoverOnTops();// Mouse Hover on Tops
        homePage.clickOnJacketsLink();//Click on Jackets


        // Verify the products price display in Low to High
        Assert.assertEquals(womenPage.jacketPriceListBefore, womenPage.jacketPriceListAfter);
    }

}
