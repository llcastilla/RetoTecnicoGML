Feature: Create an order in Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Create a new order
    Given path 'store', 'order'
    And header Accept = 'application/json'
    And header Content-Type = 'application/json'
    And request
    """
    {
      "id": 0,
      "petId": 0,
      "quantity": 0,
      "shipDate": "2026-01-06T14:08:18.862Z",
      "status": "placed",
      "complete": true
    }
    """
    When method post
    Then status 200