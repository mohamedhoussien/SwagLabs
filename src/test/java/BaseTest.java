import driver_factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ConfigLoader;
import utilities.ExcelFileManager;
import utilities.JSONFileManager;

public class BaseTest {

    public WebDriver driver;
    public JSONFileManager jsonFileManager;
    public ExcelFileManager excelFileManager;

    @BeforeClass
    public void setUp() {

        jsonFileManager = new JSONFileManager(
                "src/main/resources/credential.json"
        );

        excelFileManager = new ExcelFileManager(
                "src/main/resources/Book1.xlsx",
                "Sheet1"
        );

        driver = DriverFactory.getWebDriver("chrome");

        ConfigLoader configLoader =
                new ConfigLoader("src/main/resources/config.properties");

        driver.get(configLoader.getProperty("url"));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
