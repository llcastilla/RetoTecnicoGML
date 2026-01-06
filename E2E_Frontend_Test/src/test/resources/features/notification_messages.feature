Feature: Visualización de mensajes de notificación
  Como usuario del portal The Internet
  Quiero interactuar con la funcionalidad Notification Messages
  Para validar que el sistema informa correctamente el resultado de mis acciones

  Scenario: Validar mensaje exitoso de notificación
    Given  ingresamos al portal principal de The Internet
    When accede a la funcionalidad Notification Messages
    And intenta obtener un mensaje de éxito
    Then debería visualizar un mensaje que contenga "Action successful"

  Scenario: Validar mensaje no exitoso de notificación
    Given  ingresamos al portal principal de The Internet
    When accede a la funcionalidad Notification Messages
    And intenta obtener un mensaje de error
    Then debería visualizar un mensaje que contenga "Action unsuccesful"
