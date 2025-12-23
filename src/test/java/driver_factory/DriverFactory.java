package driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver=null;
    public static WebDriver getWebDriver(String browserName){
       if(driver==null){
           switch (browserName.toLowerCase()){
               case "chrome":
                   driver= ChromeDriverObject.getChromeDriver();
                   break;
               case "firefox":
                   driver=FireFoxDriverObject.getFireFoxDriver();
                   break;
               default:
                   driver=EdgeDriverObject.getEdgeDriver();
                   break;
           }
           return driver;
       }
       return driver;
    }
}

