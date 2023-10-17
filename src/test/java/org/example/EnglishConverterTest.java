package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class EnglishConverterTest {
    private Converter converter;
    private double expectedAnswer;
    private double value;
    private int point;

    @Given("Execute conversion to meters and entered the value {double}")
    public void executeConversionToMetersAndEnteredTheValue(double value) {
        this.value = value;
    }

    @When("Will be selected unit of change {int}")
    public void willBeSelectedUnitOfChange (int point) {
        this.point = point;
    }

    @Then("We should get value {double}")
    public void weShouldGetThe(double expectedAnswer) {
        this.expectedAnswer = expectedAnswer;
        double actualAnswer = converter.english(point,value);
        assertEquals(expectedAnswer, actualAnswer, 0.001);
    }
}
