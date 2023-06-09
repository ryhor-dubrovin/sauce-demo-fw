package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userNameField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillInUserName(String username) {
        waitVisibilityOf(userNameField).sendKeys(username);
        return this;
    }

    public LoginPage fillInPassword(String password) {
        waitVisibilityOf(passwordField).sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        waitElementToBeClickable(loginButton).click();
    }

}
