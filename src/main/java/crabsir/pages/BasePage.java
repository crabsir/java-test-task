package crabsir.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver webDriver) {
        driver = webDriver;
    }

    public static BasePage goTo(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        return new BasePage(driver);
    }

}
