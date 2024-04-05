package test;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import sa.abdullah.pages.OrangeHRMHomePage;
import sa.abdullah.pages.OrangeHRMLoginPage;

public class OrangeHRMTest extends BaseTest{


    @Test
    public void login() throws InterruptedException {

        String title = new OrangeHRMLoginPage().enterUsername("admin").enterPassword("admin123").clickLogin()
                .clickProfilePicture().clickLogout()
                .getTitle();

        Assertions.assertThat(title)
                .isEqualTo("OrangeHRM");

    }

}
