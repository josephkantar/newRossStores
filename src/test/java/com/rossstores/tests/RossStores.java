package com.rossstores.tests;

import com.rossstores.utils.RetryAnalyzer;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class RossStores extends BaseTest{

    @Severity(SeverityLevel.CRITICAL)
    @Step("Ddsdiscount test")
    @Test(testName = "DDsDiscounts Page",retryAnalyzer = RetryAnalyzer.class)

    public void testRossStores() throws InterruptedException {


        homePage
                .verifySignInModalWindowDisplay()
                //.closeCookie ()
                .verifyHomePageTextsAndTittle()
                .verifyHomePageLogoAndImage()
                .footerLinksList()
                .allLinksOnHomePage()
                .navMenuList()
                .verifyModule2LearnMoreButton()
                .verifyModule2ShopGiftCardButton()
                .verifyModule2ApplyTodayButton()
                .verifyGetInspiredButton()
                .verifySocialLinksEmailSignUp()
                .verifySocialLinksEmailUnsubcribe()
                .verifySocialLinksInstagram()
                .verifySocialLinksFacebook()
                .clickFooterAboutUsLinksAndVerifyUrlAndTittle()
                .clickFooterCareersPageAndVerifyUrlAndTittle()
                .clickFooterSocialResponsibilityPageAndVerifyUrlAndTittle()
                .verifyFooterSignUpModal()
                .clickFooterDiversityPageAndVerifyUrlAndTittle()
                .clickFooterInvestorsPageAndVerifyUrlAndTittle()
                .clickFooterProductsPageAndVerifyUrlAndTittle()
                .clickFooterAssociatesPageAndVerifyUrlAndTittle()
                .clickFooterLegalNoticesLinksAndVerifyUrlAndTittle()
                .clickFooterComparisonPricingLinksAndVerifyUrlAndTittle()
                .clickFooterSitemapLinksAndVerifyUrlAndTittle()
                .clickFooterPrivacyLinksAndVerifyUrlAndTittle()
                .clickFooterAccessibilityLinksAndVerifyUrlAndTittle()
                .clickFooterCreditCardLogoVerifyUrlAndTittle()
                .clickFooterLearMoreApplyNowAndVerifyUrlAndTittle()
                .clickFooterManageMyCardLinkVerifyURL()
                .clickFooterDoNotCookieAndVerify()
                .clickFooterTermsofUseLinksAndVerifyUrlAndTittle()
                .navigateToContactUsPage();
//
        contactUsPageForm
                .clickFooterContactUsPageAndVerifyUrlAndTittle()
                .verifyRequiredFieldsContactUsform()
                .createFormTopicCustomerService()
                .createFormTopicEmployment()
                .createFormTopicCorporateSocial()
                .createFormTopicVendorInquiries()
                .createFormTopicWebsiteTechIsuues()
                .createFormTopicIvestor()
                .createFormTopicRealEstate()
                .createFormTopicOther()
                .navigateToFoundInStore();
//
        foundInStorePage
                .clickFoundInStoreLinkAndVerifyUrlAndTittle()
                .verifyTittlesAndTexts()
                .clickFoundInStoreSelectAllImages()
                .clickFoundInStoreSelectFashionImages()
                .clickFoundInStoreSelectHomeImages()
                .clickFoundInStoreSelectLifestyleImages()
                .navigateToStoreLocatorPage();
//
        storeLocatorPage
                .verifyStoreLocatorPage()
                .navigateToCreditCardPage();

        creditCardPage
                .verifyCreditCardPageTittleUrl()
                .verifyCreditCardPageTextsAndTittle()
                .verifyCreditCardPageAllLinks()
                .verifyCreditCardPageAllImages()
                .verifyCreditCardPageFAQs();

    }
}