package com.qa;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

@Listeners(com.qa.TestListener.Listener.class)
public class BaseTest {
    public WebDriver driver;
    public HomePage home;
    public LoginPage login;

    public void initialize()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/prammathalselvakumar/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://spree-vapasi.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    public String[] readCsvFile() throws FileNotFoundException {
        ArrayList<String> data = new ArrayList<>();
        File textFile = new File("/Users/prammathalselvakumar/IdeaProjects/SampleMavenSpreeProject/src/test/TestData/TestData.txt");
        Scanner in = new Scanner(textFile);
        while(in.hasNext()){
            String line = in.next();
            data.add(line);
        }
        in.close();
        String[] arr = new String[data.size()];
        return data.toArray(arr);
    }
    @BeforeTest
    public void setUpLogin(ITestContext testContext)
    {
        initialize();
        login=new LoginPage(driver);
        testContext.setAttribute("webdriver", driver);
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }


    public void takeScreenshot() throws IOException
    {
    File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File screenShotName=new File("Screenshots/"+ new Timestamp(System.currentTimeMillis())+".png");
     FileUtils.copyFile(src, screenShotName);
     String filePath=screenShotName.toString();
     //Reporter.log("<img src='"+filePath+"'");
    }
}


