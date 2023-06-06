package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfPage;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addBackpackToCartButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeBackpackFromCartButton;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement shoppingCartBadge;

    public String getNameOfPageText() {
        return waitVisibilityOf(nameOfPage).getText();
    }

    public WebElement getRemoveBackpackFromCartButton() {
        return waitElementToBeClickable(removeBackpackFromCartButton);
    }

    public WebElement getShoppingCartBadge() {
        return shoppingCartBadge;
    }

    public WebElement getAddBackpackToCartButton() {
        return waitElementToBeClickable(addBackpackToCartButton);
    }

}
