Feature: Update pet using form data in Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Update pet name and status using form data
    Given path 'pet', 4
    And header Accept = 'application/json'
    And header Content-Type = 'application/x-www-form-urlencoded'
    And form field name = 'prueba'
    And form field status = 'sold'
    When method post
    Then status 200
    And match response.code == 200
    And match response.message == '4'
