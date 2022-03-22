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

    public void confirmFirstMenuItem(String itemText) {
        WebElement firstItem = selectElement(Locators.SuperBirdCafePageLocators.firstMenuItem);
        Assertions.assertTrue(firstItem.isDisplayed());
        Assertions.assertEquals(firstItem.getText(), itemText);
    }

    public Select selectSortingDropdown() {
        return new Select(driver.findElement(By.cssSelector(Locators.SuperBirdCafePageLocators.sortingMethod)));
    }

    public SuperBirdCafePage acceptCookies() {
        selectElement(Locators.SuperBirdCafePageLocators.acceptCookies).click();
        return this;
    }

    public SuperBirdCafePage selectSortingMethod(String method) {
        selectSortingDropdown().selectByVisibleText(method);
        confirmFirstMenuItem(Locators.SuperBirdCafePageLocators.firstItemMap.get(method));
        return this;
    }

    public SuperBirdCafePage setDescendingOrder() {
        String sortingMethod = selectSortingDropdown().getFirstSelectedOption().getText();
        WebElement reverseOrder = selectElement(Locators.SuperBirdCafePageLocators.reverseOrder);
        Assertions.assertTrue(reverseOrder.isDisplayed());
        reverseOrder.click();
        confirmFirstMenuItem(Locators.SuperBirdCafePageLocators.firstItemMap.get(sortingMethod + " descending"));
        return this;
    }

}
