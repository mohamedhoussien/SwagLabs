import org.example.LoginPage;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

@Test
public void validLoginTest() {

    LoginPage loginPage = new LoginPage(driver);
    loginPage.login((String) jsonFileManager.getValue("username"),(String) jsonFileManager.getValue("password"));
}


    @Test(
            dataProvider = "credentials",
            dataProviderClass = LoginDataProvider.class
    )
    public void loginTest(String user, String pass) {

        System.out.println("Logging in with: " + user + " / " + pass);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user, pass);
    }

}
