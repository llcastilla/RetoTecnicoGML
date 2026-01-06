Feature: Captura de teclas presionadas
  Como usuario del portal
  Quiero presionar diferentes teclas
  Para validar que la aplicación las detecta correctamente

  Scenario: Presionar teclas especiales
    Given que Leonardo accede a la sección Key Presses
    When presiona las teclas Tab, Enter y Escape
    Then debería visualizar el resultado de cada tecla presionada
