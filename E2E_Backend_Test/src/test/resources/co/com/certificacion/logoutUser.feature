Feature: Cierre de sesión de usuarios en Petstore

  Background:
    * url 'https://petstore.swagger.io'
    * path '/v2/user/logout'
    * header Accept = 'application/json'

  Scenario: Logout exitoso del usuario autenticado
    When method GET

    Then status 200
    And match response.code == 200
    And match response.type == 'unknown'
    And match response.message == 'ok'
