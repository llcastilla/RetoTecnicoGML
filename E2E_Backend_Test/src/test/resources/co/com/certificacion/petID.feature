Feature: Get a pet by ID from Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Get pet with ID 5
    Given path 'pet', 5
    And header Accept = 'application/json'
    When method get
    Then status 200
    And match response.id == 5


  Scenario Outline: Get pet by ID
    Given path 'pet', <id>
    And header Accept = 'application/json'
    When method get
    Then status 200
    And match response.id == <id>

    Examples:
      | id |
      | 5  |
      | 10 |
      | 15 |
