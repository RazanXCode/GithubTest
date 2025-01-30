package ObjectsPath;

import org.openqa.selenium.By;

public class GithubPaths {
    // Elemnts pathes for the landing page (SignIn and SignUp) and the terms and privacy on the SignUp page

    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");

    public static final By signUp = By.xpath("//a[contains(text(),'Sign up')]");

    public static final By terms = By.xpath("//a[contains(text(),'Terms')]");

    public static final By privacy = By.xpath("//a[contains(text(),'GitHub Privacy')]");

   // public static final By home = By.xpath("//a[@class='header-logo']");



}
