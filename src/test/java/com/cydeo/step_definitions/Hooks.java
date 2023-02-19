package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    // in this class we will be able to pass pre- and post-conditions to each scenario and each steps

    // always import from io cucumber java
    // Runs ones before each scenario
    @Before(order = 1)
    public void setupScenario() {
        System.out.println("===setting up our browser using cucumber @Before");

    }
    // runs ones only before specified scenarios
    // it is possible to prioritize the running order
    @Before(value = "@login",order = 2)
    public void setupScenarioForLogins() {
        System.out.println("===this will only apply to scenarios with @login tag");

    }

    @Before(value = "@db",order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("===this will only apply to scenarios with @login tag");

    }


    // always import from io cucumber java
    @After
    public void teardownScenario() {
        System.out.println("===Closing browser using cucumber @After");
        System.out.println("===Scenario ended/Take screenshot if failed!!!");

    }

    @BeforeStep
    public void setupStep(){
        System.out.println("------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("------applying teardown using @AfterStep");
    }



}
