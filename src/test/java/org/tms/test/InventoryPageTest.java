package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.page.InventoryPage;
import org.tms.service.InventoryPageService;
import org.tms.service.LoginPageService;

public class InventoryPageTest extends BaseTest {
    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void addFirstItemToCartTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        boolean isRemoveButtonDisplayed = inventoryPageService
                .clickAddToCartButton(0)
                .isRemoveFromCartButtonDisplayed(0);
        String actualText = inventoryPageService
                .getShoppingCartText();
        Assert.assertTrue(isRemoveButtonDisplayed, "Remove button don't displayed");
        Assert.assertEquals(actualText,"1", "Shopping cart value not match");
    }

    @Test
    public void addAndRemoveFirstItemFromCartTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        boolean isRemoveButtonDisplayed = inventoryPageService
                .clickAddToCartButton(0)
                .clickRemoveFromCartButton(0)
                .isRemoveFromCartButtonDisplayed(0);
        String shoppingCartText = inventoryPageService
                .getShoppingCartText();
        Assert.assertFalse(isRemoveButtonDisplayed,"Remove button displayed");
        Assert.assertEquals(shoppingCartText, "", "Shopping cart value not match");
    }
}
