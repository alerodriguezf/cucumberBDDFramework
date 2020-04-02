package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Login extends TestBase{

    @Given("^User is on the website home page$")
    public void user_is_on_the_website_home_page() throws Exception {
        Assert.assertTrue("The current page is not the home page",homePage.homePageIsDisplayed());
    }

    @When("^User clicks on the log in button$")
    public void user_clicks_on_the_log_in_button() throws Throwable {
        homePage.clickOnLoginButton();
    }

    @Then("^Website redirects user to the log in page$")
    public void website_redirects_user_to_the_log_in_page() throws Throwable {
        Assert.assertTrue("The current page is not the log in page expected",loginPage.loginPageIsDisplayed());
    }


}
