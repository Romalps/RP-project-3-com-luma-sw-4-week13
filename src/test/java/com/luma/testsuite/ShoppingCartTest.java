package com.luma.testsuite;

import com.luma.pages.*;
import com.luma.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {

    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();
    OvernightDuffleBagPage overnightDuffleBagPage = new OvernightDuffleBagPage();
    GearPage gearPage = new GearPage();
    ShoppingPage shoppingPage = new ShoppingPage();

    @Test
    public void verifyUserShouldAddCronusYogaPantProductSuccessfullyToShoppingCart() {


        homePage.mouseHoverMenMenu();
        homePage.mouseHoverOnBottoms();
        homePage.clickOnPantsLink();
        menPage.mouseHoverOnProductNameCronusYogaPant();
        menPage.clickOnCronusYogaPantSize32();
        menPage.clickOnCronusYogaPantColourBlack();

        menPage.addCronusYogaPantToCart();
        menPage.clickOnShoppingCartLinkIntoMessage();

        // Verify the text ‘Shopping Cart.'
        Assert.assertEquals("Shopping Cart", getTextFromElement(By.xpath("//span[@class='base']")));

        // Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals("Cronus Yoga Pant", getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")));

        // Verify the product size ‘32’
        Assert.assertEquals("32", getTextFromElement(By.xpath("//dd[contains(text(),'32')]")));
        // Verify the product colour ‘Black’

    }

    @Test
    public void verifyUserShouldAddOvernightDuffleProductSuccessfullyToShoppingCart() {


        homePage.mouseHoverOnGearMenu();//Mouse Hover on Gear Menu
        homePage.clickOnBagsLink();//Click on Bags
        gearPage.clickOnProductNameOvernightDuffle(); // Click on Product Name ‘Overnight Duffle’
        overnightDuffleBagPage.changeQty1To3(); // Change Qty 3
        overnightDuffleBagPage.clickOnAddToCartButtonInOvernightDuffleBag();// Click on ‘Add to Cart’ Button.
        overnightDuffleBagPage.clickOnShoppingCartLinkIntoMessage();// Click on ‘shopping cart’ Link into message
        waitUntilVisibilityOfElementLocated(By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']"), 20);
        // Verify the product name ‘Overnight Duffle’
        Assert.assertEquals("Overnight Duffle", getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']")));
        waitUntilVisibilityOfElementLocated(By.xpath("//input[@title='Qty']"), 20);
        //Verify the Qty is ‘3’
        Assert.assertEquals("3", getAttributeValue(By.xpath("//input[@title='Qty']"), "value"));
        waitUntilVisibilityOfElementLocated(By.xpath("(//span[@class='cart-price']//span)[2]"), 10);
        // Verify the product price ‘$135.00’
        Assert.assertEquals("$135.00", getTextFromElement(By.xpath("(//span[@class='cart-price']//span)[2]")));

        shoppingPage.changeOvernightDuffleQtyTo5();// Change Qty to ‘5’
        shoppingPage.clickOnUpdateShoppingCartButton();// Click on ‘Update Shopping Cart’ button
        waitUntilVisibilityOfElementLocated(By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']"), 20);
        // Verify the product price ‘$225.00’
        Assert.assertEquals("$225.00", getTextFromElement(By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")));


    }
}
