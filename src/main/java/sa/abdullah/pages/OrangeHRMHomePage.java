package sa.abdullah.pages;

import org.openqa.selenium.By;
import sa.abdullah.enms.WaitStrategy;


public class OrangeHRMHomePage extends BasePage {
    
    private final By image_profilePicture = By.xpath("(//img[@alt='profile picture'])[1]");
    private final By button_logout = By.xpath("//a[normalize-space()='Logout']");


    public OrangeHRMHomePage clickProfilePicture(){
        click(image_profilePicture, WaitStrategy.CLICKABLE);
        return this;
    }
    public OrangeHRMLoginPage clickLogout(){
        click(button_logout, WaitStrategy.CLICKABLE);
        return new OrangeHRMLoginPage();
    }


    
    
}
