package com.qa.testcase;

import com.qa.BaseTest;
import com.qa.Pages.HomePage;
import com.qa.Pages.SpreeMainPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest {
    HomePage home;
    SpreeMainPage spreemainpage;


    @Test
    public void validateLoginSuccessTest() {
        home=new HomePage(driver);
        home.clickLoginLink();
        login.openSpreeMainPage("prammathal02@gmail.com","Prammatooihal@02");
        spreemainpage=new SpreeMainPage(driver);
        Assert.assertEquals(spreemainpage.checkLoginSuccessMsg(),"Logged in successfully");
        spreemainpage.clickLogoutButton();
        Assert.assertTrue(home.verifyLogOutMsg());
    }


    @Test(priority=1)
    public void validateLoginFailureTest()
    {
        home=new HomePage(driver);
        home.clickLoginLink();
        login.openSpreeMainPage("prammathahffhl02@gmail.com","Prdgdg");
        String invalidLoginMsg=login.getInvalidLoginMsg();
        Assert.assertEquals(invalidLoginMsg,"Invalid email or password.");
    }


}
