package com.udemytutorial.selenium.tutorial.page;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Base {

    @Autowired
    protected WebDriver webDriver;

    @Autowired
    protected WebDriverWait webDriverWait;

    @PostConstruct
    private void init(){
        System.out.println(this.getClass().getName());
        PageFactory.initElements(webDriver,this); //driver->	The WebDriver instance used to locate elements on the page.
                                                        //this->	The object whose @FindBy fields need to be initialized.
    }


    public abstract boolean isAt(); // each page component will be using this method, this is to ensure if the page on which we take action has successfully loaded or not
}
