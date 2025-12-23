package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By cartItems = By.className("cart_item");
    private final By checkoutBtn = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public int getCartItemsCount() {
        return driver.findElements(cartItems).size();
    }

    public void clickCheckout() {
        driver.findElement(checkoutBtn).click();
    }
}
