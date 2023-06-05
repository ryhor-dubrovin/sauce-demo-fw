package org.tms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

public abstract class BasePage {
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();
    private final static int WAIT_TIMEOUT_SECONDS = 20;

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitVisibilityOf(WebElement webElement) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.visibilityOf(webElement));
    }

    protected WebElement waitElementToBeClickable(WebElement webElement) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
