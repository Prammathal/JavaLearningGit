package com.qa.testcase;

import com.qa.BaseTest;
import com.qa.Pages.HomePage;
import com.qa.Pages.SpreeMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddAndClearCartTest extends BaseTest {
    SpreeMainPage spreemainpage;

    @Test
    public void validateCartAmountTest() throws InterruptedException {

        spreemainpage = new SpreeMainPage(driver);
        Boolean result=spreemainpage.validateCartAmount(driver);
        Assert.assertTrue(result);

    }
    @Test
    public void validateAddAndClearCartTest()
    {
        spreemainpage = new SpreeMainPage(driver);
        String cartMessage=spreemainpage.addAndClearProductFromCart(driver);
        Assert.assertEquals(cartMessage,"Your cart is empty");

    }

}
