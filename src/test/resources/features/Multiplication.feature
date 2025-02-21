Feature: Multiplying numbers with a calculator

  Scenario: Mult two positive numbers
    Given I have a Calculator
    When I mult 1 and 1
    Then the mult result should be 1

  Scenario:  Mult a positive and negative number
    Given I have a Calculator
    When I mult 1 and -1
    Then the mult result should be -1

  Scenario:  Mult two negative numbers
    Given I have a Calculator
    When I add -1 and -1
    Then the mult result should be 1