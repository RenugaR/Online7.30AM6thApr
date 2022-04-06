@P1 @FBUI @Login
Feature: Facebook Page login function

  Background: 
    Given User launch the browser
    And User enters the url

  @TC01 @FBLogin @Regression @Smoke
  Scenario: To validate Fb page login function with invalid credentials
    When User enters the username and password
      | userName | password |
      | Raja     |   123456 |
      | Kathik   |   123456 |
    And User clicks the login button
    Then User navigates to login failure page
    #And User validates the failure page

  @TC02 @FBLogin @Regression @Smoke
  Scenario Outline: To validate Fb page login fucntion with combination of all credentials
    When User enters the "<username>" and "<password>"
    And User clicks the login button
    Then User navigates to login failure page

    Examples: 
      | username | password |
      | Selenium | 67890-   |
      | Welcome  |  2345678 |
      | Java     |   123456 |

  Scenario: To validate Fb page login function with invalid credentials
    When User enters the username and password
    And User clicks the login button
    Then User navigates to login failure page
