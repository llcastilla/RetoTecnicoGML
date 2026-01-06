Feature: Registro independiente de tarjeta débito con login previo

  Scenario: Crear tarjeta débito usando el endpoint /debit-cards

    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'

  # Paso 1 - Login para obtener token
    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * def token = response.token
    * print 'Token generado:', token


  # Paso 2 - Llamada al endpoint /debit-cards
    Given path '/tardeb/api/v1/debit-cards'
    And header x-recaptcha-token = 'zczzxzc'
    And header x-recaptcha-action = 'login'
    And header Authorization = 'Bearer ' + token
    And header Cookie = 'Authorization=Bearer ' + token
    And header Content-Type = 'application/json'
    And request
    """
    {
      "filial": "9000",
      "requestType": "TDE",
      "validationId": "",
      "name": "JUAN PABLO",
      "lastName": "MORALES TAMES",
      "email": "moralestames309@gmail.com",
      "phone": "1112793169",
      "documentNumber": "1112793169",
      "documentType": "Cédula de ciudadanía",
      "accountType": "90100000694",
      "code": "",
      "countryBirth": "Femenino",
      "cityBirth": "Femenino",
      "dateBirth": "1970-01-06",
      "nationality": "Femenino",
      "fileUpload": "",
      "document_issuance_date": "",
      "document_issuance_location": "",
      "marital_status": "",
      "pep": "",
      "family_pep": "",
      "international_organization_member": "",
      "pep_relationship_type": "",
      "government_relationship": "",
      "supervised_professional_activity": "",
      "provides_domicile_buys_sells_property": "",
      "manages_bank_accounts": "",
      "acts_as_proxy": "",
      "advises_company_creation": "",
      "advises_legal_structures": "",
      "country_residence": "",
      "departament_residence": "",
      "city_residence": "",
      "address_residence": "",
      "phone_residence": "",
      "usa_residence": "",
      "ssn_or_itin": "",
      "ocupation": "",
      "origin_main_income": "",
      "total_monthly_primary_income": "",
      "total_monthly_secondary_income": "",
      "secondary_income_source": "",
      "monthly_expenses": "",
      "origin_heritage_wealth": "",
      "origin_heritage_wealth_other": "",
      "total_value_assets": "",
      "total_value_liabilities": "",
      "derived_income": "",
      "companyName": "",
      "companyPhone": "",
      "extensionCompanyPhone": "",
      "profession": "",
      "jobEmail": "",
      "jobCountry": "",
      "jobDepartament": "",
      "jobCity": "",
      "jobAddress": "",
      "code_ciuu": "",
      "economicActivity": "",
      "firstNameReference": "",
      "secondNameReference": "",
      "firstLastNameReference": "",
      "secondLastNameReference": "",
      "documentTypeReference": "",
      "documentNumberReference": "",
      "relationshipReference": "",
      "countryReference": "",
      "departamentReference": "",
      "cityReference": "",
      "phoneReference": "",
      "emailReference": ""
    }
    """
    When method post
    Then status 201
    * print 'Respuesta del endpoint /debit-cards:', response

