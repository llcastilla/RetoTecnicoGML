Feature: Validación de redirecciones por código HTTP
  Como usuario del portal The Internet
  Quiero acceder a la funcionalidad Redirect Link
  Para validar que el sistema muestra el mensaje correcto según el código de respuesta

  Scenario Outline: Validar mensaje según código de redirección
    Given que Leonardo esta ingresando al portal principal de The Internet
    When accede a la funcionalidad Redirect Link
    And selecciona la redirección con código "<codigo>"
    Then debería visualizar un mensaje que tiene "<mensaje>"

    Examples:
      | codigo | mensaje                                      |
      | 200    | This page returned a 200 status code.        |
      | 301    | This page returned a 301 status code.        |
      | 404    | This page returned a 404 status code.        |
      | 500    | This page returned a 500 status code.        |
