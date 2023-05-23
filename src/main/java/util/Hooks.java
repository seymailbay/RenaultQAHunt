package util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {

    WebDriver driver;
    Properties properties;

    @Before
    public void before(){

        // bu hook yapısıyla browser ımızı oluştururuz.
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");

        System.out.println(browser);
        properties =ConfigReader.initialize_Properties();
        driver=DriverFactory.initialize_Driver(browser);
    }

    @After
    public void after(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
