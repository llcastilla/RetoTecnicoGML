Feature: Delete a pet from Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Delete pet with ID 44
    Given path 'pet', 44
    And header Accept = 'application/json'
    When method delete
    Then status 404
