package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfPage;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addBackPackToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeBackPackFromCartButton;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement shoppingCartBadge;

    public String getNameOfPageText() {
        return waitVisibilityOf(nameOfPage).getText();
    }

    public InventoryPage clickAddBackPackToCartButton() {
        waitElementToBeClickable(addBackPackToCartButton).click();
        return this;
    }

    public InventoryPage clickRemoveBackPackFromCartButton() {
        getRemoveBackPackFromCartButton().click();
        return this;
    }

    public WebElement getRemoveBackPackFromCartButton() {
        return waitElementToBeClickable(removeBackPackFromCartButton);
    }

    public WebElement getShoppingCartBadge() {
        return shoppingCartBadge;
    }

    public WebElement getAddBackPackToCartButton() {
        return waitElementToBeClickable(addBackPackToCartButton);
    }
}
