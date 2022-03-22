package crabsir.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public static WebDriverWait webWait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.ignoring(NoSuchElementException.class);
        return wait;
    }

    public BasePage ensurePageLoaded(String locator, String title) {
        webWait(driver).until(e -> e.findElement(By.cssSelector(locator)));
        Assertions.assertEquals(driver.getTitle(), title);
        return this;
    }

}
