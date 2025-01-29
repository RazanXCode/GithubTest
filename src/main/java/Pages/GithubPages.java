package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.GithubPaths.*;
import static ObjectsPath.LoginPaths.*;


public class GithubPages {
    WebDriver driver = null;

    public GithubPages(WebDriver driver){
        this.driver = driver;
        //This is Space
    }

    public void openGitUrl(){
        driver.get("https://github.com/");
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
