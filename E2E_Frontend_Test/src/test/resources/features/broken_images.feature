Feature: Validación de imágenes rotas
  Como analista de calidad
  Quiero validar si existen imágenes rotas en la sección Broken Images
  Para garantizar la integridad visual del sitio

  Scenario: Validación de imágenes en el portal
    Given que Leonardo analiza la sección de imágenes rotas
    Then debería identificar correctamente las imágenes rotas y válidas
