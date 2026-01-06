Feature: Get store inventory and validate known states

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Get store inventory with API key
    Given path 'store', 'inventory'
    And header Accept = 'application/json'
    And header api_key = '4'
    When method get
    Then status 200

    * match response.available != null
    * match response.pending != null
    * match response.sold != null


    * print 'Full inventory:', response
