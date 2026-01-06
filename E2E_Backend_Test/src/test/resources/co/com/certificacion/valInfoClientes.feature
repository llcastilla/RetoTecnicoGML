Feature: Obtener información de formulario por número de documento

  Background:

    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'

  Scenario: Login como guest y obtener datos del formulario
    # 1. LOGIN GUEST

    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def bearerToken = response.token


    # Validación opcional

    # 2. GET_FORM_DATA_BY_DOCUMENT_NUMBER
    Given path '/tardeb/api/v1/mdm/get_form_data_by_document_number'
    And param type = 'TIPDOC_FS001'
    And param number = '19300900'
    And header Authorization = 'Bearer ' + bearerToken
    And header Cookie = 'Authorization=Bearer ' + bearerToken
    When method get
    Then status 400

