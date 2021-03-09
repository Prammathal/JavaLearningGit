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

@Listeners(com.qa.TestListener.Listener.class)
public class SearchProductVerificationTest extends BaseTest {
    SpreeMainPage spreemainpage;
    @DataProvider(name="testData")
    public Object[][] seCredential()
    {
        return new Object[][]{
            {"Ruby"},
                {"Apache"},
                //{""}
          };
   }

    @Test (dataProvider = "testData")
    public void verifySearchProductRubyTest(String productName) throws IOException {

        List<String> resultsProduct=new ArrayList<>();
        spreemainpage = new SpreeMainPage(driver);
        spreemainpage.searchProduct(productName);
        if (spreemainpage.checkSearchResultTitle()) {
            String searchTitle = spreemainpage.getSearchResultTitle();
            Assert.assertEquals(searchTitle, "Search results for '" +productName + "'");
        }
        resultsProduct=spreemainpage.getResultsElement();
        for (String item:resultsProduct)
            {
                if(!productName.isBlank())
                {
                    Assert.assertTrue(item.contains(productName));
                }
                Assert.assertTrue(item.contains("Ruby")||item.contains("Apache"));


            }
    }


}
