package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenPage extends Utility {


    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By cronusYogaPantSize32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By cronusYogaPantColourBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCartLink = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");


    // Mouse Hover on product name Cronus Yoga Pant
    public void mouseHoverOnProductNameCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
    }

    //click on size 32.
    public void clickOnCronusYogaPantSize32() {
        clickOnElement(cronusYogaPantSize32);
    }

    //click on colour Black.
    public void clickOnCronusYogaPantColourBlack() {
        clickOnElement(cronusYogaPantColourBlack);
    }


    // click on ‘Add To Cart’ Button.
    public void addCronusYogaPantToCart() {
        clickOnElement(addToCartLink);
    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkIntoMessage() {
        clickOnElement(shoppingCartLink);
    }


}
