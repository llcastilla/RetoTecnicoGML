Feature: Get a store order by ID from Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Get order with ID 5
    Given path 'store', 'order', 5
    And header Accept = 'application/json'
    When method get
    Then status 200
    And match response.id == 5
    And match response.petId == 0
    And match response.quantity == 0
    And match response.status == 'placed'
    And match response.complete == true
