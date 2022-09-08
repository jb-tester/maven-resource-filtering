package com.mytests.maven;

import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.*;

/**
 * *
 * <p>Created by irina on 9/8/2022.</p>
 * <p>Project: maven-resource-filtering</p>
 * *
 */
public class MainTest {

    @Test
    public void testAll() {
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
        System.out.println(exampleBundle.getString("p10"));
        System.out.println(exampleBundle.getString("p11"));
        System.out.println(exampleBundle.getString("p12"));
    }
}