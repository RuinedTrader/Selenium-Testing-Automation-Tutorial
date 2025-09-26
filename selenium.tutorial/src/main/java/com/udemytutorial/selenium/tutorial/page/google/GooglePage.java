package com.udemytutorial.selenium.tutorial.page.google;

import com.udemytutorial.selenium.tutorial.page.Base;
import com.udemytutorial.selenium.tutorial.util.ScreenShotUtil;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {

    @Getter
    @Autowired
    private SearchComponent searchComponent;

    @Getter
    @Autowired
    private SearchResult searchResult;


    @Value("${application.url}")
    private String url;

    public void goTo(){
        this.webDriver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}
