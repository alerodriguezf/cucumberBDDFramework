package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    private String titleHomePage = "Space & Beyond | Testim.io demo";
    private By loginButtonLocator = By.className("NavButton__nav-button___34wHC");


    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnLoginButton() throws Exception {
        this.click(loginButtonLocator);
    }


}
