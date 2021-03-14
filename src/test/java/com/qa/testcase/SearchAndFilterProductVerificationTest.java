package com.qa.testcase;

import com.qa.BaseTest;
import com.qa.Pages.SpreeMainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class SearchAndFilterProductVerificationTest extends BaseTest {
    SpreeMainPage spreemainpage;
    Object[][] prodItems =  new Object[][]{
        {"Ruby"},
        {"Apache"},
         {"Spree"},
         {"Headphones"}
    };

    @DataProvider(name="testData")
    public Object[][] seCredential()
    {
        return prodItems;
   }

    @Test (dataProvider = "testData")
    public void verifySearchProductTest(String productName)
    {

        spreemainpage = new SpreeMainPage(driver);
        Boolean result=spreemainpage.searchProduct(productName);
        Assert.assertTrue(result);

    }
    @Test
    public void verifyFilterProductTest() {
        spreemainpage=new SpreeMainPage(driver);
        Boolean result=spreemainpage.filterByPrice(15,18);
        Assert.assertTrue(result);

    }

}
