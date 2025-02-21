Feature: Dividing numbers with a calculator

  Scenario: Div two positive numbers
    Given I have a Calculator
    When I div 1 and 1
    Then the div result should be 1

  Scenario:  Div a positive and negative number
    Given I have a Calculator
    When I div 1 and -1
    Then the div result should be -1

  Scenario:  Div two negative numbers
    Given I have a Calculator
    When I div -2 and -1
    Then the div result should be 2

  Scenario: Div two zeros
    Given I have a Calculator
    When I div 0 and 0
    Then the result should be Indeterminate or Impossible

  Scenario: Div a number with zero
    Given I have a Calculator
    When I div 1 and 0
    Then the result should be Indeterminate or Impossible