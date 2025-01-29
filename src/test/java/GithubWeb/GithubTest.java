package GithubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);
        login.openGitUrl();
        Thread.sleep(2000);
        login.clickOnSignInBtn();
        Thread.sleep(2000);
        login.clickOnHome();
        Thread.sleep(2000);
        login.clickOnSignUpBtn();
        Thread.sleep(2000);
        login.clickOnTerms();
        Thread.sleep(2000);
        login.clickOnPrivacy();
        Thread.sleep(2000);
    }
}
