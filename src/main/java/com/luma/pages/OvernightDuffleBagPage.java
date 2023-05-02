package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDuffleBagPage extends Utility {


    By changeQty = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");

    // Change Qty 3
    public void changeQty1To3() {
        sendTextToElement(changeQty, "3");
    }

    // Click on ‘Add to Cart’ Button.
    public void clickOnAddToCartButtonInOvernightDuffleBag() {
        clickOnElement(addToCartButton);
    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnShoppingCartLinkIntoMessage() {
        waitUntilVisibilityOfElementLocated(shoppingCartLink, 20);
        clickOnElement(shoppingCartLink);
    }

}
