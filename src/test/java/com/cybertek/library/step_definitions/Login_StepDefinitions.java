package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Library_first_page;
import com.cybertek.library.pages.Library_login_page;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {


    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }

    @When("I login as a {string}")
    public void i_login_as_a(String string) {
        Library_login_page.logInToLibrary(ConfigurationReader.getProperty(string+"username"),ConfigurationReader.getProperty(string+"password"));

    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String loger) {
        Library_first_page.isDisplayedAssert(loger);
        Driver.closeDriver();
    }
}
