Feature: Subtracting numbers with a calculator

  Background: Starting with a calculator
    Given I have a Calculator

  Scenario Outline:  Sub two numbers
    When I sub <arg0> and <arg1>
    Then the sub result should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 0   |
      | -1   | -1   | 0   |
      | 1    | -1   | 2   |
