Feature: Update a user by username in Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Update user 'string'
    Given path 'user', 'string'
    And header Accept = 'application/json'
    And header Content-Type = 'application/json'
    And request
    """
    {
      "id": 0,
      "username": "string",
      "firstName": "string",
      "lastName": "string",
      "email": "string",
      "password": "string",
      "phone": "string",
      "userStatus": 0
    }
    """
    When method put
    Then status 200
    And match response.code == 200
    And match response.message != null
    * print 'Updated user ID:', response.message
