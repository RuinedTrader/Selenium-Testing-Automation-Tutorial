package com.udemytutorial.selenium.tutorial.page;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Base {

    private final WebDriver webDriver;

    @Autowired
    public Base(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public abstract boolean isAt(); // each page component will be using this method, this is to ensure if the page on which we take action has successfully loaded or not
}
