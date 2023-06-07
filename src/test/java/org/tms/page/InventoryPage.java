package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPage extends BasePage {
    private static final String EXPECTED_NAME_OF_PAGE = "Products";
    @FindBy(xpath = "//span[@class='title']")
    private WebElement actualNameOfPage;
    @FindBy(xpath = "//button[contains(text(), 'Add to cart')]")
    private List<WebElement> addToCartButton;
    @FindBy(xpath = "//button[contains(text(), 'Remove')]")
    private List<WebElement> removeFromCartButton;
    @FindBy(xpath = "//span[@class='shopping_cart_badge']")
    private WebElement shoppingCartBadge;

    public static String getExpectedNameOfPage() {
        return EXPECTED_NAME_OF_PAGE;
    }
    public String getNameOfPageText() {
        return waitVisibilityOf(actualNameOfPage).getText();
    }

    public WebElement getAddToCartButton(int index) {
        return waitElementToBeClickable(addToCartButton.get(index));
    }

    public WebElement getRemoveFromCartButton(int index) {
        return waitElementToBeClickable(removeFromCartButton.get(index));
    }

    public WebElement getShoppingCartBadge() {
        return waitVisibilityOf(shoppingCartBadge);
    }

}
