Feature: Acceso a Slow Resources
  Como usuario interesado
  Quiero ingresar a la opción Slow Resources desde la página principal
  Para visualizar correctamente la funcionalidad ofrecida por el sitio

  Scenario: Ingresar exitosamente a Slow Resources
    Given que Leonardo ingresa a la página principal de The Internet Slow
    When selecciona la opción Slow Resources
    Then debería visualizar la página de Slow Resources
