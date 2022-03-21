package crabsir.pages;

import org.openqa.selenium.WebDriver;

public class SuperBirdCafePage extends BasePage {

    public SuperBirdCafePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void ensurePageLoaded() {
        ensurePageLoaded(Locators.SuperBirdCafePageLocators.ensureLocator);
    }

}
