Feature: Visualización correcta de frames anidados
  Como usuario del portal The Internet
  Quiero navegar entre los diferentes frames de la página Nested Frames
  Para validar que el contenido se visualiza correctamente en cada sección

  Scenario: Validar contenido en todos los frames anidados
    Given se entra portal principal de The Internet
    When accede a la funcionalidad Nested Frames
    And navega al frame izquierdo
    Then debería visualizar el texto "LEFT" en el frame

    When navega al frame central
    Then debería visualizar el texto "MIDDLE" en el frame

    When navega al frame derecho
    Then debería visualizar el texto "RIGHT" en el frame

    When navega al frame inferior
    Then debería visualizar el texto "BOTTOM" en el frame
