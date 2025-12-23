package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage {

    private final By productTitle = By.xpath("//span[text()='Products']");
    private final By addToCartButtons = By.xpath("//button[text()='Add to cart']");
    private final By cartIcon = By.className("shopping_cart_link");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductTitle() {
        return driver.findElement(productTitle);
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }


    public void clickOnProduct(String productName) {

        List<WebElement> elementList = driver.findElements(addToCartButtons);

        for (WebElement element : elementList) {
            String elementId = element.getAttribute("id");

            if (elementId != null && elementId.toLowerCase().contains(productName.toLowerCase())) {
                element.click();
                break;
            }
        }
    }
}
