package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sa.abdullah.driver.Driver;
import sa.abdullah.driver.DriverManager;

public final class LoginTest extends BaseTest {

    private LoginTest(){}

    @Test
    public void test1(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("test1");
    }

    @Test
    public void test2(){

        DriverManager.getDriver().findElement(By.name("q")).sendKeys("test2");

    }
}
