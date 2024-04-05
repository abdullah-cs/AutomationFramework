package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sa.abdullah.driver.Driver;

import java.io.IOException;

public class BaseTest {

    protected BaseTest(){
    }

    @BeforeMethod
    protected void setup() throws IOException, InterruptedException {
        Driver.initDriver();
        Thread.sleep(2000);
    }

    @AfterMethod
    protected void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        Driver.quitDriver();
    }
}
