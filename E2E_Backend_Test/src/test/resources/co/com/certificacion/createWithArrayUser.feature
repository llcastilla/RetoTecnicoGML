Feature: Creación de usuarios con arreglo en Petstore

  Background:
    * url 'https://petstore.swagger.io'
    * path '/v2/user/createWithArray'
    * header Accept = 'application/json'
    * header Content-Type = 'application/json'

  Scenario: Crear usuario con datos de prueba ficticios
    * def requestBody =
    """
    [
      {
        "id": 1001,
        "username": "qa_user_test01",
        "firstName": "Leonardo",
        "lastName": "Castilla",
        "email": "leonardo.castilla.test01@correo-fake.com",
        "password": "P@ssw0rdTest01",
        "phone": "3005558899",
        "userStatus": 1
      }
    ]
    """

    Given request requestBody
    When method POST

    Then status 200
    And match response.code == 200
    And match response.type == 'unknown'
    And match response.message == 'ok'
