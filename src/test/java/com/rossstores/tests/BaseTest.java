package com.rossstores.tests;


import com.rossstores.driver.DriverManager;
import com.rossstores.pages.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.rossstores.driver.Driver.initDriver;
import static com.rossstores.driver.Driver.quitDriver;


public class BaseTest {

   HomePage homePage;
   ContactUsPageForm contactUsPageForm;
   FoundInStorePage foundInStorePage;
   StoreLocatorPage storeLocatorPage;
   CreditCardPage creditCardPage;

    @BeforeMethod

    public void setUp() {

        initDriver();
        homePage=new HomePage(DriverManager.getDriver());
        foundInStorePage =new FoundInStorePage(DriverManager.getDriver());
        contactUsPageForm =new ContactUsPageForm(DriverManager.getDriver());
        storeLocatorPage = new StoreLocatorPage(DriverManager.getDriver());
        creditCardPage = new CreditCardPage(DriverManager.getDriver());
    }

    @AfterMethod
    public void tearDown() {
        quitDriver();
    }
}

// For ALLURE report we should navigate to this URL
// https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/2.19.0/
// then click on " allure-commandline-2.19.0.zip
// copy path of bin and paste to
