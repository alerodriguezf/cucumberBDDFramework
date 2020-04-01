package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Test extends TestBase{



    @Given("^El usuario se encuentra en la pagina home de la web$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_la_web() throws Throwable {
        Assert.assertTrue("La pagina en la que se encuentra no es la principal",homePage.homePageIsDisplayed());
    }

    @When("^El usuario hace click sobre el botón de little tester comics$")
    public void el_usuario_hace_click_sobre_el_botón_de_little_tester_comics() throws Throwable {
        homePage.clickOnTitleComics();
    }

    @Then("^La web nos redirige a la página de Categoría Comics$")
    public void la_web_nos_redirige_a_la_página_de_Categoría_Comics() throws Throwable {
        Assert.assertTrue("No se redirecciono correctamente a la pagina de comics", comicsPage.isTitleComicsDisplayed());

    }
}
