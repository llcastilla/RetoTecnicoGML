Feature: Manejo de errores JavaScript en carga
  Como usuario del portal
  Quiero acceder a una página con error de carga JavaScript
  Para validar que la aplicación sigue siendo navegable

  Scenario: Acceder a página con error JavaScript onload
    Given que Leonardo accede a la página JavaScript onload event error
    Then debería visualizar correctamente la página a pesar del error JavaScript
