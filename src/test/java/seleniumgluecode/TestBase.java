package seleniumgluecode;

import org.openqa.selenium.WebDriver;

import pom.HomePage;
import pom.LoginPage;

import static seleniumgluecode.Hooks.getDriver;

public class TestBase {

    protected  WebDriver driver = getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);


}
