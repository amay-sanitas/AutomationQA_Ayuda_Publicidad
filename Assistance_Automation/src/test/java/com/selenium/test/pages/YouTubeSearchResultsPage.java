package com.selenium.test.pages;

import com.selenium.test.webtestsbase.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Template for QA_AUTOMATION_NEED to add features and steps for Assistance and Assistance-core
 */
public class YouTubeSearchResultsPage extends BasePage {

    @FindBy(css="#content")
    private WebElement contentElement;

    @FindBys(@FindBy(css = "div[class*='yt-lockup-tile yt-lockup-video']"))
    private List<WebElement> videoElements;


    public YouTubeSearchResultsPage(){
        super(true);
    }

    public YouTubeSearchResultsPage(boolean openPageByUrl) {
        super(openPageByUrl);
    }

    @Override
    protected void openPage() {
        //do nothing
    }

    @Override
    public boolean isPageOpened() {
        try {
            return contentElement.isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }
    }

    public boolean hasResults() {
        return !videoElements.isEmpty();
    }
}
