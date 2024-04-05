package sa.abdullah.pages;

import org.openqa.selenium.By;
import sa.abdullah.enms.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {


    private final By textbox_username = By.name("username");
    private final By textbox_password = By.name("password");
    private final By button_login = By.xpath("//button[normalize-space()='Login']");


    public OrangeHRMLoginPage enterUsername(String username){
        sendKeys(textbox_username, username, WaitStrategy.PRESENCE);
        return this;
    }

    public OrangeHRMLoginPage enterPassword(String password){
        sendKeys(textbox_password, password, WaitStrategy.NONE);
        return this;
    }

    public OrangeHRMHomePage clickLogin(){
        click(button_login, WaitStrategy.NONE);
        return new OrangeHRMHomePage();
    }

    public String getTitle(){
        return getPageTitle();
    }



}
