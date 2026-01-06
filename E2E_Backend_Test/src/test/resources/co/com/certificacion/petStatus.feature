Feature: Get pets by status from Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario Outline: Get pets with different statuses
    Given path 'pet', 'findByStatus'
    And param status = '<status>'
    And header Accept = 'application/json'
    When method get
    Then status 200
    And match response != null

    Examples:
      | status    |
      | available |
      | pending   |
      | sold      |
