Feature: Carga dinámica de elementos
  Como usuario del portal The Internet
  Quiero interactuar con elementos de carga dinámica
  Para validar que se muestran correctamente al finalizar el proceso

  Scenario: Validar carga dinámica de elementos ocultos y renderizados
    Given que se ingresa al portal principal de The Internet
    When accede a la opción Dynamic Loading
    And ejecuta el ejemplo de carga dinámica tipo oculto
    And regresa a la pantalla de Dynamic Loading
    And ejecuta el ejemplo de carga dinámica renderizada
    Then debería visualizar el mensaje "Hello World!" en ambos casos
