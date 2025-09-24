package com.udemytutorial.selenium.tutorial.page.google;

import com.udemytutorial.selenium.tutorial.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SearchResult extends Base {

    @FindBy(css = "div.MjjYud")
    private List<WebElement> results;

    public List<WebElement> getResults() {
        return results;
    }

    public int getTotalResults(){
        return this.results.size();
    }

    @Override
    public boolean isAt() {
        return this.webDriverWait.until(driver -> !results.isEmpty());
    }
}
