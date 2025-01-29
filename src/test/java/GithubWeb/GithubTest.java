package GithubWeb;

import Base.BaseClass;
import Pages.HomePages;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GithubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException {
        LoginPages login = new LoginPages(driver);
        login.openGitUrl();
        login.clickOnSignInBtn();
        login.fillEmail();
        login.fillPassword();
        login.clickOnLogin();
        Thread.sleep(3000);

        // The below should be in A seprate Method called SignUp pages
//        Thread.sleep(2000);
//        login.clickOnHome();
//        Thread.sleep(2000);
//        login.clickOnSignUpBtn();
//        Thread.sleep(2000);
//        login.clickOnTerms();
//        Thread.sleep(2000);
//        login.clickOnPrivacy();
//        Thread.sleep(2000);

}

    public void SignUpPageMethod() throws InterruptedException {

    }


    @Test
    public void createRepoMethod() throws InterruptedException {
        HomePages home = new HomePages(driver);
        loginPageMethod();
        home.clickOnNewRepo();
        home.fillRepoName();
        Thread.sleep(2000);
        home.scrollToPosition(0,600);
        home.clickOnCreateRepo();
        Thread.sleep(5000);
    }
}
