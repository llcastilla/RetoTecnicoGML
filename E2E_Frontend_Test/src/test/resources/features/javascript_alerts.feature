Feature: Gestión de alertas JavaScript
  Como usuario del portal The Internet
  Quiero interactuar con las diferentes alertas JavaScript
  Para validar su correcto funcionamiento

  Scenario: Interactuar correctamente con JS Alert, JS Confirm y JS Prompt
    Given que Leonardo accede a la sección JavaScript Alerts
    When interactúa con todos los tipos de alertas JavaScript
    Then debería visualizar los mensajes correspondientes a cada interacción
