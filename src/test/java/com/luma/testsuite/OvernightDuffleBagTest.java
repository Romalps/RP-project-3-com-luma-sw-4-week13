package com.luma.testsuite;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDuffleBagPage;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OvernightDuffleBagTest extends BaseTest {

    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    OvernightDuffleBagPage overnightDuffleBagPage = new OvernightDuffleBagPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart() {

        homePage.mouseHoverOnGearMenu();//Mouse Hover on Gear Menu
        homePage.clickOnBagsLink();//Click on Bags
        gearPage.clickOnProductNameOvernightDuffle(); // Click on Product Name ‘Overnight Duffle’
        // Verify the text ‘Overnight Duffle’
        Assert.assertEquals("Overnight Duffle", getTextFromElement(By.xpath("//span[@class='base']")));

        overnightDuffleBagPage.changeQty1To3(); // Change Qty 3
        overnightDuffleBagPage.clickOnAddToCartButtonInOvernightDuffleBag();// Click on ‘Add to Cart’ Button.
        // Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals("You added Overnight Duffle to your shopping cart.", getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")));
        // Click on ‘shopping cart’ Link into message
        overnightDuffleBagPage.clickOnShoppingCartLinkIntoMessage();

    }


}
