package crabsir;

import crabsir.pages.SuperBirdCafePage;

public class TestSuperBirdCafe {

    private final String PAGE_URL = "https://highlifeshop.com/speedbird-cafe";

    SuperBirdCafePage cafePage = (SuperBirdCafePage) SuperBirdCafePage.goTo(PAGE_URL);

}
