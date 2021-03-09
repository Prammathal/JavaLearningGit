package com.qa.testcase;

import com.qa.BaseTest;
import com.qa.Pages.SpreeMainPage;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilterProductVerificationTest extends BaseTest {
    SpreeMainPage spreemainpage;
 @Test
    public void verifyFilterProductTest() throws IOException {
     List<String> filteredProduct=new ArrayList<>();
     spreemainpage=new SpreeMainPage(driver);
     spreemainpage.clickBagLink();
     spreemainpage.clickPriceRangeCheckBox();
     spreemainpage.clickBottomSearchButton();
     filteredProduct=spreemainpage.getFilteredProducts();
     for (int i=0;i<filteredProduct.size();i++) {
         System.out.println("Filterere"+filteredProduct.get(i));

     }
     takeScreenshot();
 }
}
