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


    public static WebDriver create (String webDriverName) {
         if (webDriverName.toUpperCase().equals(Browsers.CHROME.toString())){
             System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
             return new ChromeDriver();
         }
         if (webDriverName.toUpperCase().equals(Browsers.IE.toString())) {
             System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
             return new InternetExplorerDriver();
         }
         if (webDriverName.toUpperCase().equals(Browsers.FIREFOX.toString())) {
             System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
             return new FirefoxDriver();
         }
         return null;
    }
   }