package crabsir.pages;

import org.openqa.selenium.WebDriver;

public class SuperBirdCafePage extends BasePage {

    public SuperBirdCafePage(WebDriver webDriver) {
        super(webDriver);
    }

    public SuperBirdCafePage ensurePageLoaded() {
        return (SuperBirdCafePage) ensurePageLoaded(
                Locators.SuperBirdCafePageLocators.ensureLocator, Locators.SuperBirdCafePageLocators.pageTitle
        );
    }

}
