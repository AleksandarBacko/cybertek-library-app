package com.cybertek.library.step_definitions;

import com.cybertek.library.utilities.Driver;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io cucumber java

    @Before ("@login")
    public void setUpScenario(){
        System.out.println("Seting up browser with further details");
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("tear down steps are being applied");
//        Driver.closeDriver();
    }
//
//    @BeforeStep
//    public void setup(){
//        System.out.println("setup applying for each step");
//    }
//
//    @AfterStep
//    public void afterStep(){
//        System.out.println("teardown applying for each step");
//    }
}
