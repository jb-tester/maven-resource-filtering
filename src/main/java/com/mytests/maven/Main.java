package com.mytests.maven;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * *
 * <p>Created by ${USER} on ${DATE}.</p>
 * <p>Project: ${PROJECT_NAME}</p>
 * *
 */
public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "En");
        ResourceBundle exampleBundle = ResourceBundle.getBundle("messages", locale);

        System.out.println(exampleBundle.getString("p1"));
        System.out.println(exampleBundle.getString("p2"));
        System.out.println(exampleBundle.getString("p3"));
        System.out.println(exampleBundle.getString("p4"));
        System.out.println(exampleBundle.getString("p5"));
        System.out.println(exampleBundle.getString("p6"));
        System.out.println(exampleBundle.getString("p7"));
        System.out.println(exampleBundle.getString("p8"));
        System.out.println(exampleBundle.getString("p9"));
    }
}