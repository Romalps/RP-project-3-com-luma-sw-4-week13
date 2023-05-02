package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {


    By overnightDuffleBag = By.xpath("//a[normalize-space()='Overnight Duffle']");


public void clickOnProductNameOvernightDuffle(){
    clickOnElement(overnightDuffleBag);

}



}
