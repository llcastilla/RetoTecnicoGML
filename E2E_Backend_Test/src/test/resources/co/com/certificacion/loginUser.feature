Feature: Autenticación de usuarios en Petstore

  Background:
    * url 'https://petstore.swagger.io'
    * path '/v2/user/login'
    * header Accept = 'application/json'

  Scenario: Login exitoso con credenciales válidas
    Given param username = 'leocas'
    And param password = '1234565'

    When method GET

    Then status 200
    And match response.code == 200
    And match response.type == 'unknown'
    And match response.message contains 'logged in user session'


