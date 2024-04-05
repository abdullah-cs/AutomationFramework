package sa.abdullah.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sa.abdullah.constants.FrameworkConstants;
import sa.abdullah.driver.DriverManager;
import sa.abdullah.enms.WaitStrategy;

import java.time.Duration;

public class ExplicitWaitFactory {

    public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by){

        WebElement element = null;
        int waitTime = FrameworkConstants.getWaitTime();

        switch (waitStrategy){

            case CLICKABLE -> element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(waitTime))
                    .until(ExpectedConditions.elementToBeClickable(by));

            case VISIBLE -> element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(waitTime))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));

            case PRESENCE -> element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(waitTime))
                    .until(ExpectedConditions.presenceOfElementLocated(by));

            case NONE -> element = DriverManager.getDriver().findElement(by);

        }

        return element;
    }
}
