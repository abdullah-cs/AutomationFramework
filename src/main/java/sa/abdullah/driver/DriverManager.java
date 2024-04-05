package sa.abdullah.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){}
    private static ThreadLocal<WebDriver> threadSafeDriver= new ThreadLocal<>();


    public static void setDriver(WebDriver driver){
        threadSafeDriver.set(driver);
    }

    public static WebDriver getDriver(){
        return threadSafeDriver.get();
    }

    public static void unload(){
        threadSafeDriver.remove();
    }
}
