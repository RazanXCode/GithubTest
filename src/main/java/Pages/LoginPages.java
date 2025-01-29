package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.GithubPaths.*;

public class LoginPages {

    WebDriver driver = null;

    public LoginPages(WebDriver driver){
        this.driver = driver;
        //This is Space
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
    }

    public void clickOnSignInBtn(){
        WebElement SignInBtn = driver.findElement(signIn);
        SignInBtn.click();
    }

    public void clickOnSignUpBtn(){
        WebElement SignUpBtn = driver.findElement(signUp);
        SignUpBtn.click();
    }

    public void clickOnTerms(){
        WebElement Terms = driver.findElement(terms);
        Terms.click();
    }


    public void clickOnPrivacy(){
        WebElement Privacy = driver.findElement(privacy);
        Privacy.click();
    }


    public void clickOnHome(){
        WebElement Home = driver.findElement(home);
        Home.click();
    }





}

