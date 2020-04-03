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
    private By loginButtonLocator = By.xpath("/html/body/div/div/section[3]/div/div[2]/div/nav/button[2]");
    private By cancelButtonLocator = By.className("theme__button___1iKuo LoginButton__button___1Sd3Q theme__flat___2ui7t LoginButton__flat___Kv6Aw theme__accent___3MS_k LoginButton__accent___hdTFW");


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public boolean loginPageIsDisplayed() throws Exception {
        return this.isDisplayed(loginPageTitleLocator)&& this.getText(loginPageTitleLocator).equals(loginPageTitle);
    }

    public void typeMessageInAUserNameBox(String message) throws Exception {
        this.sendKeys(message,userNameBoxLocator);
    }

    public void typeMessageInAPasswordBox(String message) throws Exception {
        this.sendKeys(message,passwordBoxLocator);
    }

    public void clickOnLoginButtonAtLoginPage() throws Exception {
        this.click(loginButtonLocator);
    };

    public void clickOnCancelButtonAtLoginPage() throws Exception {
        this.click(passwordBoxLocator);
    };

    public boolean userNameErrorMessageIsDisplayed(String usernameErrorMessage) throws Exception {

        return this.isDisplayed(userNameErrorMessageLocator) && this.getText(userNameErrorMessageLocator).equals(usernameErrorMessage);

    }

    public boolean passwordErrorMessageIsDisplayed(String passwordErrorMessage) throws Exception {

        return this.isDisplayed(passwordErrorMessageLocator) && this.getText(passwordErrorMessageLocator).equals(passwordErrorMessage);

    }

}
