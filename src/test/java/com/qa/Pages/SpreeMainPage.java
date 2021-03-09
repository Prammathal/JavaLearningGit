package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.*;
import java.util.ArrayList;

public class SpreeMainPage extends BasePage{
    @FindBy(xpath = "//div[text()='Logged in successfully']")
    private WebElement loginVerificationMsg;
    @FindBy(id="keywords")
    private WebElement searchField;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement searchButton;
    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logoutButton;
    @FindBy(className = "search-results-title")
    private WebElement searchresultTitle;
    @FindBy(xpath = "//a[contains(text(),'Bags')]")
    private WebElement bagsLink;
    @FindBys(@FindBy(className = "info"))
    private List<WebElement> products;
    @FindAll(@FindBy(xpath = "//div[@data-hook='products_list_item']"))
    private List<WebElement> filteredProducts;
    @FindBy(xpath = "//input[@id='Price_Range_$15.00_-_$18.00']")
    private WebElement priceCheckBox;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement bottomSearchButton;

    public SpreeMainPage(WebDriver driver)
    {

        super(driver);
    }


    public String checkLoginSuccessMsg()
    {
        return loginVerificationMsg.getText();

    }
    public void searchProduct(String searchFld)
    {
        searchField.clear();
        searchField.sendKeys(searchFld);
        searchButton.click();

    }

    public void clickLogoutButton()
    {
        logoutButton.click();
    }
    public boolean checkSearchResultTitle()
    {
        return searchresultTitle.isDisplayed();

    }
    public String getSearchResultTitle()
    {
        return searchresultTitle.getText();
    }
    public void clickBagLink()
    {
        System.out.println(bagsLink.getText());
        bagsLink.click();
    }
    public List<String> getResultsElement()
    {
        List<String> filteredProductNames=new ArrayList<>();

        for (WebElement element:filteredProducts) {
            filteredProductNames.add(element.getText());
        }
        return filteredProductNames;
    }
    public List<String> getFilteredProducts()
    {
        List<String> productNames=new ArrayList<>();

        for (WebElement element:products) {
            productNames.add(element.getText());
        }
        return productNames;
    }
    public void clickPriceRangeCheckBox()
    {
        priceCheckBox.click();
    }
    public void clickBottomSearchButton()
    {
        bottomSearchButton.click();
    }
}
