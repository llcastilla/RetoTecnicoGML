Feature: Carga de archivos en The Internet
  Como usuario del portal
  Quiero cargar un archivo desde la opción File Upload
  Para confirmar que el sistema procesa correctamente la carga

  Scenario: Cargar archivo exitosamente
    Given que se accede al portal principal de The Internet
    When carga un archivo desde la opción File Upload
    Then debería visualizar el mensaje de carga exitosa
