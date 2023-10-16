package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class RomanConverterTest {
    private Converter converter;
    private double expectedAnswer;
    private double value;
    private int point;

    @Given("Execute conversion to meters and user entered the value {double}")
    public void executeConversionToMetersAndUserEnteredTheValue(double value) {
        this.value = value;
    }

    @When("Will enter point {int}")
    public void willEnterPoint(int point) {
        this.point = point;
    }

    @Then("We should get the {double}")
    public void weShouldGetThe(double expectedAnswer) {
        this.expectedAnswer = expectedAnswer;
        double actualAnswer = converter.roman(point,value);
        assertEquals(expectedAnswer, actualAnswer, 0.001);
    }
}
