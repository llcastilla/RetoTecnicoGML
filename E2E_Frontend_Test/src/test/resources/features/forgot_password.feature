Feature: Recuperación de contraseña
  Como usuario del portal
  Quiero solicitar la recuperación de mi contraseña
  Para restablecer el acceso a mi cuenta

  Scenario: Solicitar recuperación de contraseña exitosamente
    Given que se encuentra en el portal principal de The Internet
    When solicita la recuperación de contraseña con el correo "test@gmail.com"
    Then el sistema debería procesar la solicitud de recuperación
