package com.abdelqodous.qa1z0_829.q44;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Locale currentLocale = new Locale.Builder().setLanguage("en").build();

        ResourceBundle captions = ResourceBundle.getBundle("Captions.properties", currentLocale);
        System.out.println(captions.getString("user"));
    }
}
