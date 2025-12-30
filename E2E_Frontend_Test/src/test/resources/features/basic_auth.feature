Feature: Autenticación Básica en el portal
  Como usuario autenticado
  Quiero acceder a la página de Basic Auth
  Para validar que las credenciales funcionen correctamente

  Scenario: Acceso exitoso con usuario y contraseña válidos
    Given que Leonardo accede a la página con autenticación básica
    Then el sistema debería permitir el acceso correctamente
