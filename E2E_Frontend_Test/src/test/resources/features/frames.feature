Feature: Interacción con Frames
  Como usuario del portal
  Quiero acceder a contenido embebido en iframes
  Para poder interactuar correctamente con editores externos

  Scenario: Acceso exitoso al editor dentro de un iFrame
    Given que Leonardo accede al portal principal
    When navega hasta el editor dentro de Frames
    Then debería visualizar correctamente el editor embebido
