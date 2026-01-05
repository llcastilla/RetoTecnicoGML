Feature: Selección de opciones en Dropdown
  Como usuario del portal The Internet
  Quiero seleccionar opciones desde un dropdown
  Para validar su correcto funcionamiento

  Scenario: Seleccionar opciones del dropdown
    Given que ingresa al portal principal de The Internet
    When accede a la opción Dropdown
    And selecciona la opción "Option 1"
    And selecciona la opción "Option 2"
    Then debería visualizar que la opción "Option 2" quedó seleccionada
