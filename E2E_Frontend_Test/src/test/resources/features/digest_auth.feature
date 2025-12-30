Feature: Digest Authentication
  Como usuario
  Quiero acceder a la página con Digest Authentication
  Para validar que las credenciales funcionen correctamente

  Scenario: Acceso exitoso con Digest Authentication
    Given que Leonardo accede a Digest Authentication
    Then debería visualizar la página de acceso exitoso
