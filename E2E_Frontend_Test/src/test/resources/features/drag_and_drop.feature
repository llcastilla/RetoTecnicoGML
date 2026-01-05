Feature: Funcionalidad Drag and Drop
  Como usuario del portal The Internet
  Quiero interactuar con la funcionalidad Drag and Drop
  Para validar que los elementos se intercambian correctamente

  Scenario: Intercambiar columnas mediante Drag and Drop
    Given que Leonardo ingresa al portal principal de The Internet de forma exitosa
    When accede a la opción Drag and Drop
    And intercambia la columna A con la columna B
    Then debería visualizar que las columnas fueron intercambiadas correctamente
