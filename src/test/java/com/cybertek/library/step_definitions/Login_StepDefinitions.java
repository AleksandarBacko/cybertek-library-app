package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Library_first_page;
import com.cybertek.library.pages.Library_login_page;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
    }

    @When("I enter username {string}")
    public void iEnterUsername(String arg0) {
        Library_login_page.putEmail(arg0);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String arg0) {
        Library_login_page.putPassword(arg0);
    }

    @And("click the sign in button")
    public void clickTheSignInButton() {
        Library_login_page.clickOnSingInButton();
    }

    @And("there should be {int}users")
    public void thereShouldBeUsers(int arg0) {


        System.out.println(arg0);
        System.out.println(Library_login_page.numberOfUsers());
        Assert.assertEquals(arg0,Library_login_page.numberOfUsers());
    }

    @When("I login using {string}and {string}")
    public void iLoginUsingAnd(String arg0, String arg1) {
        Library_login_page.logInToLibrary(arg0,arg1);
    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String arg0) {
        System.out.println(arg0);
        System.out.println(Library_login_page.getNameOfAccount());
        Assert.assertEquals(arg0,Library_login_page.getNameOfAccount());
    }
}
