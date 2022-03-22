package crabsir;

import crabsir.pages.SuperBirdCafePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestSuperBirdCafe {

    WebDriver driver;
    SuperBirdCafePage cafePage;

    @BeforeEach
    public void oneTimeSetup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String PAGE_URL = "https://highlifeshop.com/speedbird-cafe";
        driver.get(PAGE_URL);
    }

    @Test
    public void testSortingByProductName() {
        cafePage = new SuperBirdCafePage(driver);

        cafePage.ensurePageLoaded();
    }

    @AfterEach
    public void oneTimeTearDown() {
        driver.close();
    }

}
