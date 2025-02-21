Feature: Subtracting numbers with a calculator

  Background: Starting with a calculator
    Given I have a Calculator

  Scenario: Sub two positive numbers
    When I sub 1 and 1
    Then the sub result should be 0

  Scenario:  Sub a positive and negative number
    When I sub 1 and -1
    Then the sub result should be 2

  Scenario:  Sub two negative numbers
    When I sub -1 and -1
    Then the sub result should be 0