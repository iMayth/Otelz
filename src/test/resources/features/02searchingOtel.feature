Feature: The user should be able to search an otel on Otelz.com
@otelz
  Scenario: Go to the main page of the website
    Given The user is on the main page
    When The user enters the otel's name and clicks Otel Ara button
    Then The user should be able to see the otel's reservation page

