package org.tms.service;

import org.tms.page.InventoryPage;

public class InventoryPageService {
    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualNameOfPageText() {
        return inventoryPage.getNameOfPageText();
    }

    public String getShoppingCartText() {
        return inventoryPage.getShoppingCartBadge().getText();
    }
}
