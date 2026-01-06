Feature: Autenticación de usuarios
  Como usuario registrado
  Quiero iniciar sesión en el sistema
  Para acceder de forma segura a las funcionalidades

  Scenario: Autenticación exitosa y cierre de sesión
    Given que Leonardo accede al portal de The Internet
    When inicia sesión con el usuario "tomsmith" y la contraseña "SuperSecretPassword!"
    Then debería autenticarse correctamente y cerrar sesión
