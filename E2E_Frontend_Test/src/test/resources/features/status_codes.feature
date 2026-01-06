Feature: Validación de Status Codes
  Como usuario interesado
  Quiero verificar todos los códigos de estado disponibles en la página
  Para asegurarme que se visualizan correctamente

  Scenario: Verificar todos los status codes
    Given que Leonardo ingresa a la página principal de The Internet status
    When selecciona la opción Status Codes
    Then verifica todos los status codes disponibles
