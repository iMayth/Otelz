Feature: User should be able to log in Otelz.com successfully
  @e2e
  Scenario: Go to the main page of the website
    Given The user is on the main page
    When The user clicks Giris Yap button
    Then The user should be able to see login pop up
    And The user enters email and password and clicks Giris
    Then The user should be able to see the main page with their name