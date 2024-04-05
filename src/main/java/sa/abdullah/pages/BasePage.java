package sa.abdullah.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sa.abdullah.driver.DriverManager;
import sa.abdullah.enms.WaitStrategy;
import sa.abdullah.factories.ExplicitWaitFactory;

import java.time.Duration;

public class BasePage {


    protected void click(By by, WaitStrategy waitStrategy){

        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.click();
    }

    protected void sendKeys(By by, String text, WaitStrategy waitStrategy){
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
        element.sendKeys(text);
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

}
