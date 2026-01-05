Feature: Interacción con controles dinámicos
  Como usuario del portal The Internet
  Quiero interactuar con controles dinámicos
  Para validar su correcto comportamiento

  Scenario: Manipular controles dinámicos correctamente
    Given ingresa al portal principal de The Internet
    When accede a la opción Dynamic Controls
    And elimina el checkbox
    And agrega nuevamente el checkbox
    And habilita el campo de texto
    Then debería visualizar que el campo de texto se encuentra deshabilitado
