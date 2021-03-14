package com.qa.Pages;

import com.qa.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
    private WebElement searchResultTitle;
    @FindBy(xpath = "//a[contains(text(),'Bags')]")
    private WebElement bagsLink;
    @FindBys(@FindBy(className = "info"))
    private List<WebElement> products;
    @FindBys(@FindBy(className = "col-md-3 col-sm-6 col-xs-6 product-list-item"))
    private List<WebElement> searchItems;
    @FindBy(xpath = "//input[@id='Price_Range_$15.00_-_$18.00']")
    private WebElement priceCheckBox;
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement bottomSearchButton;
    @FindBy(className = "price")
    WebElement price;
    @FindBy(xpath = "//a[contains(text(),'Mugs')]")
    WebElement shopByRuby;
    @FindBy(xpath = "//span[contains(text(),'Ruby on Rails Mug')]")
    WebElement rubyProduct;
    @FindBy(css = "#quantity")
    WebElement productQuantity;
    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    WebElement addToCartButton;
    @FindBy(xpath = "//span[contains(text(),'$13.99')]")
    WebElement productPrice;
    @FindBy(xpath = "//input[@class='btn btn-default']")
    WebElement emptyCart;
    @FindBy(xpath = "//div[contains(text(),'Your cart is empty')]")
    WebElement cartMessage;

    public SpreeMainPage(WebDriver driver)
    {

        super(driver);
    }

    public String checkLoginSuccessMsg()
    {
        return loginVerificationMsg.getText();

    }
    public void clickLogoutButton()
    {
        logoutButton.click();
    }
    public boolean checkSearchResultTitle()
    {
        return searchResultTitle.isDisplayed();

    }
    public String getSearchResultTitle()
    {
        return searchResultTitle.getText();
    }
    public boolean searchProduct(String productName)
    {
        searchField.clear();
        searchField.sendKeys(productName);
        searchButton.click();
        List<String> resultsProduct=new ArrayList<>();

        resultsProduct=getSearchResultsElement();
        for (String item:resultsProduct)
        {
            if(productName.length() > 0 && item.contains(productName))
            {

               return true;
            }
            else {
                return false;

            }
        }
      return true;
    }

    public List<String> getSearchResultsElement()
    {
        List<String> filteredProductNames=new ArrayList<>();

        for (WebElement element:products) {
            filteredProductNames.add(element.getText());
        }
        return filteredProductNames;
    }
    public List<String> getFilteredProducts()
    {
        List<String> productNames=new ArrayList<>();

        for (WebElement element:searchItems) {
            productNames.add(element.getText());
        }
        return productNames;
    }


    public boolean filterByPrice(int min, int max) {
        bagsLink.click();
        priceCheckBox.click();
        bottomSearchButton.click();
        List<String> prods = getFilteredProducts();
        double trimmedPrice;
        for(int i = 0; i < prods.size(); i++) {
            trimmedPrice = Double.parseDouble(prods.get(i).replace('$',' '));
            if(!(trimmedPrice >= min) && (trimmedPrice <= max))
                return false;
        }
        return true;
    }
public void addProductToCart(WebDriver driver)
{
    BaseTest base=new BaseTest();
    base.login(driver);
    shopByRuby.click();
    rubyProduct.click();
    productQuantity.clear();
    productQuantity.sendKeys("3");
    addToCartButton.click();

}
public boolean validateCartAmount(WebDriver driver)
{
    addProductToCart(driver);
    CheckOutPage cp=new CheckOutPage(driver);
    String cartAmount=cp.cartAmount.getText();
    double trimmedProductPrice = Double.parseDouble(productPrice.getText().replace('$',' '));
    double trimmedCartPrice = Double.parseDouble(cartAmount.replace('$',' '));
    if((trimmedProductPrice*3) == trimmedCartPrice)
    {
        return true;
    }
    else {
        return false;
    }

}
public String addAndClearProductFromCart(WebDriver driver)
{
    addProductToCart(driver);
    emptyCart.click();
   return cartMessage.getText();

}

}
