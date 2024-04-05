package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import sa.abdullah.driver.DriverManager;

import java.util.List;
import java.util.Objects;

import static sa.abdullah.driver.DriverManager.getDriver;

public final class HomePageTest extends BaseTest {

    private HomePageTest(){}

    @Test
    public void test3(){

        getDriver().findElement(By.name("q")).sendKeys("test3");
    }

    @Test
    public void test4(){

        getDriver().findElement(By.name("q")).sendKeys("Testing mini bytes - Youtube", Keys.ENTER);

        String title = getDriver().getTitle();

        Assert.assertTrue(Objects.nonNull(title), "Title is null");
        Assert.assertTrue(title.toLowerCase().contains("بحث google"), "Title (" + title + ") doesn't have google search in it");
        Assert.assertTrue(title.length() > 15, "Title is less than 14 characters");
        Assert.assertTrue(title.length() < 100, "Title is more than 100mCharacters");

        List<WebElement> links =  DriverManager.getDriver().findElements(By.xpath("//a/h3"));

        boolean isElementPresent = false;
        for (WebElement link : links) {
            if (link.getText().equals("Testing Mini Bytes")){
                isElementPresent = true;
                break;
            }
        }
        Assert.assertTrue(isElementPresent);

    }
}
