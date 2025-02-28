import io.cucumber.scala.{EN, PendingException, ScalaDsl}

class StepDefinitions extends ScalaDsl with EN {

  Given("""I have a Calculator""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }
}