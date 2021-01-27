Feature: The user should be able to manage their reservation
@otelz
  Scenario: Go to the Rezervasyonu Yonet page
    Given The user is on reservation details page
    When The user clicks Rezervasyonu Iptal Et button
    Then The user should be able to see cancellation and amount of penalty
    When The user clicks on Kesin Iptal Et button
    Then The user should be able to see the rezervasyonu tamamen iptal et window
    When The user picks a reason to cancellation and clicks on Evet, tum rezervasyonu iptal et button
    Then The user should be able to see reservation is cancelled message



