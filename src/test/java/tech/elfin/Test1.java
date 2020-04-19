package tech.elfin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import tech.elfin.homework.lesson4.WebDriverFactory;

public class Test1 {
    private static final Logger logger = LogManager.getLogger(Test1.class);


    @Test
    public void newtest (){
        WebDriver driver = WebDriverFactory.create("CHROME");
        driver.get("https://otus.ru/");
        driver.quit();
        logger.info("Chrome Успех");
    }
}
