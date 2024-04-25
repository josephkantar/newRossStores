package com.rossstores.pages;

import com.rossstores.driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static com.rossstores.constants.FrameworkConstants.getCreditCardUrl;
import static com.rossstores.constants.FrameworkConstants.getUrl;
import static com.rossstores.utils.JSUtils.jsScrollClick;
import static com.rossstores.utils.JSUtils.scrollIntoViewJS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CreditCardPage extends BasePage {

    public CreditCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='btn btn-sticky-cc']")
    private WebElement applyCreditCardStickyButton;
    @FindBy(xpath = "//div[@class='card-cta']//a[@href='https://acquire1.comenity.net/?clientName=rossmastercard']")
    private WebElement module1ApplyNowButton;
    @FindBy(xpath = "//p[contains(text(),'Save 10% today on a Ross Dress for Less purchase when you open and pay with a Ross Mastercard')]")
    private WebElement module1Text;
    @FindBy(xpath = "//span[contains(text(),'More Savings, More Ross')]")
    private WebElement moreSavingText;
    @FindBy(xpath = "//p[contains(text(),'Get more every time you shop at Ross Dress for Less! Pay with a Ross Mastercard')]")
    private WebElement getMoreEveryText;
    @FindBy(xpath = "//span[contains(text(),'Cardmember Benefits')]")
    private WebElement tablecardmemberBenefitsText;
    @FindBy(xpath = "//span[contains(text(),'Get 10% off a purchase at Ross Dress for Less')]")
    private WebElement tableCMText1;
    @FindBy(xpath = "//span[contains(text(),'Tap to pay and redeem certificates with your phone')]")
    private WebElement tableCMText2;
    @FindBy(xpath = "//span[contains(text(),'Earn 5% back in Ross Rewards on purchases at Ross Dress for Less')]")
    private WebElement tableCMText3;
    @FindBy(xpath = "//span[contains(text(),'Earn 1% back in Ross Rewards on all other purchases where Mastercard is accepted')]")
    private WebElement tableCMText4;
    @FindBy(xpath = "//section[@class='card block___wysiwyg']//span[contains(text(),'Ross Mastercard')]")
    private WebElement tablerossMasterCardText;
    @FindBy(xpath = "//section[@class='card block___wysiwyg']//span[contains(text(),'Ross Credit Card')]")
    private WebElement tableossCreditCardText;
    @FindBy(xpath = "//p[contains(text(),'Saving at Ross is even easier when you manage your Ross Mastercard')]")
    private WebElement savingRossText;
    @FindBy(xpath = "//div[@class='card-cta']//a[@href='/credit-card/manage/']")
    private WebElement module2ManageMyCardButton;
    @FindBy(xpath = "//section[@class='card block___wysiwyg']//a[@href='/contact-us/']")
    private WebElement viewAllFAQSButton;

    @FindBy(xpath = "//h2[contains(text(),'FAQ')]")
    private WebElement faqTittle;
    @FindBy(xpath = "//span[contains(text(),'What is the difference between the Ross Mastercard')]")
    private WebElement faqQuestion1;
    @FindBy(xpath = "//span[contains(text(),'Can I choose the card type I want?')]")
    private WebElement faqQuestion2;
    @FindBy(xpath = "//span[contains(text(),'How do I apply for the Ross Credit Card Program?')]")
    private WebElement faqQuestion3;
    @FindBy(xpath = "//span[contains(text(),'How will I know if my application has been approve')]")
    private WebElement faqQuestion4;
    @FindBy(xpath = "//span[contains(text(),'What bank issues the Ross credit card?')]")
    private WebElement faqQuestion5;

    @FindBy(xpath = "//p[contains(text(),'The Ross Mastercard is a credit card that can be used anywhere Mastercard is accepted. Once approved, you will be eligible for the same benefits as the Ross Credit Card as well as 1% back as rewards')]")
    private WebElement faqAnswer1;
    @FindBy(xpath = "//p[contains(text(),'No, approval is determined on an individual basis ')]")
    private WebElement faqAnswer2;
    @FindBy(xpath = "//li[contains(text(),'Visit your nearest Ross Dress for Less store and a')]")
    private WebElement faqAnswer3;
    @FindBy(xpath = "//p[contains(text(),'You will be notified immediately on your mobile ph')]")
    private WebElement faqAnswer4;
    @FindBy(xpath = "//p[contains(text(),'Comenity Capital Bank issues the Ross Credit Card ')]")
    private WebElement faqAnswer5;

    @FindBy(xpath = "//section[@class='card block___wysiwyg']//p[contains(text(),'Valid one time only. Duplicate offers ')]")
    private WebElement footerText1;
    @FindBy(xpath = "//section[@class='card block___wysiwyg']//p[contains(text(),'Credit card offers are subject to credit approval.')]")
    private WebElement footerText2;
    @FindBy(xpath = "//section[@class='card block___wysiwyg']//p[contains(text(),'Ross Credit Card Accounts are issued by Comenity Capital Bank.')]")
    private WebElement footerText3;
    @FindBy(xpath = "//section[@id='footer-email-signup']")
    private WebElement footerEmailSignUpSection;
    @FindBy(xpath = "//div[@id='mainfooter']")
    private WebElement pageFooter;
    @FindBy(xpath = "//p[contains(text(),'©2024 Ross Stores, Inc. All rights reserved. All m')]")
    private WebElement pageFooterText1;
    @FindBy(xpath = "//span[contains(text(),'800‑335‑1115')]")
    private WebElement pageFooterText2;







    public CreditCardPage verifyCreditCardPageTittleUrl() throws InterruptedException {

        Allure.step("The user navigate to Credit card page and verify its url and tittle");

        navigateTo_URL(getCreditCardUrl());
        Thread.sleep(2000);

        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/credit-card/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Get a Ross Credit Card"));
        System.out.println("Store Locator Page url and tittle asserted ");


        return this;
    }

    public CreditCardPage verifyCreditCardPageTextsAndTittle() throws InterruptedException {

        Allure.step("The user navigate to Credit card page and verify text, buttons and tittles");

        navigateTo_URL(getCreditCardUrl());
        Thread.sleep(2000);

        boolean stickyCreditCard = applyCreditCardStickyButton.isDisplayed();
        System.out.println("stickyCreditCard buttin is displayed " + stickyCreditCard );
        boolean applyNowButton = module1ApplyNowButton.isDisplayed();
        System.out.println("applyNow Button   is displayed " + applyNowButton );
        boolean textModule1 = module1Text.isDisplayed();
        System.out.println("textModule1 text is displayed " + textModule1 );
        boolean textMoreSaving = moreSavingText.isDisplayed();
        System.out.println("textMoreSaving Text  is displayed " + textMoreSaving );
        boolean textMoreEvery = getMoreEveryText.isDisplayed();
        System.out.println("textMoreEvery text is displayed " + textMoreEvery );

        scrollIntoViewJS(tablecardmemberBenefitsText);

        boolean tableCMText = tablecardmemberBenefitsText.isDisplayed();
        System.out.println("tableCMText text is displayed " + tableCMText );
        boolean cardMemberText1 = tableCMText1.isDisplayed();
        System.out.println("cardMemberText1 text   is displayed " + cardMemberText1 );
        boolean cardMemberText2 = tableCMText2.isDisplayed();
        System.out.println("cardMemberText2 text is displayed " + cardMemberText2 );
        boolean cardMemberText3 = tableCMText3.isDisplayed();
        System.out.println("cardMemberText3 Text  is displayed " + cardMemberText3 );
        boolean cardMemberText4 = tableCMText4.isDisplayed();
        System.out.println("cardMemberText4 text is displayed " + cardMemberText4 );
        boolean tableCreditCard = tableossCreditCardText.isDisplayed();
        System.out.println("tableCreditCard Text  is displayed " + tableCreditCard );
        boolean tableMasterCard = tablerossMasterCardText.isDisplayed();
        System.out.println("tableMasterCard text is displayed " + tableMasterCard );


        scrollIntoViewJS(faqTittle);

        boolean textSavingRoss = savingRossText.isDisplayed();
        System.out.println("textSavingRoss text is displayed " + textSavingRoss );
        boolean manageMyCardText = module2ManageMyCardButton.isDisplayed();
        System.out.println("manageMyCardText text   is displayed " + manageMyCardText );
        boolean tittleFAQ = faqTittle.isDisplayed();
        System.out.println("tittleFAQ Text  is displayed " + tittleFAQ );
        boolean faqQuestionText1 = faqQuestion1.isDisplayed();
        System.out.println("faqQuestionText1 text is displayed " + faqQuestionText1 );
        boolean faqQuestionText2 = faqQuestion2.isDisplayed();
        System.out.println("faqQuestionText2 Text  is displayed " + faqQuestionText2 );
        boolean faqQuestionText3 = faqQuestion3.isDisplayed();
        System.out.println("faqQuestionText3 text is displayed " + faqQuestionText3 );
        boolean faqQuestionText4 = faqQuestion4.isDisplayed();
        System.out.println("faqQuestionText4 Text  is displayed " + faqQuestionText4 );
        boolean faqQuestionText5 = faqQuestion5.isDisplayed();
        System.out.println("faqQuestionText5 text is displayed " + faqQuestionText5 );

        scrollIntoViewJS(viewAllFAQSButton);

        boolean allFAQButton = tableossCreditCardText.isDisplayed();
        System.out.println("allFAQButton Button  is displayed " + allFAQButton );

        scrollIntoViewJS(footerText1);

        boolean textFooter1 = footerText1.isDisplayed();
        System.out.println("textFooter1 Text  is displayed " + textFooter1 );
        boolean textFooter2 = footerText2.isDisplayed();
        System.out.println("textFooter2 text is displayed " + textFooter2 );
        boolean textFooter3 = footerText3.isDisplayed();
        System.out.println("textFooter3 Text  is displayed " + textFooter3 );

        scrollIntoViewJS(footerEmailSignUpSection);

        boolean sectionEmailSignUp = footerEmailSignUpSection.isDisplayed();
        System.out.println("sectionEmailSignUp section  is displayed " + sectionEmailSignUp );
        boolean footerPage = pageFooter.isDisplayed();
        System.out.println("footerPage  is displayed " + footerPage );

        boolean textFooterOfPage1 = pageFooterText1.isDisplayed();
        System.out.println("textFooterOfPage1 text  is displayed " + textFooterOfPage1 );
        boolean textFooterOfPage2 = pageFooterText2.isDisplayed();
        System.out.println("textFooterOfPage2 text  is displayed " + textFooterOfPage2 );

        return this;
    }

    public CreditCardPage verifyCreditCardPageAllLinks() throws InterruptedException {

        Allure.step("The user navigate to Credit card page and verify all links");

        navigateTo_URL(getCreditCardUrl());
        Thread.sleep(2000);

        WebElement homePageLinksContainer = driver.findElement(By.tagName("body"));

        // Find all anchor elements within the container
        List<WebElement> allLinksHomePage = homePageLinksContainer.findElements(By.tagName("a"));

        // Print the total number of links
        System.out.println("Total Links: " + allLinksHomePage.size());

        // Iterate over each anchor element
        for (WebElement link : allLinksHomePage) {
            // Get the URL and page title
            String url = link.getAttribute("href");
            String title = link.getText();

            // Print the URL and link text
            System.out.println("URL: " + url);
            System.out.println("Link Text: " + title);

            try {
                // Create a URL object from the link URL
                URL linkURL = new URL(url);

                // Open a connection to the URL
                HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();

                // Set the request method to HEAD (to check only the status code)
                connection.setRequestMethod("HEAD");

                // Get the response code
                int responseCode = connection.getResponseCode();

                // Print the response code
                System.out.println("Response Code: " + responseCode);

                // Close the connection
                connection.disconnect();
            } catch (Exception e) {
                // Print any exceptions that occur during the connection
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }

        return this;
    }

    public CreditCardPage verifyCreditCardPageAllImages() throws InterruptedException {

        Allure.step("The user navigate to Credit card page and verify all images");

        navigateTo_URL(getCreditCardUrl());
        Thread.sleep(2000);

        List<WebElement> images = driver.findElements(By.tagName("img"));

        // Iterate through each image element
        for (WebElement image : images) {
            // Get the source (URL) of the image
            String imageURL = image.getAttribute("src");

            // Verify if the image source is not empty
            if (!imageURL.isEmpty()) {
                // Check if the image is loaded successfully
                boolean isImageLoaded = (boolean) ((JavascriptExecutor) driver).executeScript(
                        "return arguments[0].complete && typeof arguments[0].naturalWidth != 'undefined' && arguments[0].naturalWidth > 0", image);

                // Print the result
                if (isImageLoaded) {
                    System.out.println("Image loaded successfully: " + imageURL);
                } else {
                    System.out.println("Image failed to load: " + imageURL);
                }
            }
        }


        return this;
    }

    public CreditCardPage verifyCreditCardPageFAQs() throws InterruptedException {

        Allure.step("The user navigate to Credit card page  FAQ Section and and verify all answers displayed");

        navigateTo_URL(getCreditCardUrl());
        Thread.sleep(2000);

        scrollIntoViewJS(faqQuestion1);
        boolean question1 = (faqQuestion1).isDisplayed();
        System.out.println("question1 is displayed " + question1);
        jsScrollClick(faqQuestion1);
        Thread.sleep(1000);
        boolean faqAnswerText1  = (faqAnswer1).isDisplayed();
        System.out.println("faqAnswer1 Text is displayed " + faqAnswerText1);
        Thread.sleep(1000);

        scrollIntoViewJS(faqQuestion2);
        boolean question2 = (faqQuestion2).isDisplayed();
        System.out.println("question1 is displayed " + question2);
        jsScrollClick(faqQuestion2);
        Thread.sleep(1000);
        boolean faqAnswerText2  = (faqAnswer2).isDisplayed();
        System.out.println("faqAnswerText2 Text is displayed " + faqAnswerText2);
        Thread.sleep(1000);

        scrollIntoViewJS(faqQuestion3);
        boolean question3 = (faqQuestion3).isDisplayed();
        System.out.println("question3 is displayed " + question3);
        jsScrollClick(faqQuestion3);
        Thread.sleep(1000);
        boolean faqAnswerText3  = (faqAnswer3).isDisplayed();
        System.out.println("faqAnswerText3 Text is displayed " + faqAnswerText3);
        Thread.sleep(1000);

        scrollIntoViewJS(faqQuestion4);
        boolean question4 = (faqQuestion4).isDisplayed();
        System.out.println("question4 is displayed " + question4);
        jsScrollClick(faqQuestion4);
        Thread.sleep(1000);
        boolean faqAnswerText4  = (faqAnswer4).isDisplayed();
        System.out.println("faqAnswerText4 Text is displayed " + faqAnswerText4);
        Thread.sleep(1000);

        scrollIntoViewJS(faqQuestion5);
        boolean question5 = (faqQuestion5).isDisplayed();
        System.out.println("question5 is displayed " + question5);
        jsScrollClick(faqQuestion5);
        Thread.sleep(1000);
        boolean faqAnswerText5  = (faqAnswer5).isDisplayed();
        System.out.println("faqAnswerText5 Text is displayed " + faqAnswerText5);
        Thread.sleep(1000);


        return this;
    }



}

