Feature: Signin Into the Dashboard

  #@smoke
  Scenario Outline: Signin should be success
    Given User navigates to the CST Dashboard
    And User enters the valid Email id "<Email>"
    And User enters the valid Password "<Password>"
    When User clicks on the signin button
    Then User entering into the dashboard

    Examples: 
      | Email               | Password  |
      | csttool@yopmail.com | Suraj@123 |
#			| csttool@yopmail.com | Suraj@1231 |
      