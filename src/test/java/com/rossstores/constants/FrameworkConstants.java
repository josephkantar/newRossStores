package com.rossstores.constants;

// we pull the data from configurationproperties file >

import com.rossstores.utils.ConfigurationReaderFile;

public class FrameworkConstants {
    private FrameworkConstants() {
    }

    private static final String URL = ConfigurationReaderFile.get("url");
    private static final String contactUsUrl = ConfigurationReaderFile.get("urlContactUs");
    private static final String foundInStoreUrl = ConfigurationReaderFile.get("urlFoundInStore");
    private static final String storeLocatorUrl = ConfigurationReaderFile.get("urlStoreLocator");
    private static final String creditCardUrl = ConfigurationReaderFile.get("urlCreditCard");

    // final keywords meaning > we are assign an absolute value to our variable to prevent to change data (intentially or unintellialy mistake )
    // when we use final > keyword > we have to put UPPER case letter (URL > Correct version)

    public static String getUrl() {
        return URL;
    }
    public static String getContactUsUrl() { return contactUsUrl; }
    public static String getFoundInStoreUrl() { return foundInStoreUrl;}
    public static String getStoreLocatorUrl () { return storeLocatorUrl; }
    public static String getCreditCardUrl () { return creditCardUrl; }

    }

