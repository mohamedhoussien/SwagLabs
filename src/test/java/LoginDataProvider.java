import org.testng.annotations.DataProvider;

public class LoginDataProvider {

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        return new Object[][]{
                {"123456", "secret_sauce"},
                {"*^$%^#$#$", "secret_sauce"},
                {"standard_user", ""},
                {"", ""}
        };
    }
}
