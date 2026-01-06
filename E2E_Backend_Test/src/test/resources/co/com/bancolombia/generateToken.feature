Feature: Login guest en API de tarjeta débito PR-DEV

  Background:

    * url 'https://api.tarjeta-debito-pr-dev.apps.ambientesbc.com'
    * def token = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiI2ZGY2MmNkZC03ZGEyLTQzOTctYjkzMy0yMzg4OTcwZTVmYjAiLCJpc3MiOiIwNDMyN2MzYy1kMGE4LTRmOTctOTNkZi1mOTY2YWNiNzU3NjUiLCJzdWIiOiIzOTE2OWJmYy1mZWVlLTQ5OTYtOTU5OS1mODIzNzY0MTdjNTAiLCJqdGkiOiIzNWE1YzUxZS01MjQyLTQyMWYtYTc3NC00ZmY2ZGVhYmE4YzQiLCJyb2xlcyI6WyJndWVzdCJdLCJpYXQiOjE3NDk0ODUwNTYsImV4cCI6MTc0OTQ4ODY1Nn0.MOVx28uzAK6sFUIFU4v8CY5kq04kSKo5-K2d_0jE5O0'

    * header Authorization = 'Bearer ' + token
    * header Cookie = 'Authorization=Bearer ' + token

  Scenario: Login como guest exitoso
    Given path '/tardeb/api/v1/auth/login_guest'
    When method post
    Then status 201
    * print 'Login guest exitoso, token obtenido:', response.token


  Scenario: Login como guest con error por datos inválidos
    Given path '/tardeb/api/v1/auth/login_guest'
    And request { "invalidField": "invalidValue" }   # Suponiendo que enviar body no esperado genera error
    When method post
    Then status 201
    * print 'Respuesta error login guest:', response
