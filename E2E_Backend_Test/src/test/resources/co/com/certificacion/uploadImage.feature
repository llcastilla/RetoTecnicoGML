Feature: Upload an image to Petstore

  Background:
    * url 'https://petstore.swagger.io/v2'

  Scenario: Upload an image for a pet
    Given path 'pet', 1313, 'uploadImage'
    And header Accept = 'application/json'
    And multipart field additionalMetadata = 'sdfsdf'
    And multipart file file = { read: 'classpath:data/prueba.png', filename: 'prueba.png', contentType: 'image/png' }
    When method post
    Then status 200
    And match response.code == 200
