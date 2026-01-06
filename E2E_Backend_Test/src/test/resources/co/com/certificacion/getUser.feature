Feature: Get a user by username from Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Get user with username 'leocas'
    Given path 'user', 'leocas'
    And header Accept = 'application/json'
    When method get
    Then status 200
    And match response.username == 'leocas'
    And match response.firstName == 'leonardo '
    And match response.lastName == 'castila '
    And match response.email == 'prueba@mail.com'
    And match response.password == 'Leo401544ss'
    And match response.phone == '3045766592'
    And match response.userStatus == 0
