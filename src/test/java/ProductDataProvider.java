
import org.testng.annotations.DataProvider;

public class ProductDataProvider {

    @DataProvider(name = "products")
    public Object[][] productsData() {
        return new Object[][]{
                { new String[]{"backpack", "bike", "bolt"} },
                { new String[]{"fleece", "onesie"} },
                { new String[]{"backpack"} }
        };
    }
}
