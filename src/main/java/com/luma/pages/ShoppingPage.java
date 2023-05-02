package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingPage extends Utility {


    By qtyTo5 = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    // Change Qty to ‘5’
    public void changeOvernightDuffleQtyTo5() {
        sendTextToElement(qtyTo5, "5");
    }

    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updateCartButton);
    }

}
