Feature: Update a pet in Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Update an existing pet
    Given path 'pet'
    And header Accept = 'application/json'
    And header Content-Type = 'application/json'
    And request
    """
    {
      "id": 0,
      "category": {
        "id": 0,
        "name": "string"
      },
      "name": "doggie",
      "photoUrls": [
        "string"
      ],
      "tags": [
        {
          "id": 0,
          "name": "string"
        }
      ],
      "status": "available"
    }
    """
    When method put
    Then status 200
    And match response.name == 'doggie'
