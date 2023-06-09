package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.tms.model.User;
import org.tms.service.InventoryPageService;
import org.tms.service.LoginPageService;

public class InventoryPageTest extends BaseTest {
    private LoginPageService loginPageService;
    private static final String EMPTY_CART_VALUE = "";
    private static final String ONE_ITEM_CART_VALUE = "1";
    public static final int REMOVE_BUTTONS_COUNT_ON_EMPTY_CART = 0;
    public static final int REMOVE_BUTTONS_COUNT_ON_ONE_ITEM_CART = 1;


    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void addFirstItemToCartTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        SoftAssert softAssert = new SoftAssert();
        int numberOfDisplayedRemoveButtons = inventoryPageService
                .clickAddToCartButton(0)
                .getNumberOfRemoveButtons();
        String actualShoppingCartValue = inventoryPageService
                .getShoppingCartValue();
        softAssert.assertEquals(numberOfDisplayedRemoveButtons, REMOVE_BUTTONS_COUNT_ON_ONE_ITEM_CART,"Remove button don't displayed");
        Assert.assertEquals(actualShoppingCartValue, ONE_ITEM_CART_VALUE, "Shopping cart value not match");
        softAssert.assertAll();
    }

    @Test
    public void addAndRemoveFirstItemFromCartTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        SoftAssert softAssert = new SoftAssert();
        int numberOfDisplayedRemoveButtons = inventoryPageService
                .clickAddToCartButton(0)
                .clickRemoveFromCartButton(0)
                .getNumberOfRemoveButtons();
        String actualShoppingCartValue = inventoryPageService
                .getShoppingCartValue();
        softAssert.assertEquals(numberOfDisplayedRemoveButtons,REMOVE_BUTTONS_COUNT_ON_EMPTY_CART,"Remove button displayed");
        Assert.assertEquals(actualShoppingCartValue, EMPTY_CART_VALUE, "Shopping cart value not match");
        softAssert.assertAll();
    }
}