package com.rossstores.pages;

import com.rossstores.driver.DriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static com.rossstores.constants.FrameworkConstants.*;
import static com.rossstores.utils.JSUtils.jsScrollClick;
import static com.rossstores.utils.JSUtils.scrollIntoViewJS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ContactUsPageForm extends BasePage {

    public ContactUsPageForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='modal-content']//button[@class='btn-close']")
    private WebElement signInModalWindowCloseButton;
    @FindBy(xpath = "//div[@class='modal-content']")
    private WebElement signInModalWindow;
    @FindBy(xpath = "//div[@id='mainfooter']")
    private WebElement pageFooter;
    @FindBy(xpath = "//li[@id='menu-item-168']//a[@href='https://www.rossstores.com/contact-us/']")
    private WebElement footerContactUsLink;

    //Contact Us Page FAQ Questions

    @FindBy(xpath = "//span[contains(text(),'General Return Policy')]")
    private WebElement faqQuestion1;
    @FindBy(xpath = "//p[contains(text(),'For merchandise (not used, worn, or altered) accom')]")
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

    //Contact Us Form

    @FindBy(xpath = "//div[@class='form-body']")
    private WebElement contactUsFormBody;
    @FindBy(xpath = "//span[contains(text(),'Submit')]")
    private WebElement contactUsFormSubmitButton;
    @FindBy(xpath = "//span[@id='form-firstname-error']")
    private WebElement contactUsFormFirstNameErrorMessage;
    @FindBy(xpath = "//span[@id='form-lastname-error']")
    private WebElement contactUsFormLastNameErrorMessage;
    @FindBy(xpath = "//span[@id='form-email-error']")
    private WebElement contactUsFormEmailErrorMessage;
    @FindBy(xpath = "//span[@id='form-inquiry-error']")
    private WebElement contactUsFormTopicErrorMessage;
    @FindBy(xpath = "//span[@id='form-message-error']")
    private WebElement contactUsFormMessageErrorMessage;


    //ContactUsForm Fields

    @FindBy(xpath = "//input[@id='form-firstname']")
    private WebElement contactUsFormFirstNameField;
    @FindBy(xpath = "//input[@id='form-lastname']")
    private WebElement contactUsFormLastNameField;
    @FindBy(xpath = "//input[@id='form-email']")
    private WebElement contactUsFormEmailField;
    @FindBy(xpath = "//input[@id='form-phone']")
    private WebElement contactUsFormPhoneNumberField;
    @FindBy(css = "#form-message")
    private WebElement contactUsFormMessageField;
    @FindBy(xpath = "//input[@id='form-city']")
    private WebElement contactUsFormStoreCity;
    @FindBy(xpath = "//select[@id='form-state']")
    private WebElement contactUsFormStoreState;
    @FindBy(xpath = "//input[@id='form-receipt-no']")
    private WebElement contactUsFormReceiptNo;
    @FindBy(xpath = "//h3[contains(text(),'Message Sent')]")
    private WebElement contactUsFormConfirmation;
    @FindBy(xpath = "//div[contains(text(),'We will review your message and reach out to you.')]")
    private WebElement contactUsFormConfirmationMessage;

    //ContactUsSelectTopic

    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectCustomerService;
    @FindBy(xpath = "//select[@id='form-customerService']")
    private WebElement selectCustomerServiceMercReturn;
    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectEmployment;
    @FindBy(xpath = "//select[@id='form-related-employment']")
    private WebElement selectEmploymentProspective;
    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectCorporateSocialResponsibility;
    @FindBy(xpath = "//select[@id='form-corporate']")
    private WebElement selectCorporateGiving;
    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectVendorInquiries;
    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectWebsiteTechnicalIssues;
    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectInvestorAndMedia;
    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectRealEstate;
    @FindBy(xpath = "//select[@id='form-inquiry']")
    private WebElement selectOther;



    public ContactUsPageForm clickFooterContactUsPageAndVerifyUrlAndTittle() throws InterruptedException {

        Allure.step("The user clicks  Contact Us page through  footer and verify Url-tittle");

        navigateTo_URL(getUrl());
        scrollIntoViewJS(pageFooter);
        Thread.sleep(2000);

        click(footerContactUsLink);
        Assert.assertEquals(DriverManager.getDriver().getCurrentUrl(), "https://www.rossstores.com/contact-us/");
        assertThat(DriverManager.getDriver().getTitle(), containsString("Contact US | Ross Dress for Less"));
        //Contact Us tittles and Text and make sure FORM disp;ayed
        boolean returnPolicyTittle = driver.findElement(By.xpath("//h2[contains(text(),'Ross Return Policy')]")).isDisplayed();
        System.out.println("returnPolicy Tittle is displayed " + returnPolicyTittle);

        boolean rossCreditCardFaq = driver.findElement(By.xpath("//h2[contains(text(),'Ross Credit Card Program FAQ')]")).isDisplayed();
        System.out.println("rossCreditCardFaq is displayed " + rossCreditCardFaq);

        scrollIntoViewJS(faqQuestion1);
        boolean question1 = (faqQuestion1).isDisplayed();
        System.out.println("question1 is displayed " + question1);
        jsScrollClick(faqQuestion1);
        Thread.sleep(1000);
        boolean faqAnswer1  = driver.findElement(By.xpath("//p[contains(text(),'Ross Stores uses a refund verification system. All')]")).isDisplayed();
        System.out.println("faqAnswer1 Text is displayed " + faqAnswer1);
        Thread.sleep(1000);

        scrollIntoViewJS(faqQuestion2);
        boolean question2 = (faqQuestion2).isDisplayed();
        System.out.println("question1 is displayed " + question2);
        jsScrollClick(faqQuestion2);
        Thread.sleep(1000);
        boolean faqAnswer2  = driver.findElement(By.xpath("//p[contains(text(),'For merchandise (not used, worn, or altered) accom')]")).isDisplayed();
        System.out.println("faqAnswer2 Text is displayed " + faqAnswer2);


        scrollIntoViewJS(faqQuestion3);
        boolean question3 = (faqQuestion3).isDisplayed();
        System.out.println("question3 is displayed " + question3);
        jsScrollClick(faqQuestion3);

        scrollIntoViewJS(faqQuestion4);
        boolean question4 = (faqQuestion4).isDisplayed();
        System.out.println("question4 is displayed " + question4);
        jsScrollClick(faqQuestion4);
        Thread.sleep(1000);
        boolean faqAnswer4  = driver.findElement(By.xpath("//p[contains(text(),'No, approval is determined on an individual basis ')]")).isDisplayed();
        System.out.println("faqAnswer4 Text is displayed " + faqAnswer4);

        scrollIntoViewJS(faqQuestion5);
        boolean question5 = (faqQuestion5).isDisplayed();
        System.out.println("question5 is displayed " + question5);
        jsScrollClick(faqQuestion5);
        Thread.sleep(1000);
        boolean faqAnswer5  = driver.findElement(By.xpath("//li[contains(text(),'Visit your nearest Ross Dress for Less store and a')]")).isDisplayed();
        System.out.println("faqAnswer5 Text is displayed " + faqAnswer5);

        scrollIntoViewJS(faqQuestion6);
        boolean question6 = (faqQuestion6).isDisplayed();
        System.out.println("question6 is displayed " + question6);
        jsScrollClick(faqQuestion6);
        Thread.sleep(1000);
        boolean faqAnswer6  = driver.findElement(By.xpath("//p[contains(text(),'You will be notified immediately on your mobile ph')]")).isDisplayed();
        System.out.println("faqAnswer6 Text is displayed " + faqAnswer6);

        scrollIntoViewJS(faqQuestion7);
        boolean question7 = (faqQuestion7).isDisplayed();
        System.out.println("question7 is displayed " + question7);
        jsScrollClick(faqQuestion7);

        scrollIntoViewJS(faqQuestion8);
        boolean question8 = (faqQuestion8).isDisplayed();
        System.out.println("question8 is displayed " + question8);
        jsScrollClick(faqQuestion8);
        Thread.sleep(1000);
        boolean faqAnswer8  = driver.findElement(By.xpath("//p[contains(text(),'Comenity Capital Bank issues the Ross Credit Card ')]")).isDisplayed();
        System.out.println("faqAnswer8 Text is displayed " + faqAnswer8);

        scrollIntoViewJS(faqQuestion9);
        boolean question9 = (faqQuestion9).isDisplayed();
        System.out.println("question9 is displayed " + question9);
        jsScrollClick(faqQuestion9);
        Thread.sleep(1000);
        boolean faqAnswer9  = driver.findElement(By.xpath("//p[contains(text(),'If approved, you will receive a credit card welcom')]")).isDisplayed();
        System.out.println("faqAnswer9 Text is displayed " + faqAnswer9);

        scrollIntoViewJS(faqQuestion10);
        boolean question10 = (faqQuestion10).isDisplayed();
        System.out.println("question10 is displayed " + question10);
        jsScrollClick(faqQuestion10);
        Thread.sleep(1000);
        scrollIntoViewJS(faqQuestion10);
        boolean faqAnswer10  = driver.findElement(By.xpath("//p[contains(text(),'For every 100 Reward Dollars you earn, you will re')]")).isDisplayed();
        System.out.println("faqAnswer10 Text is displayed " + faqAnswer10);


        scrollIntoViewJS(faqQuestion11);
        boolean question11 = (faqQuestion11).isDisplayed();
        System.out.println("question11 is displayed " + question11);
        jsScrollClick(faqQuestion11);


        scrollIntoViewJS(faqQuestion12);
        boolean question12 = (faqQuestion12).isDisplayed();
        System.out.println("question12 is displayed " + question12);
        jsScrollClick(faqQuestion12);
        Thread.sleep(1000);
        boolean faqAnswer12  = driver.findElement(By.xpath("//li[contains(text(),'You can also ask a store cashier to scan and redee')]")).isDisplayed();
        System.out.println("faqAnswer12 Text is displayed " + faqAnswer12);

        scrollIntoViewJS(faqQuestion13);
        boolean question13 = (faqQuestion13).isDisplayed();
        System.out.println("question13 is displayed " + question13);
        jsScrollClick(faqQuestion13);
        Thread.sleep(1000);
        boolean faqAnswer13  = driver.findElement(By.xpath("//li[contains(text(),'Immediately after approval, you will be prompted o')]")).isDisplayed();
        System.out.println("faqAnswer13 Text is displayed " + faqAnswer13);

        scrollIntoViewJS(faqQuestion14);
        boolean question14 = (faqQuestion14).isDisplayed();
        System.out.println("question14 is displayed " + question14);
        jsScrollClick(faqQuestion14);
        Thread.sleep(1000);
        boolean faqAnswer14  = driver.findElement(By.xpath("//li[contains(text(),'Pay by Phone: Contact Comenity Capital Bank at 1-8')]")).isDisplayed();
        System.out.println("faqAnswer14 Text is displayed " + faqAnswer14);

        scrollIntoViewJS(faqQuestion15);
        boolean question15 = (faqQuestion15).isDisplayed();
        System.out.println("question15 is displayed " + question15);
        jsScrollClick(faqQuestion15);
        Thread.sleep(1000);
        boolean faqAnswer15  = driver.findElement(By.xpath("//li[contains(text(),'Ross Credit Card: 1-800-440-5215')]")).isDisplayed();
        System.out.println("faqAnswer15 Text is displayed " + faqAnswer15);

        scrollIntoViewJS(faqQuestion16);
        boolean question16 = (faqQuestion16).isDisplayed();
        System.out.println("question16 is displayed " + question16);
        jsScrollClick(faqQuestion16);

        scrollIntoViewJS(faqQuestion17);
        boolean question17 = (faqQuestion17).isDisplayed();
        System.out.println("question17 is displayed " + question17);
        jsScrollClick(faqQuestion17);

        scrollIntoViewJS(faqQuestion18);
        boolean question18 = (faqQuestion18).isDisplayed();
        System.out.println("question18 is displayed " + question18);
        jsScrollClick(faqQuestion18);
        Thread.sleep(1000);
        boolean faqAnswer18  = driver.findElement(By.xpath("//p[contains(text(),'Your Rewards Dollars will expire at month’s end, t')]")).isDisplayed();
        System.out.println("faqAnswer18 Text is displayed " + faqAnswer18);

        scrollIntoViewJS(faqQuestion19);
        boolean question19 = (faqQuestion19).isDisplayed();
        System.out.println("question19 is displayed " + question19);
        jsScrollClick(faqQuestion19);
        Thread.sleep(1000);
        boolean faqAnswer19  = driver.findElement(By.xpath("//li[contains(text(),'Unused Rewards Certificates will expire 60 days af')]")).isDisplayed();
        System.out.println("faqAnswer19 Text is displayed " + faqAnswer19);

        scrollIntoViewJS(faqQuestion20);
        boolean question20 = (faqQuestion20).isDisplayed();
        System.out.println("question20 is displayed " + question20);
        jsScrollClick(faqQuestion20);
        Thread.sleep(1000);
        boolean faqAnswer20  = driver.findElement(By.xpath("//u[contains(text(),'1-800-440-5215.')]")).isDisplayed();
        System.out.println("faqAnswer20 Text is displayed " + faqAnswer20);

        scrollIntoViewJS(faqQuestion21);
        boolean question21 = (faqQuestion21).isDisplayed();
        System.out.println("question21 is displayed " + question21);
        jsScrollClick(faqQuestion21);

        scrollIntoViewJS(faqQuestion22);
        boolean question22 = (faqQuestion22).isDisplayed();
        System.out.println("question22 is displayed " + question22);
        jsScrollClick(faqQuestion22);

        scrollIntoViewJS(faqQuestion23);
        boolean question23 = (faqQuestion23).isDisplayed();
        System.out.println("question23 is displayed " + question23);
        jsScrollClick(faqQuestion23);
        Thread.sleep(1000);
        boolean faqAnswer23  = driver.findElement(By.xpath("//p[contains(text(),'No, merchandise cannot be purchased online. The op')]")).isDisplayed();
        System.out.println("faqAnswer23 Text is displayed " + faqAnswer23);

        scrollIntoViewJS(faqQuestion24);
        boolean question24 = (faqQuestion24).isDisplayed();
        System.out.println("question24 is displayed " + question24);
        jsScrollClick(faqQuestion24);
        Thread.sleep(1000);
        boolean faqAnswer24  = driver.findElement(By.xpath("//p[contains(text(),'We do not provide itemized merchandise searches. B')]")).isDisplayed();
        System.out.println("faqAnswer24 Text is displayed " + faqAnswer24);

        scrollIntoViewJS(faqQuestion25);
        boolean question25 = (faqQuestion25).isDisplayed();
        System.out.println("question25 is displayed " + question25);
        jsScrollClick(faqQuestion25);
        Thread.sleep(1000);
        boolean faqAnswer25  = driver.findElement(By.xpath("//p[contains(text(),'There is no expiration on our Gift Cards or Store ')]")).isDisplayed();
        System.out.println("faqAnswer25 Text is displayed " + faqAnswer25);

        scrollIntoViewJS(faqQuestion26);
        boolean question26 = (faqQuestion26).isDisplayed();
        System.out.println("question26 is displayed " + question26);
        jsScrollClick(faqQuestion26);
        Thread.sleep(1000);
        boolean faqAnswer26  = driver.findElement(By.xpath("//p[contains(text(),'To make way for new merchandise, we regularly mark')]")).isDisplayed();
        System.out.println("faqAnswer26 Text is displayed " + faqAnswer26);

        scrollIntoViewJS(faqQuestion27);
        boolean question27 = (faqQuestion27).isDisplayed();
        System.out.println("question27 is displayed " + question27);
        jsScrollClick(faqQuestion27);
        Thread.sleep(1000);
        boolean faqAnswer27  = driver.findElement(By.xpath("//p[contains(text(),'No. We look for manufacturer closeouts. Our produc')]")).isDisplayed();
        System.out.println("faqAnswer27 Text is displayed " + faqAnswer27);

        scrollIntoViewJS(faqQuestion28);
        boolean question28 = (faqQuestion28).isDisplayed();
        System.out.println("question28 is displayed " + question28);
        jsScrollClick(faqQuestion28);
        Thread.sleep(1000);
        boolean faqAnswer28  = driver.findElement(By.xpath("//p[contains(text(),'Yes, if you are shopping on behalf of a charitable')]")).isDisplayed();
        System.out.println("faqAnswer28 Text is displayed " + faqAnswer28);

        scrollIntoViewJS(faqQuestion29);
        boolean question29 = (faqQuestion29).isDisplayed();
        System.out.println("question29 is displayed " + question29);
        jsScrollClick(faqQuestion29);
        Thread.sleep(1000);
        boolean faqAnswer29  = driver.findElement(By.xpath("//p[contains(text(),'No, the company’s policies and agreements with its')]")).isDisplayed();
        System.out.println("faqAnswer29 Text is displayed " + faqAnswer29);

        scrollIntoViewJS(faqQuestion30);
        boolean question30 = (faqQuestion30).isDisplayed();
        System.out.println("question30 is displayed " + question30);
        jsScrollClick(faqQuestion30);
        Thread.sleep(1000);
        boolean faqAnswer30  = driver.findElement(By.xpath("//p[contains(text(),'The 55+ Tuesday Discount is a program exclusively ')]")).isDisplayed();
        System.out.println("faqAnswer30 Text is displayed " + faqAnswer30);

        scrollIntoViewJS(faqQuestion31);
        boolean question31 = (faqQuestion31).isDisplayed();
        System.out.println("question31 is displayed " + question31);
        jsScrollClick(faqQuestion31);
        Thread.sleep(1000);
        boolean faqAnswer31  = driver.findElement(By.xpath("//p[contains(text(),'No. Ross Stores does not offer any type of bulk sa')]")).isDisplayed();
        System.out.println("faqAnswer31 Text is displayed " + faqAnswer31);

        scrollIntoViewJS(faqQuestion32);
        boolean question32 = (faqQuestion32).isDisplayed();
        System.out.println("question32 is displayed " + question32);
        jsScrollClick(faqQuestion32);
        Thread.sleep(1000);
        boolean faqAnswer32  = driver.findElement(By.xpath("//a[contains(text(),'Supporting Our Communities')]")).isDisplayed();
        System.out.println("faqAnswer32 Text is displayed " + faqAnswer32);

        scrollIntoViewJS(faqQuestion33);
        boolean question33 = (faqQuestion33).isDisplayed();
        System.out.println("question33 is displayed " + question33);
        jsScrollClick(faqQuestion33);

        scrollIntoViewJS(faqQuestion34);
        boolean question34 = (faqQuestion34).isDisplayed();
        System.out.println("question34 is displayed " + question34);
        jsScrollClick(faqQuestion34);

        scrollIntoViewJS(faqQuestion35);
        boolean question35 = (faqQuestion35).isDisplayed();
        System.out.println("question35 is displayed " + question35);
        jsScrollClick(faqQuestion35);
        Thread.sleep(1000);
        boolean faqAnswer35  = driver.findElement(By.xpath("//a[contains(text(),'MyRoss.rossstores.com.')]")).isDisplayed();
        System.out.println("faqAnswer35 Text is displayed " + faqAnswer35);



        boolean contacUsForm = contacUsFormSection.isDisplayed();
        System.out.println("contacUsForm Section is displayed" + contacUsForm);


        return this;
    }

    public ContactUsPageForm verifyRequiredFieldsContactUsform() throws InterruptedException {

        Allure.step("The user verify required fields on  Contact Us form");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        waitForVisibility(contactUsFormFirstNameErrorMessage);

        WebElement firstNameError = contactUsFormFirstNameErrorMessage;
        System.out.println(firstNameError.getText());
        WebElement lastNameError = contactUsFormLastNameErrorMessage;
        System.out.println(lastNameError.getText());
        WebElement emailError = contactUsFormEmailErrorMessage;
        System.out.println(emailError.getText());
        WebElement topicError = contactUsFormTopicErrorMessage;
        System.out.println(topicError.getText());
        WebElement messageError = contactUsFormMessageErrorMessage;
        System.out.println(messageError.getText());




        return this;
    }

    public ContactUsPageForm createFormTopicCustomerService() throws InterruptedException {

        Allure.step("The user verify that they are able to create CustomerService form ");

        navigateTo_URL(getContactUsUrl());
        Thread.sleep(1000);
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicCustomerService = new Select(selectCustomerService);
        topicCustomerService.selectByValue("Customer Service");
        Thread.sleep(1000);
        Select customerServiceMerchandise = new Select(selectCustomerServiceMercReturn);
        customerServiceMerchandise.selectByValue("Merchandise Return or Exchange");
        contactUsFormStoreCity.sendKeys("Austin");

        Select storeState = new Select(driver.findElement(By.xpath("//select[@id='form-state']")));
        storeState.selectByValue("TX");
        WebElement noReceiptButton = contactUsFormReceiptNo;
        jsScrollClick(noReceiptButton);

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public ContactUsPageForm createFormTopicEmployment() throws InterruptedException {

        Allure.step("The user verify that they are able to create Employment - Prospective form ");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicEmployment = new Select(selectEmployment);
        topicEmployment.selectByValue("Employment");
        Thread.sleep(1000);
        Select employmentProspective = new Select(selectEmploymentProspective);
        employmentProspective.selectByValue("Prospective Associates");

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public ContactUsPageForm createFormTopicCorporateSocial() throws InterruptedException {

        Allure.step("The user verify that they are able to create Corporate Social Responsibility  ");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicCorporoteSocial = new Select(selectCorporateSocialResponsibility);
        topicCorporoteSocial.selectByValue("Corporate Social Responsibility");
        Thread.sleep(1000);
        Select corporateSocialCommunity = new Select(selectCorporateGiving);
        corporateSocialCommunity.selectByValue("Community Giving");

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public ContactUsPageForm createFormTopicVendorInquiries() throws InterruptedException {

        Allure.step("The user verify that they are able to create Vendor Inquiries  ");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicVendorInquiries = new Select(selectVendorInquiries);
        topicVendorInquiries.selectByValue("Vendor Inquiries");
        Thread.sleep(1000);

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public ContactUsPageForm createFormTopicWebsiteTechIsuues() throws InterruptedException {

        Allure.step("The user verify that they are able to create Website Tech Issues Form ");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicWebsiteTechIsuues = new Select(selectWebsiteTechnicalIssues);
        topicWebsiteTechIsuues.selectByValue("Website Technical Issues");
        Thread.sleep(1000);

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public ContactUsPageForm createFormTopicIvestor() throws InterruptedException {

        Allure.step("The user verify that they are able to create InvestorsForm ");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicInvestors = new Select(selectInvestorAndMedia);
        topicInvestors.selectByValue("Investor and Media Requests");
        Thread.sleep(1000);

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public ContactUsPageForm createFormTopicRealEstate() throws InterruptedException {

        Allure.step("The user verify that they are able to create Real Estate Form ");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicRealEstate = new Select(selectRealEstate);
        topicRealEstate.selectByValue("Real Estate");
        Thread.sleep(1000);

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public ContactUsPageForm createFormTopicOther() throws InterruptedException {

        Allure.step("The user verify that they are able to create Real Estate Form ");

        navigateTo_URL(getContactUsUrl());
        scrollIntoViewJS(contactUsFormBody);
        Thread.sleep(1000);

        contactUsFormFirstNameField.sendKeys("Tester");
        contactUsFormLastNameField.sendKeys("Teseter last name");
        contactUsFormEmailField.sendKeys("test@test.com");
        contactUsFormPhoneNumberField.sendKeys("123456789");

        Select topicOther = new Select(selectOther);
        topicOther.selectByValue("Other");
        Thread.sleep(1000);

        contactUsFormMessageField.sendKeys("This is for testing, please ignore it");
        Thread.sleep(1000);
        jsScrollClick(contactUsFormSubmitButton);
        Thread.sleep(1000);

        boolean successMessage = contactUsFormConfirmation.isDisplayed();
        System.out.println("Form successfully created " + successMessage);
        WebElement successMessageText = contactUsFormConfirmationMessage;
        System.out.println(successMessageText.getText());


        return this;
    }

    public FoundInStorePage navigateToFoundInStore() throws InterruptedException {

        Allure.step("The user navigate FoundINsTORE page");

        navigateTo_URL(getFoundInStoreUrl());
        Thread.sleep(2000);

        WebElement sendESC = driver.findElement(By.tagName("body"));
        sendESC.sendKeys(Keys.ESCAPE);

        //driver.navigate().to("https://www.ddsdiscounts.com/found-in-store/");
        return new FoundInStorePage(driver);

    }
}
