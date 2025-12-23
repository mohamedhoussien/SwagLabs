import org.example.CartPage;
import org.example.LoginPage;
import org.example.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test(dataProvider = "products", dataProviderClass = ProductDataProvider.class)
    public void addDifferentProductsToCart(String[] products) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.getProductTitle().isDisplayed());

        for (String product : products) {
            productPage.clickOnProduct(product);
        }

        productPage.openCart();

        CartPage cartPage = new CartPage(driver);

        Assert.assertEquals(
                cartPage.getCartItemsCount(),
                products.length
        );
    }
}
