Feature: Creación de usuarios en Petstore

  Background:
    * url 'https://petstore.swagger.io'
    * path '/v2/user'
    * header Accept = 'application/json'
    * header Content-Type = 'application/json'

  Scenario: Crear usuario con datos de prueba ficticios
    * def requestBody =
    """
    {
      "id": 1005,
      "username": "qa_user_single_01",
      "firstName": "Carlos",
      "lastName": "Ramirez",
      "email": "carlos.ramirez.test01@correo-fake.com",
      "password": "TestUser#2026",
      "phone": "3017778899",
      "userStatus": 1
    }
    """

    Given request requestBody
    When method POST

    Then status 200
    And match response.code == 200
    And match response.type == 'unknown'
    And match response.message == '#string'
