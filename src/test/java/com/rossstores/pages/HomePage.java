package com.rossstores.pages;


import com.opencsv.CSVWriter;
import com.rossstores.driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import static com.rossstores.constants.FrameworkConstants.getContactUsUrl;
import static com.rossstores.constants.FrameworkConstants.getUrl;
import static com.rossstores.utils.JSUtils.jsScrollClick;
import static com.rossstores.utils.JSUtils.scrollIntoViewJS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='logo']")
    private WebElement rossLogoTopPage;

    @FindBy(xpath = "//div[@class='modal-content']//button[@class='btn-close']")
    private WebElement signInModalWindowCloseButton;
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement signInModalWindow;
    @FindBy(xpath = "//div[@class='modal-body']//h2")
    private WebElement signInModalWindowHeaderTittle;
    @FindBy(xpath = "//div[@class='modal-body']//p[@xpath='1']")
    private WebElement signInModalWindowHeaderText;

    //HOMEPAGE IMAGE

    @FindBy(xpath = "//p[contains(text(),'Spread more holiday cheer for less.')]")
    private WebElement homePageModule1Image1Text;
    @FindBy(xpath = "//div[@class='slide-image-1']")
    private WebElement homePageModule1Image2;
    @FindBy(xpath = "//div[@class='slide-image-2']")
    private WebElement homePageModule1Image3;
    @FindBy(xpath = "//div[@class='slide-image-3']")
    private WebElement homePageModule1Image4;

    //MODULE 2 IMAGES AND BUTTONS

    @FindBy(xpath = "//div[@style='background-image: url(https://www.rossstores.com/wp-content/uploads/2023/05/cards_3col.webp); background-position: center center']")
    private WebElement homePageModule2Image1;
    @FindBy(xpath = "//p[contains(text(),'Save 10% today')]")
    private WebElement homePageModule2Image1Text;
    @FindBy(xpath = "//div[@style='background-image: url(https://www.rossstores.com/wp-content/uploads/2024/06/Hiring-Card-2024WEB-Final.jpg); background-position: center center']")
    private WebElement homePageModule2Image2;
    @FindBy(xpath = "//span[contains(text(),'Flexible Hours & Scheduling')]")
    private WebElement homePageModule2Image2Text;
    @FindBy(xpath = "//div[@style='background-image: url(https://www.rossstores.com/wp-content/uploads/2021/04/pageheader-giftcards.jpg); background-position: center center']")
    private WebElement homePageModule2Image3;
    @FindBy(xpath = "//p[contains(text(),'Give the gift of savings with a Ross gift card.')]")
    private WebElement homePageModule2Image3Text;
    @FindBy(xpath = "//div[@class='card-cta']//span[contains(text(),'Learn More')]")
    private WebElement homePageModule2Image1LearnMoreButton;
    @FindBy(xpath = "//div[@class='card-cta']//a[@href='https://jobs.rossstores.com/']")
    private WebElement homePageModule2Image2ApplyButton;
    @FindBy(xpath = "//div[@class='card-cta']//span[contains(text(),'Shop Gift Cards')]")
    private WebElement homePageModule2Image3ShopGiftCardButton;



     //GET INSPIRED IMAGES

    @FindBy(xpath = "//img[@src='https://www.rossstores.com/wp-content/uploads/2024/11/Nutcrakers.jpg']")
    private WebElement getInspiredImage1;
    @FindBy(xpath = "//img[@src='https://www.rossstores.com/wp-content/uploads/2024/11/Santa-Snow-globe.jpg']")
    private WebElement getInspiredImage2;
    @FindBy(xpath = "//img[@src='https://www.rossstores.com/wp-content/uploads/2024/11/Gingerbread-Decor.jpg']")
    private WebElement getInspiredImage3;
    @FindBy(xpath = "//img[@src='https://www.rossstores.com/wp-content/uploads/2024/11/Penguin-Snow-Globe.jpg']")
    private WebElement getInspiredImage4;
    @FindBy(xpath = "//h2[contains(text(),'FOUND IN STORE: HOLIDAY CHEER!')]")
    private WebElement getInspiredModuleTittle;
    @FindBy(xpath = "//p[contains(text(),'Tag your instagram posts with @rossdressforless an')]")
    private WebElement getInspiredModuleText;
    @FindBy(xpath = "//span[contains(text(),'Get Inspired')]")
    private WebElement getInspiredModuleButton;


    //Footer SignIN module

    @FindBy(xpath = "//div[@class='col-12 col-lg-6 header']//h2[contains(text(),'Sign Up for Emails')]")
    private WebElement footerSignInModuleTittle;
    @FindBy(xpath = "//div[@class='col-12 col-lg-6 header']//p[contains(text(),'See what we have in store for you!')]")
    private WebElement footerSignInModuleText;
    @FindBy(xpath = "//div[@class='disclaimer']//a[text()='Terms of Use']")
    private WebElement footerSignInTermsAndUse;
    @FindBy(xpath = "//div[@class='disclaimer']//a[@href='/privacy-policy/']")
    private WebElement footerSignInPrivacyPolicy;
    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign Up')]")
    private WebElement emailSignInPageSignMeUpButton;

    //footer

    @FindBy(xpath = "//div[@id='mainfooter']")
    private WebElement pageFooter;
    @FindBy(xpath = "//p[contains(text(),'©2024 Ross Stores, Inc. All rights reserved. All m')]")
    private WebElement footerText1;
    @FindBy(xpath = "//span[contains(text(),'800‑335‑1115')]")
    private WebElement footerText2;


    @FindBy(xpath = "//li[@id='menu-item-152']//a[@href='https://www.rossstores.com/about-us/']")
    private WebElement footerAboutUs;
    @FindBy(xpath = "//li[@id='menu-item-153']//a[@href='https://jobs.rossstores.com/']")
    private WebElement footerCareers;
    @FindBy(xpath = "//li[@id='menu-item-154']//a[@href='https://corp.rossstores.com/responsibility']")
    private WebElement footerSocialResponsibility;
    @FindBy(xpath = "//a[contains(text(),'Diversity, Equality & Inclusion')]")
    private WebElement footerDiversityEI;
    @FindBy(xpath = "//li[@id='menu-item-155']//a[@href='https://investors.rossstores.com/']")
    private WebElement footerGiftCard;
    @FindBy(xpath = "//li[@id='menu-item-155']//a[@href='https://investors.rossstores.com/']")
    private WebElement footerInvestors;
    @FindBy(xpath = "//a[contains(text(),'Product Sourcing & Human Rights')]")
    private WebElement footerProductsSourcing;
    @FindBy(xpath = "//li[@id='menu-item-168']//a[@href='https://www.rossstores.com/contact-us/']")
    private WebElement footerContactUs;
    @FindBy(xpath = "//li[@id='menu-item-170']//a[@href='https://myross.rossstores.com/']")
    private WebElement footerForAssociates;
    @FindBy(xpath = "//li[@id='menu-item-167']//a[@href='https://www.rossstores.com/legal-notices/']")
    private WebElement footerLegalNotices;
    @FindBy(xpath = "//li[@id='menu-item-169']//a[@href='https://www.rossstores.com/comparison-pricing/']")
    private WebElement footerComparisonPricing;
    @FindBy(xpath = "//li[@id='menu-item-166']//a[@href='https://www.rossstores.com/sitemap/']")
    private WebElement footerSiteMapLink;
    @FindBy(xpath = "//li[@id='menu-item-1400']//a[@href='https://www.rossstores.com/credit-card/']")
    private WebElement footerLearnMoreApplyNow;
    @FindBy(xpath = "//li[@id='menu-item-1401']//a[@href='/credit-card/manage/']")
    private WebElement footerManegeMyCard;
    @FindBy(xpath = "//li[@id='menu-item-1407']//img[@src='https://www.rossstores.com/wp-content/uploads/2023/05/cards.png']")
    private WebElement footerCreditCardLogo;
    @FindBy(xpath = "//li[@id='menu-item-158']//a[@href='https://www.rossstores.com/privacy-policy/']")
    private WebElement footerPrivacyLink;
    @FindBy(xpath = "//li[@id='menu-item-159']//a[@href='https://www.rossstores.com/terms-of-use/']")
    private WebElement footerTermsOfUse;
    @FindBy(xpath = "//li[@id='menu-item-160']//a[@href='https://corp.rossstores.com/accessibility']")
    private WebElement footerAccesssibilityLink;
    @FindBy(xpath = "//button[@class='ot-sdk-show-settings']")
    private WebElement footerDoNotSellLink;


    @FindBy(xpath = "//section[@id='footer-email-signup']")
    private WebElement footerSignUpSection;
    @FindBy(xpath = "//div[@class='col-12 col-lg-6']//div[@class='form-group col-12 col-lg-8']")
    private WebElement footerSignUpSectionNameField;
    @FindBy(xpath = "//div[@class='col-12 col-lg-6']//div[@class='form-group col-12']")
    private WebElement footerSignUpSectionEmailField;
    @FindBy(xpath = "//div[@class='col-12 col-lg-6']//div[@class='form-group col-12 col-lg-4']")
    private WebElement footerSignUpSectionZipCodeField;
    @FindBy(xpath = "//section[@id='footer-email-signup']//button[@type='submit']")
    private WebElement footerSignUpSectionSubmitBUtton;
    @FindBy(xpath = "//h2[contains(text(),'Thank You!')]")
    private WebElement footerSignUpSuccessMessage;

    //FROM NAV MENU EMAIL SIGN UP


    @FindBy(xpath = "//div[@class='form-group col-12 col-lg-8']//input[@class='form-control']")
    private WebElement emailSignUpPageNameField;
    @FindBy(xpath = "//div[@class='form-group col-12 col-lg-4']//input[@class='form-control']")
    private WebElement emailSignUpPageZipField;
    @FindBy(xpath = "//div[@class='form-group col-12']//input[@class='form-control']")
    private WebElement emailSignUpPageEmailField;
    @FindBy(xpath = "//section[@class=\"card block___email-signup\"]//button[@type='submit']")
    private WebElement emailSignUpPageSubmitButton;
    @FindBy(xpath = "//span[contains(text(),'Yes!')]")
    private WebElement emailSignUpPageSuccessMessage;

    //SOCIAL LINKS AND EMAIL SIGN IN - UNSUBCRIBE

    @FindBy(xpath = "//a[contains(text(),'unsubscribe')]")
    private WebElement navMenuSocialLinksUnsubcribe;
    @FindBy(xpath = "//p[contains(text(),'We’re sorry to see you go, but you’re always welco')]")
    private WebElement navMenuSocialLinksUnsubcribePageText;
    @FindBy(xpath = "//input[@id='form-email']")
    private WebElement navMenuSocialLinksUnsubcribePageEmailField;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    private WebElement navMenuSocialLinksUnsubcribePageSubmitButton;
    @FindBy(xpath = "//b[contains(text(),'We’re sad to see you go!')]")
    private WebElement unsubscribeSuccessMessage;



    @FindBy(xpath = "//li[@id='menu-item-162']//a[@href='https://www.rossstores.com/email-sign-up/']")
    private WebElement navMenuSocialLinksEmailSignUp;
    @FindBy(xpath = "//li[@id='menu-item-163']//a[@href='https://www.instagram.com/RossDressForLess']")
    private WebElement navMenuSocialLinksInstagram;
    @FindBy(xpath = "//li[@id='menu-item-164']//a[@href='https://www.facebook.com/RossDressForLess']")
    private WebElement navMenuSocialLinksFacebook;
    @FindBy(xpath = "//li[@id='menu-item-1404']//a[@href='https://www.rossstores.com/credit-card/']")
    private WebElement navMenuCreditCardLink;
    @FindBy(xpath = "//li[@id='menu-item-150']//a[@href='https://www.rossstores.com/found-in-store/']")
    private WebElement navMenuFoundInStoreLink;
    @FindBy(xpath = "//li[@id='menu-item-149']//a[@href='https://www.rossstores.com/store-locator/']")
    private WebElement navMenuStoreLocatorLink;




    //About Us BUTTONS

    @FindBy(xpath = "//a[@href='https://jobs.rossstores.com/']//span[contains(text(), 'Search for Jobs ')]")
    private WebElement aboutUsSearchForJobsButton;
    @FindBy(xpath = "//a[@href='https://corp.rossstores.com/responsibility/supporting-our-communities/boys-and-girls-clubs-of-america']")
    private WebElement aboutUsBGCAButton;

    //Contact Us Page FAQ Questions

    @FindBy(xpath = "//span[contains(text(),'General Return Policy')]")
    private WebElement faqQuestion1;
    @FindBy(xpath = "//span[contains(text(),'Fine Jewelry, Swimwear and Lingerie Return Policy')]")
    private WebElement faqQuestion2;
    @FindBy(xpath = "//span[contains(text(),'What is the difference between the Ross Mastercard')]")
    private WebElement faqQuestion3;
    @FindBy(xpath = "//span[contains(text(),'Can I choose the card type I want?')]")
    private WebElement faqQuestion4;
    @FindBy(xpath = "//span[contains(text(),'How do I apply for the Ross Credit Card Program?')]")
    private WebElement faqQuestion5;
    @FindBy(xpath = "//span[contains(text(),'How will I know if my application has been approve')]")
    private WebElement faqQuestion6;
    @FindBy(xpath = "//span[contains(text(),'Who should I contact regarding my application stat')]")
    private WebElement faqQuestion7;
    @FindBy(xpath = "//span[contains(text(),'What bank issues the Ross credit card?')]")
    private WebElement faqQuestion8;
    @FindBy(xpath = "//span[contains(text(),'When will I receive my Ross credit card?')]")
    private WebElement faqQuestion9;
    @FindBy(xpath = "//span[contains(text(),'How do I earn Rewards Dollars?')]")
    private WebElement faqQuestion10;
    @FindBy(xpath = "//span[contains(text(),'How do I view my Rewards Dollars and Rewards Certi')]")
    private WebElement faqQuestion11;
    @FindBy(xpath = "//span[contains(text(),'How do I redeem a Rewards Certificate in store?')]")
    private WebElement faqQuestion12;
    @FindBy(xpath = "//span[contains(text(),'How do I add my Ross credit card to my mobile wall')]")
    private WebElement faqQuestion13;
    @FindBy(xpath = "//span[contains(text(),'How do I pay my credit card bill?')]")
    private WebElement faqQuestion14;
    @FindBy(xpath = "//span[contains(text(),'Who do I contact if I need help or have questions ')]")
    private WebElement faqQuestion15;
    @FindBy(xpath = "//span[contains(text(),'How can I see my transaction details and credit ba')]")
    private WebElement faqQuestion16;
    @FindBy(xpath = "//span[contains(text(),'When do Rewards Dollars earned show up in my accou')]")
    private WebElement faqQuestion17;
    @FindBy(xpath = "//span[contains(text(),'When do Rewards Dollars earned expire?')]")
    private WebElement faqQuestion18;
    @FindBy(xpath = "//span[contains(text(),'When do Rewards Certificates earned expire?')]")
    private WebElement faqQuestion19;
    @FindBy(xpath = "//span[contains(text(),'How do I contact customer service?')]")
    private WebElement faqQuestion20;
    @FindBy(xpath = "//span[contains(text(),'Ross Mastercard FAQ')]")
    private WebElement faqQuestion21;
    @FindBy(xpath = "//span[contains(text(),'Ross Credit Card FAQ')]")
    private WebElement faqQuestion22;
    @FindBy(xpath = "//span[contains(text(),'Can I order items online from Ross Dress for Less?')]")
    private WebElement faqQuestion23;
    @FindBy(xpath = "//span[contains(text(),'Can you help me locate merchandise?')]")
    private WebElement faqQuestion24;
    @FindBy(xpath = "//span[contains(text(),'Do Gift Cards and Store Credits expire?')]")
    private WebElement faqQuestion25;
    @FindBy(xpath = "//span[contains(text(),'What happens to merchandise that does not sell?')]")
    private WebElement faqQuestion26;
    @FindBy(xpath = "//span[contains(text(),'Is a Ross Dress for Less catalog available?')]")
    private WebElement faqQuestion27;
    @FindBy(xpath = "//span[contains(text(),'Can I use a tax exemption certificate to shop tax ')]")
    private WebElement faqQuestion28;
    @FindBy(xpath = "//span[contains(text(),'Does Ross Dress for Less accept resale certificate')]")
    private WebElement faqQuestion29;
    @FindBy(xpath = "//span[contains(text(),'What is the 55+ Tuesday Discount?')]")
    private WebElement faqQuestion30;
    @FindBy(xpath = "//span[contains(text(),'Is it possible to buy your overstock or end-of-sea')]")
    private WebElement faqQuestion31;
    @FindBy(xpath = "//span[contains(text(),'Does Ross Dress for Less make donations to nonprof')]")
    private WebElement faqQuestion32;
    @FindBy(xpath = "//span[contains(text(),'Can you help me access your website?')]")
    private WebElement faqQuestion33;
    @FindBy(xpath = "//span[contains(text(),'When are your stores open?')]")
    private WebElement faqQuestion34;
    @FindBy(xpath = "//span[contains(text(),'Where can I find informati')]")
    private WebElement faqQuestion35;

    @FindBy(xpath = "//section[@class='card block___contact-form']")
    private WebElement contacUsFormSection;




