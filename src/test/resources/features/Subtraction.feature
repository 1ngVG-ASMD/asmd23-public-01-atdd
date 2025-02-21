Feature: Subtracting numbers with a calculator

  Scenario: Sub two positive numbers
    Given I have a Calculator
    When I sub 1 and 1
    Then the sub result should be 0

  Scenario:  Sub a positive and negative number
    Given I have a Calculator
    When I sub 1 and -1
    Then the sub result should be 2

  Scenario:  Sub two negative numbers
    Given I have a Calculator
    When I sub -1 and -1
    Then the sub result should be 0