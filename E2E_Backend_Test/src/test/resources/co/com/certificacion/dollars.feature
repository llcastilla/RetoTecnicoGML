Feature: Consulta independiente del endpoint /dollars con login incluido

  Background:
    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'


  Scenario: Obtener token y consumir el endpoint /dollars exitosamente
    # Paso 1 - Login como guest

    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def token = response.token
    * print 'Token generado:', token


    # Paso 2 - Llamar al endpoint /dollars con token válido
    Given path '/tardeb/api/v1/dollars'
    And header Authorization = 'Bearer ' + token
    And header Cookie = 'Authorization=Bearer ' + token
    And request {}  # Equivalente a --data '' en cURL
    When method get
    Then status 200
    * print 'Respuesta exitosa del endpoint /dollars:', response
    And match each response ==
    """
    {
        id: '#notnull',
        value: '#notnull',
        createdAt: '#notnull',
        updatedAt: '#notnull'
    }
    """

  Scenario: Consumir el endpoint /dollars con token inválido (error autorización)
    # Usamos un token falso para simular error
    * def invalidToken = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.invalid.token'

    Given path '/tardeb/api/v1/dollars'
    And header Authorization = 'Bearer ' + invalidToken
    And header Cookie = 'Authorization=Bearer ' + invalidToken
    And request {}  # Equivalente a --data '' en cURL
    When method get
    Then status 401
    * print 'Respuesta esperada de error por token inválido:', response
    And match response ==
    """
    {
        message: '#notnull',
        error: '#notnull',
        statusCode: '#notnull'
    }
    """

    And match response.message == 'Microservice error'
    And match response.error == 'Unauthorized'
    And match response.statusCode == 401