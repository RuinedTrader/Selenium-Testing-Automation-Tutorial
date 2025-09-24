package com.udemytutorial.selenium.tutorial.page.google;

import com.udemytutorial.selenium.tutorial.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchButtons;

    public void search(String input){

        //user input it added on the search box
        this.searchBox.sendKeys(input);
        //get rid of suggestion on search bar
        this.searchBox.sendKeys(Keys.TAB);

        //search button is pressed
        this.searchButtons.stream()
                .filter(webElement -> webElement.isDisplayed() && webElement.isEnabled())
                .findFirst()
                .ifPresent(webElement -> webElement.click());
    }

    @Override
    public boolean isAt() {
        return this.webDriverWait.until(driver -> this.searchBox.isDisplayed());
    }
}
