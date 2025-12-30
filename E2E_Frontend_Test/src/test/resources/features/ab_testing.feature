Feature: Acceso a la funcionalidad A/B Testing
  Como usuario interesado
  Quiero ingresar a la opción A/B Testing disponible en la página principal
  Para visualizar correctamente la funcionalidad ofrecida por el sitio

  Scenario: Ingresar exitosamente a AB Testing desde la página principal
    Given que Leonardo ingresa al portal principal de The Internet
    When selecciona la opción AB Testing
    Then debería visualizar una página relacionada con AB Testing