# Ejem2MicroserviciosSpringCloud
Utilizando una arquitectura Spring Cloud se han creado dos microservicios donde uno de ellos consume del otro

Estre proyecto está formado por 3 aplicaciones spring-boot:

-**SpringCloudServidorEureka** Es la aplicación que hay que arrancar en primer lugar. Es nuestro servidor de registro de microservicios.
-**MicroservicioProductor** Es un microservicio que se comporta como un servicio rest con las operaciones de CRUD sobre una base de datos MongoDB.
-**MicroservicioConsumidor** Es un microservicio que se realiza llamadas al microservicioProductor para pintar pon pantalla a través de jsp los resultados de las mismas.
