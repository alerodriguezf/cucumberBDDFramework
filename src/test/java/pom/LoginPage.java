package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    private String loginPageTitle = "LOGIN";


    private By loginPageTitleLocator = By.className("Login__headline-1___qo4Tz");
    private By userNameBoxLocator = By.xpath("/html/body/div/div/section[3]/div/div[2]/div/form/div[1]/input");
    private By passwordBoxLocator = By.xpath("/html/body/div/div/section[3]/div/div[2]/div/form/div[2]/input");
    private By userNameErrorMessageLocator = By.xpath("/html/body/div/div/section[3]/div/div[2]/div/form/div[1]/span[3]");
    private By passwordErrorMessageLocator = By.xpath("/html/body/div/div/section[3]/div/div[2]/div/form/div[2]/span[3]");
    private By loginButtonLocator = By.className("theme__button___1iKuo LoginButton__button___1Sd3Q theme__raised___ONZv6 LoginButton__raised___1fUxJ theme__primary___2NhN1 LoginButton__primary___38GOe");
    private By cancelButtonLocator = By.className("theme__button___1iKuo LoginButton__button___1Sd3Q theme__flat___2ui7t LoginButton__flat___Kv6Aw theme__accent___3MS_k LoginButton__accent___hdTFW");


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean loginPageIsDisplayed() throws Exception {
        return this.isDisplayed(loginPageTitleLocator)&& this.getText(loginPageTitleLocator).equals(loginPageTitle);

    }

    public void typeMessageInABox(String message) throws Exception {
        this.sendKeys(message,userNameBoxLocator);
    }

    public void clickOnLoginButtonAtLoginPage() throws Exception {
        this.click(loginButtonLocator);
    };

    public void clickOnCancelButtonAtLoginPage() throws Exception {
        this.click(passwordBoxLocator);
    };

    public boolean userNameErrorMessageIsDisplayed(String usernameErrorMessage) throws Exception {
        if (usernameErrorMessage == null){
            return this.isDisplayed(userNameErrorMessageLocator);
        }
        else{
            return this.isDisplayed(userNameErrorMessageLocator) && this.getText(userNameErrorMessageLocator).equals(usernameErrorMessage);
        }
    }

    public boolean passwordErrorMessageIsDisplayed(String passwordErrorMessage) throws Exception {
        if (passwordErrorMessage == null){
            return this.isDisplayed(passwordErrorMessageLocator);
        }
        else{
            return this.isDisplayed(passwordErrorMessageLocator) && this.getText(passwordErrorMessageLocator).equals(passwordErrorMessage);
        }
    }

}
