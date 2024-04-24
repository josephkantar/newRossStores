package com.rossstores.pages;


import com.rossstores.driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.rossstores.constants.FrameworkConstants.getStoreLocatorUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;




public class StoreLocatorPage extends BasePage {

        public StoreLocatorPage (WebDriver driver) {
            super(driver);
        }

    @FindBy(xpath = "//li[@id='menu-item-19']//a[@href='https://www.ddsdiscounts.com/store-locator/']")
    private WebElement navMenuStoreLocator;
    @FindBy(xpath = "//iframe[@id='iframe-store-locator']")
    private WebElement iframeStoreLocator;


        public StoreLocatorPage  verifyStoreLocatorPage() throws InterruptedException {

            Allure.step("The user navigate to StoreLocator page and verify its utl and tittle");

            navigateTo_URL(getStoreLocatorUrl());
            Thread.sleep(2000);

            WebElement sendESC = driver.findElement(By.tagName("body"));
            sendESC.sendKeys(Keys.ESCAPE);


            Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.ddsdiscounts.com/store-locator/");
            assertThat(DriverManager.getDriver().getTitle(), containsString("Store Locator"));
            System.out.println("Store Locator Page url and tittle asserted ");

//            scrollIntoViewJS(iframeStoreLocator);
//            driver.switchTo().frame(iframeStoreLocator);
//
//            driver.findElement(By.id("inputaddress")).clear();
//            //result by zipcode
//            driver.findElement(By.id("inputaddress")).sendKeys("78613");
//            driver.findElement(By.id("locator_submit")).click();
//            Thread.sleep(2000);
//
//            Boolean panelDisplayed = driver.findElement(By.id("panel")).isDisplayed();
//            System.out.println(panelDisplayed.booleanValue());
//
//            WebElement scrollToPanel = driver.findElement(By.id("panel"));
//            JavascriptExecutor js1 = (JavascriptExecutor) driver;
//            js1.executeScript("arguments[0].scrollIntoView();", scrollToPanel);
//            Thread.sleep(2000);

            return this;

        }
}
