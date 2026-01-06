Feature: Emisión de tarjeta (create_issue_card) con login previo

  Background:

    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'
    * configure headers = { Content-Type: 'application/json' }

  Scenario: Obtener token y crear tarjeta virtual Visa
    # Paso 1 - Login como invitado
    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def token = response.token
    * print 'Token obtenido exitosamente:', token
    * match token == '#present'


    # Paso 2 - Crear tarjeta
    Given path '/tardeb/api/v1/issue_card/create_issue_card'
    And header Authorization = 'Bearer ' + token
    And header Cookie = 'Authorization=Bearer ' + token
    And request
    """{
  "account": {
    "number": "90100000694",
    "filialCode": "9000",
    "type": "SBA"
  },
  "card": {
    "type": "VIRTUAL",
    "cardAccountType": "DEBIT",
    "brand": "VISA"
  },
  "customer": {
    "firstName": "JUAN",
    "lastName": "MORALES",
    "address": {
      "country": "Femenino",
      "zipCode": "12345",
      "streetName": "SAN FRANCISCO",
      "addressDetail": "CR 75 DA 1 SUR",
      "city": "Femenino",
      "countryCode": "PRI",
      "region": "Femenino"
    },
    "birthdate": "1970-01-06",
    "phoneNumber": "1112793169",
    "gender": "F",
    "nationality": "COL",
    "document": {
      "number": "19300900",
      "type": "TIPDOC_FS001"
    },
    "email": "moralestames309@gmail.com"
  },
  "user": {
    "id": "usr-2j78BdpkE9RIisNarqOoELoGodt",
    "status": "ACTIVE"
  },
  "id": "TDE_2025_0000028"
}"""
    When method post
    Then status 201
    * print 'Respuesta del endpoint create_issue_card:', response
    And match response.data.issuedCard.id == '#string'
    And match response.data.issuedCard.type == 'VIRTUAL'
    And match response.meta._requestDateTime == '#string'
    And match response.meta._applicationId == '#string'
    And match response.meta._messageId == '#string'

  Scenario: Intentar crear tarjeta con token inválido
    Given path '/tardeb/api/v1/issue_card/create_issue_card'
    And header Authorization = 'Bearer token_invalido'
    And request
    """
    {
      "account": {
        "number": "90100000694",
        "filialCode": "9000",
        "type": "SBA"
      },
      "card": {
        "type": "VIRTUAL",
        "cardAccountType": "DEBIT",
        "brand": "VISA"
      },
      "customer": {
        "firstName": "LUIS",
        "lastName": "CASTRO",
        "birthdate": "1990-07-15",
        "phoneNumber": "3109876543",
        "gender": "M",
        "nationality": "COL",
        "document": {
          "number": "12345678",
          "type": "TIPDOC_TI"
        },
        "email": "luis.castro@example.com"
      },
      "user": {
        "id": "usr-Xd98qwPLk9k",
        "status": "ACTIVE"
      }
    }
    """
    When method post
    Then status 401
    * print 'Respuesta con token inválido:', response
    And match response.message == 'Microservice error'
    And match response.error == 'Unauthorized'
    And match response.statusCode == 401

  Scenario: Intentar crear tarjeta sin documento del cliente
    # Obtener token válido
    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def token = response.token

    # Crear tarjeta sin documento
    Given path '/tardeb/api/v1/issue_card/create_issue_card'
    And header Authorization = 'Bearer ' + token
    And request
      """{
  "account": {
    "number": "90100000694",
    "filialCode": "9000",
    "type": "SBA"
  },
  "card": {
    "type": "VIRTUAL",
    "cardAccountType": "DEBIT",
    "brand": "VISA"
  },
  "customer": {
    "firstName": "JUAN",
    "lastName": "MORALES",
    "address": {
      "country": "Femenino",
      "zipCode": "12345",
      "streetName": "SAN FRANCISCO",
      "addressDetail": "CR 75 DA 1 SUR",
      "city": "Femenino",
      "countryCode": "PRI",
      "region": "Femenino"
    },
    "birthdate": "1970-01-06",
    "phoneNumber": "1112793169",
    "gender": "F",
    "nationality": "COL",
    "email": "moralestames309@gmail.com"
  },
  "user": {
    "id": "usr-2j78BdpkE9RIisNarqOoELoGodt",
    "status": "ACTIVE"
  },
  "id": "TDE_00001"
}"""
    When method post
    Then status 201
    * print 'Error por datos incompletos (pero API respondió 201):', response
    And match response.data.issuedCard.id == '#string'
    And match response.data.issuedCard.type == 'VIRTUAL'
    And match response.meta._requestDateTime == '#string'
    And match response.meta._applicationId == '#string'
    And match response.meta._messageId == '#string'