package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacketsLink = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    // Mouse Hover on Women Menu
    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    // Mouse Hover on Tops
    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    // Click on Jackets
    public void clickOnJacketsLink() {
        clickOnElement(jacketsLink);
    }

    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pantsLink = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    // Mouse Hover on Men Menu
    public void mouseHoverMenMenu(){
        mouseHoverToElement(menMenu);
    }
    // Mouse Hover on Bottoms
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }
    // Click on Pants
    public void clickOnPantsLink(){
        clickOnElement(pantsLink);
    }

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bagOnLink = By.xpath("//span[normalize-space()='Bags']");

    // Mouse Hover on Gear Menu
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    // Click on Bags
    public void clickOnBagsLink(){
        clickOnElement(bagOnLink);
    }

}
