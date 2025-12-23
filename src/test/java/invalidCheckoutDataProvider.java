import org.testng.annotations.DataProvider;

public class invalidCheckoutDataProvider {
    @DataProvider(name = "invalidCheckoutData")
    public Object[][] invalidCheckoutData() {
        return new Object[][]{
                {"", "Hussein", "12345"},
                {"Mohamed", "", "12345"},
                {"Mohamed", "Hussein", ""},
                {" "," "," "},
                {"12345","Hussein","12345"},
                {"Mohamed","12345","12345"},
                {"*&^&^","Hussein","12345"},
                {"Mohamed","",""}
        };
    }

}
