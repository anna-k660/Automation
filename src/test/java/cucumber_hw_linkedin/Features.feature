Feature: Login Functionality Feature


  Scenario: Login Functionality with incorrect email


    Given Open the GoogleChrome and navigate to https://www.linkedin.com


    When Enter the incorrect Email and Password
    And Press button "Sing in"


    Then SingIn page should be open
