package org.tms.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.page.LoginPage;
import org.tms.service.InventoryPageService;
import org.tms.service.LoginPageService;

import static org.tms.page.InventoryPage.getExpectedNameOfPage;

public class LoginPageTest extends BaseTest {
    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
    }

    @Test
    public void loginTest() {
        User user = new User("standard_user", "secret_sauce");
        InventoryPageService inventoryPageService = loginPageService.login(user);
        String actualTextOfInventoryPage = inventoryPageService.getActualNameOfPageText();
        Assert.assertEquals(actualTextOfInventoryPage, getExpectedNameOfPage(), "Inventory page text don't match.");
    }
}
