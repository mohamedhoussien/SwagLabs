package driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public class FireFoxDriverObject {
    public static WebDriver getFireFoxDriver(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }
}