package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By item1 = By.id("add-to-cart-sauce-labs-backpack");
    private By item2 = By.id("add-to-cart-sauce-labs-bike-light");
    private By shoppingCart = By.id("shopping_cart_container");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }
    public void selectItems() {
        driver.findElement(item1).click();
        driver.findElement(item2).click();
    }

    public CheckoutPage clickShoppingCart() {
        driver.findElement(shoppingCart).click();
        return new CheckoutPage(driver);
    }
}
