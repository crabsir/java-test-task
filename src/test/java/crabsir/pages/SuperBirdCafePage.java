package crabsir.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public WebElement selectFirstMenuItem() {
        return selectElement(Locators.SuperBirdCafePageLocators.firstMenuItem);
    }

    public void selectSortingMethod(String method) {
        Select sortingMethodDropdown = new Select (
                driver.findElement(By.cssSelector(Locators.SuperBirdCafePageLocators.sortingMethod))
        );
        sortingMethodDropdown.selectByVisibleText(method);
        WebElement firstItem = selectFirstMenuItem();
        Assertions.assertTrue(firstItem.isDisplayed());
        Assertions.assertEquals(firstItem.getText(), Locators.SuperBirdCafePageLocators.firstItemText);
    }

}
