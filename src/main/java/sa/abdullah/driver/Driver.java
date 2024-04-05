package sa.abdullah.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ThreadGuard;
import sa.abdullah.constants.FrameworkConstants;
import sa.abdullah.enms.ConfigProperties;
import sa.abdullah.utils.ReadPropertyFile;

import java.util.Objects;

public final class Driver {

    private Driver(){}
    public static void initDriver() {
        if (Objects.isNull(DriverManager.getDriver())){
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            WebDriver driver = ThreadGuard.protect(new ChromeDriver());

            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(ReadPropertyFile.getProperty(ConfigProperties.URL));
        }
    }

    public static void quitDriver(){
        if (Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }

}
