Feature: Create multiple users in Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Create a list of users
    Given path 'user', 'createWithList'
    And header Accept = 'application/json'
    And header Content-Type = 'application/json'
    And request
    """
    [
      {
        "id": 0,
        "username": "leocas",
        "firstName": "leonardo ",
        "lastName": "castila ",
        "email": "prueba@mail.com",
        "password": "Leo401544ss",
        "phone": "3045766592",
        "userStatus": 0
      }
    ]
    """
    When method post
    Then status 200
    And match response.code == 200
    And match response.message == 'ok'
