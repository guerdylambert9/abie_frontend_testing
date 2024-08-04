package org.guerdy.lambert.frontend.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.guerdy.lambert.frontend.utilities.logs.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    @Getter
    public static WebDriver driver;
    public static WebDriver myDriver;
    public static Properties configLocatorsProp = new Properties();
    public static Properties loginLocatorsProp = new Properties();
    public static Properties registerLocatorsProp = new Properties();
    public static FileReader configFileReader;
    public static FileReader loginLocatorsReader;
    public static FileReader registrationLocatorsReader;

    //@BeforeClass
    @BeforeMethod
    //@BeforeTest
    public void setUp() throws IOException {
        if(driver==null) {

            configFileReader = new FileReader(System.getProperty("user.dir") + "/src/test/java/resources/configfiles/config.properties");
            loginLocatorsReader = new FileReader(System.getProperty("user.dir") + "/src/test/java/resources/configfiles/loginLocators.properties");
            registrationLocatorsReader = new FileReader(System.getProperty("user.dir") + "/src/test/java/resources/configfiles/registerLocators.properties");

            configLocatorsProp.load(configFileReader);
            loginLocatorsProp.load(loginLocatorsReader);
            registerLocatorsProp.load(registrationLocatorsReader);
        }
        if(configLocatorsProp.getProperty("browser").equalsIgnoreCase("chrome")) {
            System.out.println( System.getProperty("user.dir"));
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();		//base
            driver.get(configLocatorsProp.getProperty("url"));
        }
        else if(configLocatorsProp.getProperty("browser").equalsIgnoreCase("firefox")) {
            System.out.println( System.getProperty("user.dir"));
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(configLocatorsProp.getProperty("url"));
        }
        myDriver = getDriver();
    }

    //@AfterTest
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//        //System.out.println("Teardown successful");
//        Log.info("Teardown successful");
//    }
}