//careers, social responsibiity, diversity, investors, products, for asso, access

    public HomePage verifySignInModalWindowDisplay() throws InterruptedException {

        Allure.step("Sign in Modal Window Displayed");
        navigateTo_URL(getUrl());
        Thread.sleep(5000);
        //driver.switchTo().frame(0);

        if (signInModalWindow.isDisplayed()) {

            WebElement modalWindowHeaderTittle = signInModalWindowHeaderTittle;
            System.out.println(modalWindowHeaderTittle.getText());
            System.out.println("signInModalWindowHeaderTittle and signInModalWindowHeaderText is displayed");
        } else {
            System.out.println("clear the cache the webpage and try again ");
        }

        WebElement sendESC = driver.findElement(By.tagName("body"));
        int numberOfTimesESC = 4;
        for (int i = 0; i <numberOfTimesESC ; i++) {
            sendESC.sendKeys(Keys.ESCAPE);
        }

        return this;

    }

//    public HomePage closeCookie() {
//
//        Allure.step("The user navigates to the home page " + getUrl());
//        //navigateTo_URL(getUrl());
//        if (closeCookieButton.isDisplayed()) {
//            closeCookieButton.click();
//        }else {
//
//        }
//
//        //click(closeCookieButton);
//
//        return this;
//    }



    public HomePage verifyHomePageTextsAndTittle() {
        Allure.step("Check that HomePage Texts And Tittles displayed as expected.");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        //Module 1
        jsScrollClick(homePageModule1Image1Text);

        boolean module1Img1Text = homePageModule1Image1Text.isDisplayed();
        System.out.println("module1Img Text is displayed " + module1Img1Text );
        boolean module1Image2 = homePageModule1Image2.isDisplayed();
        System.out.println("module1Image2 image is displayed " + module1Image2 );
        boolean module1Image3 = homePageModule1Image3.isDisplayed();
        System.out.println("module1Image3 image is displayed " + module1Image3 );
        boolean module1Image4 = homePageModule1Image4.isDisplayed();
        System.out.println("module1Image4 image is displayed " + module1Image4 );

        //module2

        jsScrollClick(homePageModule2Image1);

        boolean module2Img1 = homePageModule2Image1.isDisplayed();
        System.out.println("module2Img1 image is displayed " + module2Img1 );
        boolean module2Img1Text = homePageModule2Image1Text.isDisplayed();
        System.out.println("module2Img1 Text  is displayed " + module2Img1Text );
        boolean module2Img2 = homePageModule2Image2.isDisplayed();
        System.out.println("module2Img2 image is displayed " + module2Img2 );
        boolean module2Img2Text = homePageModule2Image2Text.isDisplayed();
        System.out.println("module2Img2 Text  is displayed " + module2Img2Text );
        boolean module2Img3 = homePageModule2Image3.isDisplayed();
        System.out.println("module2Img3 image is displayed " + module2Img3 );
//        boolean module2Img3Text = homePageModule2Image3Text.isDisplayed();
//        System.out.println("module2Img3 Text  is displayed " + module2Img3Text );
        //Button
        boolean module2Img1Button = homePageModule2Image1LearnMoreButton.isDisplayed();
        System.out.println("module2Img1 Button   is displayed " + module2Img1Button );
        boolean module2Img2Button = homePageModule2Image2ApplyButton.isDisplayed();
        System.out.println("module2Img2 Button  is displayed " + module2Img2Button );
        boolean module2Img3Button = homePageModule2Image3ShopGiftCardButton.isDisplayed();
        System.out.println("module2Img3 Button   is displayed " + module2Img3Button );

        // Get Inspired Text and Tittle

        scrollIntoViewJS(getInspiredModuleButton);

        boolean inspiredModuleTittle = getInspiredModuleTittle.isDisplayed();
        System.out.println("inspiredModule Tittle  is displayed " + inspiredModuleTittle );
        boolean inspiredModuleText = getInspiredModuleText.isDisplayed();
        System.out.println("inspiredModule Text   is displayed " + inspiredModuleText );
        boolean inspiredModuleButton = getInspiredModuleButton.isDisplayed();
        System.out.println("inspiredModule Button  is displayed " + inspiredModuleButton );
        boolean inspiredModuleImage1 = getInspiredImage1.isDisplayed();
        System.out.println("inspiredModule Image1   is displayed " + inspiredModuleImage1 );
        boolean inspiredModuleImage2 = getInspiredImage2.isDisplayed();
        System.out.println("inspiredModule Image2  is displayed " + inspiredModuleImage2 );
        boolean inspiredModuleImage3 = getInspiredImage3.isDisplayed();
        System.out.println("inspiredModule Image3   is displayed " + inspiredModuleImage3 );
        boolean inspiredModuleImage4 = getInspiredImage4.isDisplayed();
        System.out.println("inspiredModule Image4   is displayed " + inspiredModuleImage4 );

        //Footer sign in text and tittle

        scrollIntoViewJS(pageFooter);
        boolean footerSignInModuleTittle1 = footerSignInModuleTittle.isDisplayed();
        System.out.println(" footer SignIn Module Tittle1 displayed " + footerSignInModuleTittle1);
        boolean footerSignInModuleText1 = footerSignInModuleText.isDisplayed();
        System.out.println(" footer SignIn Module Text1  displayed " + footerSignInModuleText1);
        boolean footerSignInTermsAndUse1 = footerSignInTermsAndUse.isDisplayed();
        System.out.println(" footer SignInTermsAndUse displayed " + footerSignInTermsAndUse1);
        boolean footerSignInPrivacyPolicy1 = footerSignInPrivacyPolicy.isDisplayed();
        System.out.println(" footer SignIn Privacy Policy1 displayed " + footerSignInPrivacyPolicy1);
        boolean footerTittle = footerText1.isDisplayed();
        System.out.println(" footer Tittle displayed " + footerTittle);
        boolean footerText = footerText1.isDisplayed();
        System.out.println(" footer Text displayed " + footerText);


        return this;

    }

    public HomePage verifyHomePageLogoAndImage() {
        Allure.step("Check that HomePage Logo And Image displayed as expected.");

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

    public HomePage footerLinksList() throws InterruptedException {

        Allure.step("The user navigates to the footer links");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        WebElement footerBar = driver.findElement(By.xpath("//div[@id='mainfooter']"));

// Find all anchor elements within the navba

        List<WebElement> footerMenuLinks = footerBar.findElements(By.tagName("a"));

// Print the total number of footer links
        System.out.println("Total Footer Links: " + footerMenuLinks.size());

// Iterate over each anchor element
        for (WebElement footerLink : footerMenuLinks) {
            // Get the URL and page title without clicking
            String url = footerLink.getAttribute("href");
            String title = footerLink.getText();

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

    public HomePage allLinksOnHomePage() throws InterruptedException {

        Allure.step("The user verify all links on home page");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        // Navigate to the home page
        driver.get(getUrl());

        // Find the parent element containing all the links
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

    public HomePage navMenuList() throws InterruptedException {

        Allure.step("The user navigates to the nav menu links");

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        WebElement homePageLinksContainer = driver.findElement(By.tagName("body"));

        // Find all anchor elements within the container
        List<WebElement> allLinksHomePage = homePageLinksContainer.findElements(By.tagName("a"));

        // Print the total number of links
        System.out.println("Total Links: " + allLinksHomePage.size());

        // Create CSVWriter object to write data to CSV file
        try (CSVWriter writer = new CSVWriter(new FileWriter("RossHomePageLinks.csv"))) {
            // Write header to CSV file
            String[] header = {"URL", "Link Text", "Response Code"};
            writer.writeNext(header);

            // Iterate over each anchor element
            for (WebElement link : allLinksHomePage) {
                // Get the URL and page title
                String url = link.getAttribute("href");
                String title = link.getText();

                // Print the URL and link text
                System.out.println("URL: " + url);
                System.out.println("Link Text: " + title);

                int responseCode = -1;
                try {
                    // Create a URL object from the link URL
                    URL linkURL = new URL(url);

                    // Open a connection to the URL
                    HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();

                    // Set the request method to HEAD (to check only the status code)
                    connection.setRequestMethod("HEAD");

                    // Get the response code
                    responseCode = connection.getResponseCode();

                    // Print the response code
                    System.out.println("Response Code: " + responseCode);

                    // Close the connection
                    connection.disconnect();
                } catch (Exception e) {
                    // Print any exceptions that occur during the connection
                    System.out.println("Exception occurred: " + e.getMessage());
                }

                // Write URL, link text, and response code to CSV file
                String[] data = {url, title, String.valueOf(responseCode)};
                writer.writeNext(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return this;
    }

    public HomePage verifyModule2LearnMoreButton() throws InterruptedException {

        Allure.step("The user clicks LearMore button on Module 2 and navigates to CC Page");


        navigateTo_URL(getUrl());
        jsScrollClick(homePageModule2Image1LearnMoreButton);
        Thread.sleep(2000);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/credit-card/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Get a Ross Credit Card"));


        return this;
    }

    public HomePage verifyModule2ShopGiftCardButton() throws InterruptedException {

        Allure.step("The user clicks shopGiftCard button navigates to gift card Page");


        navigateTo_URL(getUrl());
        jsScrollClick(homePageModule2Image3ShopGiftCardButton);
        Thread.sleep(2000);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/gift-cards/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Gift Cards"));


        return this;
    }

    public HomePage verifyModule2ApplyTodayButton() throws InterruptedException {

        Allure.step("The user clicks applyToday button  and navigates to JOB Page");


        navigateTo_URL(getUrl());

        WebElement module2ApplyButton = homePageModule2Image2ApplyButton;
        ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('target');", module2ApplyButton);
        jsScrollClick(homePageModule2Image2ApplyButton);
        Thread.sleep(4000);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://jobs.rossstores.com/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Careers | Ross Stores"));


        return this;
    }

    public HomePage verifyGetInspiredButton() throws InterruptedException {

        Allure.step("The user clicks getInspired button and navigates to FoundInStore Page");


        navigateTo_URL(getUrl());
        jsScrollClick(getInspiredModuleButton);
        Thread.sleep(2000);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/found-in-store/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Found in Store | Ross Dress for Less"));


        return this;
    }

    public HomePage verifySocialLinksEmailSignUp() throws InterruptedException {

        Allure.step("The user clicks EmailSignUp on Nav menu Social LINKS");


        navigateTo_URL(getUrl());
        jsScrollClick(navMenuSocialLinksEmailSignUp);
        Thread.sleep(2000);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/email-sign-up/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Email Sign-Up"));

        System.out.println("maxlength for name field is " +emailSignUpPageNameField.getAttribute("maxlength"));
        System.out.println("maxlength for email field is " +emailSignUpPageEmailField.getAttribute("maxlength"));
        System.out.println("maxlength for zip code field is " + emailSignUpPageZipField.getAttribute("maxlength"));

        scrollIntoViewJS(emailSignUpPageNameField);
        emailSignUpPageNameField.sendKeys("Tester Name");
        emailSignUpPageEmailField.sendKeys("Test@test.com");
        emailSignUpPageZipField.sendKeys("78613");
        jsScrollClick(emailSignInPageSignMeUpButton);

        boolean emailSignUpSuccessmessage = emailSignUpPageSuccessMessage.isDisplayed();
        System.out.println("success message is displayed " + emailSignUpSuccessmessage );

        return this;
    }

    public HomePage verifySocialLinksEmailUnsubcribe() throws InterruptedException {

        Allure.step("The user clicks unsubcribe on emailsignup page");


        navigateTo_URL(getUrl());
        jsScrollClick(navMenuSocialLinksEmailSignUp);
        Thread.sleep(2000);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/email-sign-up/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Email Sign-Up"));

        jsScrollClick(navMenuSocialLinksUnsubcribe);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/email-sign-up/unsubscribe/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Unsubscribe"));

        boolean unsubscribePageText = navMenuSocialLinksUnsubcribePageText.isDisplayed();
        System.out.println("unsubscribePageText is displayed " + unsubscribePageText);

        navMenuSocialLinksUnsubcribePageEmailField.sendKeys("Test@test.com");
        Thread.sleep(2000);
        jsScrollClick(navMenuSocialLinksUnsubcribePageSubmitButton);
        Thread.sleep(1000);

        boolean unsubscribeSuccess = unsubscribeSuccessMessage.isDisplayed();
        System.out.println("unsubscribe success message is displayed " + unsubscribeSuccess);

        return this;
    }

    public HomePage verifySocialLinksInstagram() throws InterruptedException {

        Allure.step("The user clicks instagram on Nav menu Social LINKS and verify URL and Tittle");


        navigateTo_URL(getUrl());

        WebElement instagramlink = navMenuSocialLinksInstagram;
        ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('target');", instagramlink);
        jsScrollClick(navMenuSocialLinksInstagram);
        Thread.sleep(4000);

        String currentUrl = DriverManager.getDriver().getCurrentUrl();
        Assert.assertTrue(
                currentUrl.equals("https://www.instagram.com/RossDressForLess/") ||
                        currentUrl.equals("https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2FRossDressForLess%2F&is_from_rle"),
                "The current URL does not match the expected URLs." );


        //Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.instagram.com/RossDressForLess/");
        //Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), ":https://www.instagram.com/accounts/login/?next=https%3A%2F%2Fwww.instagram.com%2FRossDressForLess%2F&is_from_rle");


        return this;
    }

    public HomePage verifySocialLinksFacebook() throws InterruptedException {

        Allure.step("The user clicks facebook on Nav menu Social LINKS and verify URL and Tittle");


        navigateTo_URL(getUrl());
        WebElement facebooklink = navMenuSocialLinksFacebook;

        ((JavascriptExecutor)driver).executeScript("arguments[0].removeAttribute('target');", facebooklink);
        jsScrollClick(navMenuSocialLinksFacebook);
        Thread.sleep(4000);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.facebook.com/RossDressforLess/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Ross Dress for Less | Facebook"));

        return this;
    }


    public HomePage clickFooterAboutUsLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  About us  Links  on footer and verify Url and Tittle");

        navigateTo_URL(getUrl());

        if (signInModalWindow.isDisplayed()) {

            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
            closeSignInModalWindow.click();

        } else {

        }

        //navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerAboutUs);
        String actualFooterAboutUsLinkUrl = driver.getCurrentUrl();
        System.out.println(actualFooterAboutUsLinkUrl);
        String expectedFooterAboutUsLinkUrl = "https://www.rossstores.com/about-us/";
        Assert.assertEquals(actualFooterAboutUsLinkUrl, expectedFooterAboutUsLinkUrl);
        System.out.println("About Us URL passed");

        String actualFooterAboutUsLinkTittle = driver.getTitle();
        System.out.println(actualFooterAboutUsLinkTittle);
        String expectedFooterAboutUsLinkTittle = "About Us | Ross Dress for Less";
        Assert.assertEquals(actualFooterAboutUsLinkTittle, expectedFooterAboutUsLinkTittle);
        System.out.println("About Us  Tittle passed");
        //driver.navigate().back();

        scrollIntoViewJS(aboutUsSearchForJobsButton);
        jsScrollClick(aboutUsSearchForJobsButton);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);
                String actualAboutUsSearchJobsUrl = driver.getCurrentUrl();
                System.out.println(actualAboutUsSearchJobsUrl);
                String expectedAboutUsSearchJobsUrl = "https://jobs.rossstores.com/";
                Assert.assertEquals(actualAboutUsSearchJobsUrl, expectedAboutUsSearchJobsUrl);
                System.out.println("Assert URL passed");
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        scrollIntoViewJS(aboutUsBGCAButton);
        jsScrollClick(aboutUsBGCAButton);
        String parentWindow3 = driver.getWindowHandle();
        Set<String> handles3 = driver.getWindowHandles();
        for (String windowHandle : handles3) {
            if (!windowHandle.equals(parentWindow3)) {
                driver.switchTo().window(windowHandle);
                String actualAboutUsBGCABookUrl = driver.getCurrentUrl();
                System.out.println(actualAboutUsBGCABookUrl);
                String expectedAboutUsBGCABookUrl = "https://corp.rossstores.com/responsibility/supporting-our-communities/national-community-partners/";
                Assert.assertEquals(actualAboutUsBGCABookUrl, expectedAboutUsBGCABookUrl);
                System.out.println("Assert URL passed");
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow3); //cntrl to parent window

        boolean welcomeTittle = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to Ross Dress for Less')]")).isDisplayed();
        System.out.println("welcome Tittle  is displayed " + welcomeTittle);
        boolean welcomeText = driver.findElement(By.xpath("//p[contains(text(),'Since 1982, our focus has been on bringing our cus')]")).isDisplayed();
        System.out.println("welcome Text is displayed " + welcomeText);
        boolean thePowerTittle = driver.findElement(By.xpath("//h2[contains(text(),'The Power of Saving')]")).isDisplayed();
        System.out.println("thePowerTittle Tittle  is displayed " + thePowerTittle);
        boolean thePowerText = driver.findElement(By.xpath("//p[contains(text(),'We’re big—as the nation’s largest off-price retail')]")).isDisplayed();
        System.out.println("thePowerText Text is displayed " + thePowerText);
        boolean interestedRossTittle = driver.findElement(By.xpath("//h2[contains(text(),'Interested in working @ Ross?')]")).isDisplayed();
        System.out.println("interestedRossTittle is displayed " + interestedRossTittle);
        boolean interestedRossText = driver.findElement(By.xpath("//p[contains(text(),'We have many job opportunities ranging from store ')]")).isDisplayed();
        System.out.println("interestedRossText is displayed " + interestedRossText);
        boolean communityInvolvementTittle = driver.findElement(By.xpath("//h2[contains(text(),'Community Involvement')]")).isDisplayed();
        System.out.println("communityInvolvementTittle is displayed " + communityInvolvementTittle);
        boolean communityInvolvementText = driver.findElement(By.xpath("//p[contains(text(),'Ross is committed to giving back to its local comm')]")).isDisplayed();
        System.out.println("communityInvolvementText is displayed " + communityInvolvementText);


        return this;
    }

    public HomePage clickFooterCareersPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Careers  Links  on footer and verify Url and Tittle");

//        if (signInModalWindow.isDisplayed()) {
//
//            WebElement closeSignInModalWindow = signInModalWindowCloseButton;
//            closeSignInModalWindow.click();
//
//        } else {
//
//        }

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerCareers);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);
                String actualFooterCareersUrl = driver.getCurrentUrl();
                System.out.println(actualFooterCareersUrl);
                String expectedFooterCareersUrl = "https://jobs.rossstores.com/";
                Assert.assertEquals(actualFooterCareersUrl, expectedFooterCareersUrl);
                System.out.println("Careers URL matched");
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterSocialResponsibilityPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Social responsibility Links  on footer and verify Url and Tittle");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerSocialResponsibility);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);

                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://corp.rossstores.com/responsibility/");
                assertThat(DriverManager.getDriver().getTitle(), containsString("Corporate Social Responsibility"));

                // verify links on social responsibility page

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
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        return this;
    }

    public HomePage verifyFooterSignUpModal() throws InterruptedException {

        Allure.step("The user clicks  Diversity  Links  on footer and verify Url and Tittle");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(footerSignUpSection);
        Thread.sleep(2000);

        System.out.println("maxlength for name field is " +footerSignUpSectionNameField.getAttribute("maxlength"));
        System.out.println("maxlength for email field is " +footerSignUpSectionEmailField.getAttribute("maxlength"));
        System.out.println("maxlength for zip code field is " + footerSignUpSectionZipCodeField.getAttribute("maxlength"));

//        WebElement hiddenElement =footerSignUpSectionNameField;
//        ((JavascriptExecutor)driver).executeScript("arguments[0].type = 'text';", hiddenElement);
//
//        footerSignUpSectionNameField.sendKeys("Tester Name");
//        footerSignUpSectionEmailField.sendKeys("Test@test.com");
//        footerSignUpSectionZipCodeField.sendKeys("78613");
//        jsScrollClick(footerSignUpSectionSubmitBUtton);

//        boolean footerSignUpSuccessMessageDisplayed = footerSignUpSuccessMessage.isDisplayed();
//        System.out.println("success message is displayed " + footerSignUpSuccessMessageDisplayed );

        return this;
    }

    public HomePage clickFooterDiversityPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Diversity  Links  on footer and verify Url and Tittle");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerDiversityEI);
        String parentWindow1 = driver.getWindowHandle();
        Set<String> handles1 = driver.getWindowHandles();
        for (String windowHandle : handles1) {
            if (!windowHandle.equals(parentWindow1)) {
                driver.switchTo().window(windowHandle);
                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://inclusion.rossstores.com/");
                assertThat(DriverManager.getDriver().getTitle(), containsString("Ross Stores, Inc."));

            }
        }
        driver.close();
        driver.switchTo().window(parentWindow1); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterInvestorsPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Investors  Links  on footer and verify Url");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerInvestors);
        String parentWindow2 = driver.getWindowHandle();
        Set<String> handles2 = driver.getWindowHandles();
        for (String windowHandle : handles2) {
            if (!windowHandle.equals(parentWindow2)) {
                driver.switchTo().window(windowHandle);

                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://investors.rossstores.com/");

            }
        }
        driver.close();
        driver.switchTo().window(parentWindow2); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterProductsPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Products Sourcing  Links  on footer and verify Url");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        jsScrollClick(footerProductsSourcing);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/product-sourcing-human-rights/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Product Sourcing &"));

        return this;
    }

    public HomePage clickFooterAssociatesPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Associates  Links  on footer and verify Url");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerForAssociates);
        String parentWindow4 = driver.getWindowHandle();
        Set<String> handles4 = driver.getWindowHandles();
        for (String windowHandle : handles4) {
            if (!windowHandle.equals(parentWindow4)) {
                driver.switchTo().window(windowHandle);
                String forAssociatesURL;
                forAssociatesURL = driver.getCurrentUrl();
                System.out.println(forAssociatesURL);


            }

        }
        driver.close();
        driver.switchTo().window(parentWindow4); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterLegalNoticesLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  LegalNotices  Links  on footer and verify Url and Tittle");

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        jsScrollClick(footerLegalNotices);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/legal-notices/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Legal Notices & Recalled Products - Ross Dress For Less"));


        // all the links on legal notices page including PDF
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


    public HomePage clickFooterComparisonPricingLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  ComparisonPricing  Links  on footer and verify Url and Tittle");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerComparisonPricing);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/comparison-pricing/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Comparison Pricing"));

        boolean comparisonPricingPageText = driver.findElement(By.xpath("//p[contains(text(),'We want you to shop with more information, so many')]")).isDisplayed();
        System.out.println("comparisonPricing Page Text is displayed " + comparisonPricingPageText);

        return this;
    }

    public HomePage clickFooterSitemapLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  SiteMap  Links  on footer and verify Url and Tittle");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerSiteMapLink);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/sitemap/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Sitemap"));

        return this;
    }

    public HomePage clickFooterPrivacyLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Privacy policy Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerPrivacyLink);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/privacy-policy/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Privacy Policy"));

        WebElement privacyPageText1 = driver.findElement(By.xpath("//span[contains(text(),'Ross Stores, Inc.')]"));
        System.out.println(privacyPageText1.getText());

        boolean printPageButton = driver.findElement(By.xpath("//span[contains(text(),'Print Page')]")).isDisplayed();
        System.out.println(printPageButton + " printPageButton is  displayed");

        WebElement privacyPageText2 = driver.findElement(By.xpath("//a[contains(text(),'www.google.com/policies/privacy/partners')]"));
        System.out.println(privacyPageText2.getText());

        WebElement privacyPageText3 = driver.findElement(By.xpath("//a[contains(text(),'https://tools.google.com/dlpage/gaoptout')]"));
        System.out.println(privacyPageText3.getText());

        WebElement privacyPageText4 = driver.findElement(By.xpath("//a[contains(text(),'www.aboutads.info/appchoices')]"));
        System.out.println(privacyPageText4.getText());

        driver.navigate().back();

        return this;
    }

    public HomePage clickFooterTermsofUseLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  TermsofUse Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerTermsOfUse);

        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/terms-of-use/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Terms of Use"));

        WebElement TermOfUseText1 = driver.findElement(By.xpath("//p[contains(text(),'Welcome to the Ross Stores, Inc. (together with it')]"));
        System.out.println(TermOfUseText1.getText());

        boolean termOfUseDDSLogos = driver.findElement(By.xpath("//img[@src='https://www.rossstores.com/wp-content/uploads/2021/04/legal-logos.svg']")).isDisplayed();
        System.out.println(termOfUseDDSLogos + " printPageButton is  displayed");

        WebElement termofUseTittle1= driver.findElement(By.xpath("//span[contains(text(),'1. Use of Copyrighted Contents and Trademarks')]"));
        System.out.println(termofUseTittle1.getText());

        WebElement termofUseTittle2 = driver.findElement(By.xpath("//span[contains(text(),'2. Limitations on Use')]"));
        System.out.println(termofUseTittle2.getText());

        WebElement termofUseTittle3 = driver.findElement(By.xpath("//span[contains(text(),'3. Links to Third-party Sites')]"));
        System.out.println(termofUseTittle3.getText());

        WebElement termofUseTittle4 = driver.findElement(By.xpath("//span[contains(text(),'4. Comments and Feedback')]"));
        System.out.println(termofUseTittle4.getText());

        WebElement termofUseTittle5 = driver.findElement(By.xpath("//span[contains(text(),'5. Social Media Submissions and User-Generated Con')]"));
        System.out.println(termofUseTittle5.getText());

        WebElement termofUseTittle6 = driver.findElement(By.xpath("//span[contains(text(),'6. License Grant')]"));
        System.out.println(termofUseTittle6.getText());

        driver.navigate().back();

        return this;
    }

    public HomePage clickFooterAccessibilityLinksAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  accessibility Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerAccesssibilityLink);

        String parentWindow4 = driver.getWindowHandle();
        Set<String> handles4 = driver.getWindowHandles();
        for (String windowHandle : handles4) {
            if (!windowHandle.equals(parentWindow4)) {
                driver.switchTo().window(windowHandle);

                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://corp.rossstores.com/accessibility/");
                assertThat(DriverManager.getDriver().getTitle(), containsString("Accessibility"));

                WebElement accessibilityPageText1 = driver.findElement(By.xpath("//p[contains(text(), 'We are committed to providing all customers with access to information about')]"));
                System.out.println(accessibilityPageText1.getText());


            }

        }
        driver.close();
        driver.switchTo().window(parentWindow4); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterCreditCardLogoVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  CrediCardLogo    on footer and verify Url and Tittle");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerCreditCardLogo);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/credit-card/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Get a Ross Credit Card"));

        return this;
    }

    public HomePage clickFooterLearMoreApplyNowAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  LearMoreApplyNow  Links  on footer and verify Url and Tittle");


        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerLearnMoreApplyNow);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/credit-card/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Get a Ross Credit Card"));

        return this;
    }

    public HomePage clickFooterManageMyCardLinkVerifyURL() throws InterruptedException {

        Allure.step("The user clicks  ManageMyCard Links  on footer and verify Url and Tittle");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerManegeMyCard);

        String parentWindow4 = driver.getWindowHandle();
        Set<String> handles4 = driver.getWindowHandles();
        for (String windowHandle : handles4) {
            if (!windowHandle.equals(parentWindow4)) {
                driver.switchTo().window(windowHandle);

                Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://d.comenity.net/ac/ross");
                //assertThat(DriverManager.getDriver().getTitle(), containsString("Manage your account"));

            }

        }
        driver.close();
        driver.switchTo().window(parentWindow4); //cntrl to parent window

        return this;
    }

    public HomePage clickFooterDoNotCookieAndVerify() throws InterruptedException {

        Allure.step("The user clicks on Do not Sell Links  on footer and verify its displayed");
        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        WebElement footerDoNotSell = footerDoNotSellLink;
        JavascriptExecutor jsexecutor7 = ((JavascriptExecutor) DriverManager.getDriver());
        waitForVisibility(footerDoNotSellLink);
        jsexecutor7.executeScript("arguments[0].click();", footerDoNotSell);

        jsScrollClick(footerDoNotSellLink);
        boolean oneTrustWindow = driver.findElement(By.xpath("//div[@id='ot-pc-content']")).isDisplayed();
        System.out.println(oneTrustWindow + " oneTrustWindow box is  displayed");

        driver.findElement(By.xpath("//button[@id='close-pc-btn-handler']")).click();

        return this;
    }


    public ContactUsPageForm navigateToContactUsPage() throws InterruptedException {
        Allure.step("The user navigate to contact Us page");

        navigateTo_URL(getContactUsUrl());
        Thread.sleep(2000);

        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        return new ContactUsPageForm(driver);
    }
}

