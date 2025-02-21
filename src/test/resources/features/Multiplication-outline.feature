Feature: Multiplying numbers with a calculator

  Background: Start with a calculator
    Given I have a Calculator

  Scenario Outline: Mult two  numbers
    When I mult <arg0> and <arg1>
    Then the mult result should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 1   |
      | 1    | -1   | -1  |
      | -1   | -1   | 1   |
      | 0    | -1   | 0   |