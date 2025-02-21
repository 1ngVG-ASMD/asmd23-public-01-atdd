Feature: Multiplying numbers with a calculator

  Background: Start with a calculator
    Given I have a Calculator

  Scenario: Mult two positive numbers
    When I mult 1 and 1
    Then the mult result should be 1

  Scenario:  Mult a positive and negative number
    When I mult 1 and -1
    Then the mult result should be -1

  Scenario:  Mult two negative numbers
    When I add -1 and -1
    Then the mult result should be 1