package org.tms.service;

import jdk.internal.net.http.common.Log;
import org.tms.model.User;
import org.tms.page.LoginPage;

public class LoginPageService {
    protected static final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";

    public InventoryPageService login(User user) {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUserName(user.getName())
                .fillInPassword(user.getPassword())
                .clickLoginButton();
        return new InventoryPageService();
    }
}
