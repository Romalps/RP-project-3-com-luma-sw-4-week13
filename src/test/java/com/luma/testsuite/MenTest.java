package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();

    @Test
    public void VerifyUserShouldAddProductSuccessfullyToShoppingCart() {


        homePage.mouseHoverMenMenu();
        homePage.mouseHoverOnBottoms();
        homePage.clickOnPantsLink();
        menPage.mouseHoverOnProductNameCronusYogaPant();
        menPage.clickOnCronusYogaPantSize32();
        menPage.clickOnCronusYogaPantColourBlack();
        menPage.addCronusYogaPantToCart();

        // Verify the text You added Cronus Yoga Pant to your shopping cart.
        Assert.assertEquals("You added Cronus Yoga Pant to your shopping cart.", getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")));

        menPage.clickOnShoppingCartLinkIntoMessage();


    }


}
