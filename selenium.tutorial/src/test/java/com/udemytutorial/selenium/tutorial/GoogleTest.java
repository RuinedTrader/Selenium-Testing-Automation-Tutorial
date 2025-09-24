package com.udemytutorial.selenium.tutorial;

import com.udemytutorial.selenium.tutorial.page.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends SpringBaseTestNGTest{

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googlePageTest(){
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("Selenium");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getTotalResults()>=2);
    }
}
