Feature: Manejo de múltiples ventanas
  Como usuario del portal
  Quiero abrir una nueva ventana
  Para validar la correcta navegación entre pestañas

  Scenario: Abrir y cambiar entre ventanas
    Given que Leonardo accede a la funcionalidad Multiple Windows
    When abre una nueva ventana
    Then debería visualizar correctamente la nueva ventana
