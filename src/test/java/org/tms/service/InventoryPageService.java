package org.tms.service;

import org.openqa.selenium.WebElement;
import org.tms.page.InventoryPage;

public class InventoryPageService {
    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualNameOfPageText() {
        return inventoryPage.getNameOfPageText();
    }

    public String getShoppingCartValue() {
        return inventoryPage.getShoppingCartBadge().getText();
    }

    public InventoryPageService clickAddToCartButton(int index) {
        inventoryPage.getAddToCartButton(index).click();
        return this;
    }

    public InventoryPageService clickRemoveFromCartButton(int index) {
        inventoryPage.getRemoveFromCartButton(index).click();
        return this;
    }

    public boolean isAddToCartButtonDisplayed(int index) {
        return inventoryPage.getAddToCartButton(index).isDisplayed();
    }

    public boolean isRemoveFromCartButtonDisplayed(int index) {
        return inventoryPage.getRemoveFromCartButton(index).isDisplayed();
//        return inventoryPage.getRemoveFromCartButton(index) != null;
    }

    public int getNumberOfRemoveButtons() {
        return inventoryPage.getRemoveFromCartButton().toArray().length;
    }

    public int getNumberOfAddButtons() {
        return inventoryPage.getAddToCartButton().toArray().length;
    }

}
