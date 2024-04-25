package com.rossstores.pages;


import com.rossstores.driver.DriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;

import static com.rossstores.constants.FrameworkConstants.getFoundInStoreUrl;
import static com.rossstores.constants.FrameworkConstants.getStoreLocatorUrl;
import static com.rossstores.utils.JSUtils.jsScrollClick;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class FoundInStorePage extends BasePage {

    public FoundInStorePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//section[@id='footer-email-signup']")
    private WebElement footerSignInModalWindow;
    @FindBy(xpath = "//div[@id='mainfooter']")
    private WebElement pageFooter;

    @FindBy(xpath = "//button[contains(text(),'Lifestyle')]")
    private WebElement categoryLifestyle;
    @FindBy(xpath = "//button[contains(text(),'Home')]")
    private WebElement categoryHome;
    @FindBy(xpath = "//button[contains(text(),'Fashion')]")
    private WebElement categoryFashion;
    @FindBy(xpath = "//button[contains(text(),'View All')]")
    private WebElement categoryAll;

//    @FindBy(xpath = "//div[@id='onetrust-pc-sdk']//button[@id='close-pc-btn-handler']")
//    private WebElement closeCookieButton;

    @FindBy(xpath = "//div[@class='ot-sdk-container']//..//..//.//..//button[@id='close-pc-btn-handler']")
    private WebElement closeCookieButton;


    public FoundInStorePage clickFoundInStoreLinkAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user navigate to Found In Store page");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);
        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/found-in-store/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Found in Store | Ross Dress for Less"));

        //jsScrollClick(closeCookieButton);

        return this;

        }

    public FoundInStorePage verifyTittlesAndTexts() throws InterruptedException {

        Allure.step("The user verify Found In Store page tittle and Texts");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        boolean pageTittle = driver.findElement(By.xpath("//span[contains(text(),'Found In-Store')]")).isDisplayed();
        System.out.println( " page Tittle is displayed " + pageTittle);
        boolean foundInStoreText = driver.findElement(By.xpath("//p[contains(text(),'Love it? Share it! Tag your latest Ross finds on Instagram.')]")).isDisplayed();
        System.out.println( " foundInStore Text is displayed " + foundInStoreText);
        boolean signInModalFooter = footerSignInModalWindow.isDisplayed();
        System.out.println("footer SignIn Modal Window is displayed " + signInModalFooter);
        boolean displayFooter = pageFooter.isDisplayed();
        System.out.println("footer Section is displayed " + displayFooter);



        return this;

        }
    public FoundInStorePage clickFoundInStoreSelectAllImages() throws InterruptedException {

        Allure.step("The user Select ALL from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        jsScrollClick(categoryAll);
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean allImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("All Image preview displayed " + allImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
         String destinationPath = "src/test/java/screenshots/ScreenshotForSelectedAll.png";

         try {
              //Save the screenshot to the specified path
              FileUtils.copyFile(screenshotFile, new File(destinationPath));
              System.out.println("Screenshot saved to: " + destinationPath);
              } catch (Exception e) {
              System.out.println("Failed to save screenshot: " + e.getMessage());
              }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);





        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectFashionImages() throws InterruptedException {

        Allure.step("The user Select fashion from dropdown Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        WebElement selectMenDropDown = categoryFashion;
        selectMenDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean menImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("fashion Image preview displayed " + menImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/java/screenshots/ScreenshotForSelectedFashion.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);





        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectHomeImages() throws InterruptedException {

        Allure.step("The user Select home from  Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        WebElement selectLadiesDropDown = categoryHome;
        selectLadiesDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean ladiesImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("home Image preview displayed " + ladiesImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/java/screenshots/ScreenshotForSelectedHome.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return this;

    }

    public FoundInStorePage clickFoundInStoreSelectLifestyleImages() throws InterruptedException {

        Allure.step("The user Select lifestyle from  Menu");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);


        WebElement selectShoesDropDown = categoryLifestyle;
        selectShoesDropDown.click();
        Thread.sleep(4000);

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement clickImage = driver.findElement(By.xpath("//div[@class='tile-image-wrapper']"));
        jsScrollClick(clickImage);
        Thread.sleep(2000);

        boolean shoesImageDisplayed = driver.findElement(By.xpath("//html")).isDisplayed();
        System.out.println("lifestyle Image preview displayed " + shoesImageDisplayed );

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // Specify the destination path
        String destinationPath = "src/test/java/screenshots/ScreenshotForSelectedLifestyle.png";

        try {
            //Save the screenshot to the specified path
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
            System.out.println("Screenshot saved to: " + destinationPath);
        } catch (Exception e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }


        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return this;

    }


    public StoreLocatorPage navigateToStoreLocatorPage() throws InterruptedException {
        Allure.step("The user navigate to StoreLocator page");

        navigateTo_URL(getStoreLocatorUrl());
        Thread.sleep(2000);

//        WebElement sendESC = driver.findElement(By.tagName("body"));
//        sendESC.sendKeys(Keys.ESCAPE);

        return new StoreLocatorPage(driver);
    }


}