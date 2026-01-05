Feature: Visualización de contenido dinámico
  Como usuario del portal The Internet
  Quiero recargar el contenido dinámico
  Para validar que la información cambia correctamente

  Scenario: Validar cambio de contenido dinámico
    Given que el usuario ingresa al portal principal de The Internet
    When accede a la opción Dynamic Content
    And recarga el contenido dinámico
    Then debería visualizar que el contenido dinámico ha cambiado
