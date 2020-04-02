package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    private String loginPageTitle = "Login";
    private By loginPageTitleLocator = By.className("Login__headline-1___qo4Tz");


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean loginPageIsDisplayed() throws Exception {
        return this.isDisplayed(loginPageTitleLocator)&& this.getText(loginPageTitleLocator).equals(loginPageTitle);
    }



}
