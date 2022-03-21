package crabsir.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver webDriver) {
        driver = webDriver;
    }

    public static BasePage goTo(String url) {
        driver = new ChromeDriver();
        BasePage basePage = new BasePage(driver);
        driver.get(url);
        return basePage;
    }

    public static WebDriverWait webWait(WebDriver driver, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.ignoring(NoSuchElementException.class);
        return wait;
    }

    public static WebDriverWait webWait(WebDriver driver) {
        return webWait(driver, 10);
    }

    public void ensurePageLoaded(String locator) {
        webWait(driver).until(e -> e.findElement(By.cssSelector(locator)));
    }

}
