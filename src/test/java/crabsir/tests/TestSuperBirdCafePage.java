package crabsir.tests;

import crabsir.pages.SuperBirdCafePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSuperBirdCafePage {

    WebDriver driver;
    SuperBirdCafePage cafePage;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String pageUrl = "https://highlifeshop.com/speedbird-cafe";
        driver.get(pageUrl);
        cafePage = new SuperBirdCafePage(driver);
    }

    @Test
    public void testSortingByProductName() {
        cafePage
            .ensurePageLoaded()
            .acceptCookies()
            .selectSortingMethod("Product Name");
    }

    @Test
    public void testSortingByPriceDescending() {
        cafePage
            .ensurePageLoaded()
            .acceptCookies()
            .selectSortingMethod("Price")
            .setDescendingOrder();
    }

    @Test
    public void testSortingOrderPersists() {
        cafePage
            .ensurePageLoaded()
            .acceptCookies()
            .selectSortingMethod("Price")
            .setDescendingOrder()
            .selectSortingMethod("Position", " descending");
    }

    @AfterEach
    public void teardown() {
        driver.close();
    }

}
