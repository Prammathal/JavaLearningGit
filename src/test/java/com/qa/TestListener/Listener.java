package com.qa.TestListener;
import com.qa.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class Listener implements ITestListener
{

    @Override
    public void onTestStart(ITestResult result) {
// TODO Auto-generated method stub
    }

    @Override
    public void onTestSuccess(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Success of test cases and its details are : "+result.getName()+ " "+new Timestamp(System.currentTimeMillis()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : "+result.getName()+" " +new Timestamp(System.currentTimeMillis()));
        try {
            takeScreenshot(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeScreenshot(ITestResult result) throws IOException
    {
        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("webdriver");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenShotName=new File("Screenshots/"+ new Timestamp(System.currentTimeMillis())+".png");
        FileUtils.copyFile(src, screenShotName);
        String filePath=screenShotName.toString();
        Reporter.log("<img src='"+filePath+"'");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Skip of test cases and its details are : "+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : "+result.getName());
    }

    @Override
    public void onStart(ITestContext context) {
// TODO Auto-generated method stub
    }

    @Override
    public void onFinish(ITestContext context) {
// TODO Auto-generated method stub
    }



}
