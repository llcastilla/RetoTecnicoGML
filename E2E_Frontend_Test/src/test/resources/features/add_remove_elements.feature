Feature: Gestión de elementos dinámicos
  Como usuario
  Quiero añadir y eliminar elementos en la sección Add/Remove Elements
  Para validar el correcto funcionamiento del módulo

  Scenario: Añadir y eliminar un elemento de forma exitosa
    Given que Leonardo abre el portal principal
    When ingresa a la sección Add Remove Elements
    Then agrega y elimina un elemento
