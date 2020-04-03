package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Login extends TestBase{

    //SCENARIO 1
    @Given("^User is on the website home page$")
    public void user_is_on_the_website_home_page() throws Exception {
        Assert.assertTrue("The current page is not the home page",homePage.homePageIsDisplayed());
    }

    @When("^User clicks on the log in button$")
    public void user_clicks_on_the_log_in_button() throws Exception {
        homePage.clickOnLoginButton();
    }

    @Then("^Website redirects user to the log in page$")
    public void website_redirects_user_to_the_log_in_page() throws Exception {
        Assert.assertTrue("The current page is not the log in page expected",loginPage.loginPageIsDisplayed());
    }

    //SCENARIO 2 (OUTLINE)
    @Given("^User is on the website login page$")
    public void user_is_on_the_website_login_page() throws Exception {
        homePage.clickOnLoginButton();
        Assert.assertTrue("The current page is not the log in page expected",loginPage.loginPageIsDisplayed());
    }

    @When("^User enters his username at username box \"([^\"]*)\"$")
    public void user_enters_his_username_at_username_box(String username) throws Exception {
        loginPage.typeMessageInAUserNameBox(username);
    }

    @When("^User enters his \"([^\"]*)\" at password box$")
    public void user_enters_his_at_password_box(String password) throws Exception {
        loginPage.typeMessageInAPasswordBox(password);
    }

    @When("^User clicks on the log in button at login page$")
    public void user_clicks_on_the_log_in_button_at_login_page() throws Exception {
        loginPage.clickOnLoginButtonAtLoginPage();
    }

    @Then("^Website shows \"([^\"]*)\" and \"([^\"]*)\"$")
    public void website_shows_and(String usernameErrorMessage, String passwordErrorMessage) throws Exception {
        if (!usernameErrorMessage.equals("")){
            Assert.assertTrue("Wrong username error message displayed",loginPage.userNameErrorMessageIsDisplayed(usernameErrorMessage));
        }

        if (!passwordErrorMessage.equals("")){
            Assert.assertTrue("Wrong password error message displayed",loginPage.passwordErrorMessageIsDisplayed(passwordErrorMessage));
        }
    }



}
