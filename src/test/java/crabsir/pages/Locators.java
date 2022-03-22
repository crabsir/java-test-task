package crabsir.pages;

import java.util.Map;

public class Locators {

    public static class SuperBirdCafePageLocators {
        public static String ensureLocator = "a > img";

        public static String pageTitle = "British Airways Online Shop | Food and Drink On-board | " +
            "British Airways Speedbird Café | Duty Free Goods Online | Buy On Board Online | BA Speedbird Café " +
            "| BA High Life Shop Highlifeshop.com";

        public static String acceptCookies = "#btn-cookie-allow";

        public static String sortingMethod = "#sorter";

        public static String firstMenuItem = "div > strong > a";

        public static String reverseOrder = "#sorter + a";

        public static Map<String, String> firstItemMap = Map.of(
            "Position", "Tom Kerridge - Ham Hock and Smoked Cheddar Sandwich",
            "Product Name", "Afternoon Tea Box Sultana Scone, Clotted Cream and Strawberry Preserve",
            "Price", "Savoursmiths Somerset Cheddar & Shallot Potato Crisps 35g",
            "New Arrivals", "Aviation American Gin 5cl",
            "Position descending", "MEAL BUNDLES",
            "Product Name descending", "Wolfys Porridge Honey",
            "Price descending", "Pannier Brut NV Champagne 375ml",
            "New Arrivals descending", "Aviation American Gin 5cl"
        );
    }

}
