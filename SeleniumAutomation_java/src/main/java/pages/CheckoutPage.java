package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;

public class CheckoutPage {

    public WebDriver driver;
    private By checkoutButton = By.id("checkout");
    private By title = By.xpath("//span[@class='title']");
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By zipPostalCode = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
        assertEquals(driver.findElement(title).getText(), "Checkout: Your Information");
    }

    public void enterUserDetails(String fName, String lName, String code ) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(zipPostalCode).sendKeys(code);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
        assertEquals(driver.findElement(title).getText(), "Checkout: Overview");
    }

    public void clickFinish() {
        driver.findElement(finishButton).click();
        assertEquals(driver.findElement(title).getText(), "Checkout: Complete!");
    }
}
