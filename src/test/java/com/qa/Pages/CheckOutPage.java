package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    @FindBy(xpath = "//span[@class='glyphicon glyphicon-shopping-cart']")
    WebElement cartAmount;
    public CheckOutPage(WebDriver driver)
    {
        super(driver);
    }

}
