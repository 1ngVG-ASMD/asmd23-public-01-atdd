package calculator;

import io.cucumber.java.en.*;

import java.util.Objects;

public class CalculatorSteps {
    private int res = 0;
    private Calculator calculator;

    @Given("I have a Calculator")
    public void iHaveACalculator() {
        this.calculator = new Calculator();
    }

    private void enterNumbers(int arg0, int arg1) {
        this.calculator.enter(arg0);
        this.calculator.enter(arg1);
    }

    private void theResultShouldBe(int arg0){
        if (arg0 != this.calculator.getResult()) { // or using Junit's asserts
            throw new IllegalStateException();
        }
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        enterNumbers(arg0, arg1);
    }

    @Then("the sum should be {int}")
    public void theSumShouldBe(int arg0) {
        this.calculator.add();
        theResultShouldBe(arg0);
    }

    @When("I sub {int} and {int}")
    public void iSubAnd(int arg0, int arg1) {
        enterNumbers(arg0, arg1);
    }

    @Then("the sub result should be {int}")
    public void theSubResultShouldBe(int arg0) {
        this.calculator.sub();
        theResultShouldBe(arg0);
    }

    @When("I mult {int} and {int}")
    public void iMultAnd(int arg0, int arg1) {
        enterNumbers(arg0, arg1);
    }

    @Then("the mult result should be {int}")
    public void themultresultShouldBe(int arg0) {
        this.calculator.mult();
        theResultShouldBe(arg0);
    }


    @When("I div {int} and {int}")
    public void iDivAnd(int arg0, int arg1) {
            enterNumbers(arg0, arg1);
    }

    @Then("the div result should be {int}")
    public void theDivResultShouldBe(int arg0) {
        try{
            this.calculator.div();
            theResultShouldBe(arg0);
        }catch(ArithmeticException e){
            if (Objects.equals(e.getMessage(), "The result is indeterminate or impossible!")){
                theResultShouldBeIndeterminateOrImpossible();
            }
        }

    }

    @Then("the result should be Indeterminate or Impossible")
    public void theResultShouldBeIndeterminateOrImpossible() {

    }
}


