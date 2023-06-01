package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfPage;

    public String getNameOfPageText() {
        return waitVisibilityOf(nameOfPage).getText();
    }
}
