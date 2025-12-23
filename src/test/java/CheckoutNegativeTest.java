import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.CartPage;
import org.example.CheckoutPage;
import org.example.LoginPage;
import org.example.ProductPage;
import org.testng.annotations.Test;


public class CheckoutNegativeTest extends BaseTest {

    @Test(dataProvider = "invalidCheckoutData", dataProviderClass = invalidCheckoutDataProvider.class)
    public void checkoutNegativeScenario(String fName, String lName, String zip) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        productPage.clickOnProduct("backpack");
        productPage.openCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCheckoutInfo(fName, lName, zip);
        checkoutPage.clickContinue();
        checkoutPage.clickFinish();

    }

    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1, description = "Valid login test")

    public void checkoutNegativeScenario () {

        String fName = excelFileManager.getSpecificCellValue(1, 0);
        String lName = excelFileManager.getSpecificCellValue(1, 1);
        String zip = excelFileManager.getSpecificCellValue(1, 2);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductPage productPage = new ProductPage(driver);
        productPage.clickOnProduct("backpack");
        productPage.openCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.fillCheckoutInfo(fName, lName, zip);
        checkoutPage.clickContinue();
    }
}

