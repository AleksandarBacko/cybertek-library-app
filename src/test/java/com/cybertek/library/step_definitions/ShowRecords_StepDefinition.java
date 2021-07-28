package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Library_Users_first_page;
import com.cybertek.library.pages.Library_first_page;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ShowRecords_StepDefinition {

    @When("I click on {string} link")
    public void i_click_on_link(String string) {
        Library_first_page.chooseOptopn(string);
    }
    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(int int1) {
            int actualDefValue=Library_Users_first_page.getDefaultOptionInRecordsDrop();

        System.out.println(actualDefValue);
        System.out.println(int1);
        Assert.assertEquals(int1,actualDefValue);

    }
    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedList) {

        List<String> actualList=Library_Users_first_page.listOfOptionsINRecordsDrop();
        System.out.println(expectedList);
        System.out.println(actualList);
        Assert.assertEquals(expectedList,actualList);

    }



    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> expectedListOfColumns) {
        List<String> actualListOfColums=Library_Users_first_page.getListOfColumns();
        System.out.println(actualListOfColums);
        System.out.println(expectedListOfColumns);
        Assert.assertEquals(expectedListOfColumns,actualListOfColums);
    }
}
