Feature: Dividing numbers with a calculator

  Background: Start with a Calculator
    Given I have a Calculator

  Scenario: Div two positive numbers
    When I div 1 and 1
    Then the div result should be 1

  Scenario:  Div a positive and negative number
    When I div 1 and -1
    Then the div result should be -1

  Scenario:  Div two negative numbers
    When I div -2 and -1
    Then the div result should be 2

  Scenario: Div two zeros
    When I div 0 and 0
    Then the result should be Indeterminate or Impossible

  Scenario: Div a number with zero
    When I div 1 and 0
    Then the result should be Indeterminate or Impossible