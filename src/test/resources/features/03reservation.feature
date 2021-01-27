Feature: The user should be able to make a reservation on the Otelz.com
@otelz
  Scenario: See the searching results
    Given The user is on the otel's reservation page
    When The user clicks Rezervasyon Yap button
    Then The user should be able to see and click Hemen Rezervasyon Yap button
    Then The user should be able to see information page with their information
    And The user enters phone number
    When The user clicks Kaydet ve Devam et button
    Then The user should be able to choose payment type
    When The user clicks Rezervasyonu Tamamla button
    Then The user should be able to see Thanks page and Rezervasyon Numarasi and PIN kodu
