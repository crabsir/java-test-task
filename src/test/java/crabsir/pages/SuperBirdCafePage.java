package crabsir.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SuperBirdCafePage extends BasePage {

    public SuperBirdCafePage(WebDriver webDriver) {
        super(webDriver);
    }

    public SuperBirdCafePage ensurePageLoaded() {
        return (SuperBirdCafePage) ensurePageLoaded(
                Locators.SuperBirdCafePageLocators.ensureLocator, Locators.SuperBirdCafePageLocators.pageTitle
        );
    }

    public void selectSortingMethod(String method) {
        Select sortingMethodDropdown = new Select (
                driver.findElement(By.cssSelector(Locators.SuperBirdCafePageLocators.sortingMethod))
        );
        sortingMethodDropdown.selectByValue(method);
    }

}
