package com.luma.testsuite;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();

    @Test
    public void verifyUserShouldAddProductSuccessfullyToShoppingCart() {

        homePage.mouseHoverOnGearMenu();//Mouse Hover on Gear Menu
        homePage.clickOnBagsLink();//Click on Bags
        gearPage.clickOnProductNameOvernightDuffle(); // Click on Product Name ‘Overnight Duffle’

    }

}
