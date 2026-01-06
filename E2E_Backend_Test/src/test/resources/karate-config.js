function fn() {
  var env = karate.env || 'pr-dev'; // Cambia el entorno por defecto a 'pr-dev' o lo que prefieras

  var config = {
    urlBase: 'https://petstore.swagger.io/v2/',
    authEndpoint: '/tardeb/api/v1/auth/login_guest',

    // Headers base que usarás en todas las peticiones
    headers: {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
    },

    // Usuarios para posibles tests futuros, aunque aquí solo login guest es necesario




  };

  // Configuraciones generales
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  karate.configure('ssl', true);

  // Función para setear el token de autenticación y actualizar headers
  config.setToken = function(token) {
    config.accessToken = token;
    config.headers['Authorization'] = 'Bearer ' + token;
    config.headers['Cookie'] = 'Authorization=Bearer ' + token;
  };

  // Opción: obtener token guest directo desde aquí para tests automáticos
  // Se puede invocar desde los features con: karate.callSingle('classpath:getGuestToken.feature')
  // Si quieres automatizar aquí mismo, puedes hacer algo así (no recomendable por async):
  /*
  var result = karate.call('classpath:getGuestToken.feature');
  config.setToken(result.token);
  */

  return config;
}
