Feature: Dividing numbers with a calculator

  Background: Start with a Calculator
    Given I have a Calculator

  Scenario Outline: Divide two numbers
    When I div <arg0> and <arg1>
    Then the div result should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 1   |
      | -2   | -1   | 2   |

  Scenario Outline: Indeterminate or Impossible Division
    When I div <arg0> and <arg1>
    Then the result should be Indeterminate or Impossible
    Examples:
      | arg0 | arg1 |
      | 0    | 0    |
      | 1    | 0    |

