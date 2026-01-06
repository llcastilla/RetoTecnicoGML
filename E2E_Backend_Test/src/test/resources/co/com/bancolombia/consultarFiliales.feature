Feature: Flujo completo autenticado usando login_guest y token Bearer

  Background:
    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'


  Scenario: Obtener token como guest y consumir dos servicios protegidos

    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def bearerToken = response.token
    * print 'Token JWT:', bearerToken


    Given path '/tardeb/api/v1/segments'
    And header Authorization = 'Bearer ' + bearerToken
    And header Cookie = 'Authorization=Bearer ' + bearerToken
    When method get
    Then status 200
    * print 'Respuesta del endpoint /segments:', response

    # Validar estructura general
    And match response.totalRecords == '#number'

    # Validar estructura y que no haya valores nulos
    And match each response.segments ==
    """
    {
        id: '#notnull',
        name: '#notnull',
        code: '#notnull',
        createdAt: '#notnull',
        updatedAt: '#notnull'
    }
    """

