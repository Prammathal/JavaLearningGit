package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id="spree_user_email")
    private  WebElement email;
    @FindBy(id = "spree_user_password")
    private  WebElement password;
    @FindBy(name = "commit")
    private WebElement loginButton;
    @FindBy(className = "form-check-input")
    private WebElement rememberMeCheckBox;
    @FindBy(xpath = "//div[text()='Invalid email or password.']")
    private WebElement invalidLoginMsg;

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    public void openSpreeMainPage(String uname,String passwrd) {
       email.sendKeys(uname);
       password.sendKeys(passwrd);
       rememberMeCheckBox.click();
       loginButton.click();
    }

    public String getInvalidLoginMsg()
    {
        return invalidLoginMsg.getText();
    }
}
