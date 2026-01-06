Feature: Validación de JQuery UI Menus

  Como usuario del portal
  Quiero interactuar con el menú JQuery UI
  Para validar su comportamiento y opciones disponibles

  Scenario: Validar opciones y descargar archivos
    Given que Leonardo ingresa a la sección JQuery UI Menus
    When valida el estado de las opciones del menú
    Then descarga los archivos disponibles en el menú
