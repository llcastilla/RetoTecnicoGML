Feature: Menú flotante en The Internet
  Como usuario del portal
  Quiero desplazarme por la página
  Para verificar que el menú de navegación permanece visible

  Scenario: Validar menú flotante al hacer scroll
    Given se ingresa al portal principal de The Internet
    When navega a Floating Menu y realiza scroll en la página
    Then el menú debería permanecer flotante
