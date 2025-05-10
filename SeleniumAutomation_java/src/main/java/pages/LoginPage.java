package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By userName = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void setUserName(String username) {
        driver.findElement(userName).sendKeys(username);
    }

    public void setPassword(String pwd) {

        driver.findElement(password).sendKeys(pwd);
    }

    public HomePage clickLoginButton() {
        driver.findElement(loginButton).click();
        return  new HomePage(driver);
    }
}
