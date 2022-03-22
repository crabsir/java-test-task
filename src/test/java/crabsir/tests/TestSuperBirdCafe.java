package crabsir.tests;

import crabsir.pages.SuperBirdCafePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSuperBirdCafe {

    WebDriver driver;
    SuperBirdCafePage cafePage;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String pageUrl = "https://highlifeshop.com/speedbird-cafe";
        driver.get(pageUrl);
    }

    @Test
    public void testSortingByProductName() {
        cafePage = new SuperBirdCafePage(driver);

        cafePage.ensurePageLoaded();
    }

    @AfterEach
    public void teardown() {
        driver.close();
    }

}
