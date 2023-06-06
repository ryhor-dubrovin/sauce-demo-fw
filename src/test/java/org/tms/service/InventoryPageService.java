package org.tms.service;

import org.openqa.selenium.WebElement;
import org.tms.page.InventoryPage;

public class InventoryPageService {
    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualNameOfPageText() {
        return inventoryPage.getNameOfPageText();
    }

    public String getShoppingCartText() {
        return inventoryPage.getShoppingCartBadge().getText();
    }

    public InventoryPageService clickAddBackpackButton() {
        inventoryPage.getAddBackpackToCartButton().click();
        return this;
    }

    public InventoryPageService clickRemoveBackpackButton() {
        inventoryPage.getRemoveBackpackFromCartButton().click();
        return this;
    }

    public boolean isRemoveBackpackButtonDisplayed() {
        return inventoryPage.getRemoveBackpackFromCartButton().isDisplayed();
    }

    public boolean isAddBackpackButtonDisplayed() {
        return inventoryPage.getAddBackpackToCartButton().isDisplayed();
    }
}
