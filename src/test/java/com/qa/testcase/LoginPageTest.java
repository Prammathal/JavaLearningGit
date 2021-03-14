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
        login.openSpreeMainPage("prammathal02@gmail.com","Prammathal@02");
        spreemainpage=new SpreeMainPage(driver);
        Assert.assertEquals(spreemainpage.checkLoginSuccessMsg(),"Logged in successfully");
        spreemainpage.clickLogoutButton();
        Assert.assertEquals(home.logOutMsg(),"Signed out successfully.");
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

    @Test(priority=2)
    public void validateLoginInvalidEmailTest()
    {
        home=new HomePage(driver);
        home.clickLoginLink();
        login.openSpreeMainPage("prammathahffhl02gmail.com","Prdgdg");
        String invalidEmailLoginMsg=login.getInvalidEmailLoginMsg();
        Assert.assertEquals(invalidEmailLoginMsg,"Please include an '@' in the email address. 'prammathahffhl02gmail.com' is missing an '@'.");
    }


}
