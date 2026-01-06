Feature: Envío de notificación Puerto Rico con login previo

  Scenario: Envío de notificación exitoso

    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'
    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def token = response.token
    * print 'Token obtenido:', token


    Given path '/tardeb/api/v1/notification/send-notification-puerto-rico'
    And header Authorization = 'Bearer ' + token
    And header Cookie = 'Authorization=Bearer ' + token
    And header Content-Type = 'application/json'
    And request
    """{
  "debitCardId": "TDE_2025_0000029"
  }"""
    When method post
    Then status 201
    * print 'Respuesta exitosa:', response
    And match response.meta ==
    """
    {
        _messageId: '#notnull',
        _requestDateTime: '#notnull',
        _applicationId: '#notnull'
    }
    """

  Scenario: Envío de notificación con documento inválido (error esperado)
    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'
    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def token = response.token
    * print 'Token obtenido:', token

    Given path '/tardeb/api/v1/notification/send-notification-puerto-rico'
    And header Authorization = 'Bearer ' + token
    And header Cookie = 'Authorization=Bearer ' + token
    And header Content-Type = 'application/json'
    And request
    """
    {
      "document": "00000000",  # Documento inexistente o inválido
      "type": "TIPDOC_FS001"
    }
    """
    When method post
    Then status 422
    * print 'Respuesta de error por documento inválido:', response

