package tech.elfin.homework.lesson4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
    public enum Browsers {
        CHROME,
        IE,
        FIREFOX}

    public static WebDriver create (Browsers brouser, String... options) {
         if (brouser == Browsers.CHROME){
             System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
             return new ChromeDriver();
         }
         if (brouser == Browsers.IE) {
             System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
             return new InternetExplorerDriver();
         }
         if (brouser == Browsers.FIREFOX) {
             System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
             return new FirefoxDriver();
         }
         return null;
    }
}