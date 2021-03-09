package com.qa.testcase;

import com.qa.BaseTest;
import com.qa.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage home;
    @BeforeTest
    public void  setUPHome()
    {
        initialize();
        home=new HomePage(driver);
    }
    @Test
    public void validateLoginLinkTest()
    {
        home.clickLoginLink();
        String title=driver.getTitle();
        Assert.assertEquals(title,"Login - Spree Demo Site");

    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }


}
