package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    @FindBy(id = "link-to-login")
    private WebElement login;
    @FindBy(className = "alert")
    private WebElement logoutMsg;

    public HomePage(WebDriver driver) {

       super(driver);
    }

    public void clickLoginLink() {

        login.click();
    }

    public boolean verifyLogOutMsg() {
      return logoutMsg.isDisplayed();
    }




}
