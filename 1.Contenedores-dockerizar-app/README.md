# Práctica 1. Dockerizar una aplicación

## Explicación práctica
Se ha generado el archivo docker-compose-dev.yml, donde se definen los servicios de las bases de datos y colas rabbitmq. 
Una vez se lanza se genera un dev container para cada servicio. Dentro de cada contenedor se arrancan las aplicaciones.

## Docker compose
En el archivo docker-compose.yml están definidos todos los servicios. Se intenta realizar un arranque desde este fichero en el video docker-compose, pero no funciona de manera correcta. 
Las aplicaciones se encuentran en contenedores docker que están subidos a docker hub.
#
Práctica realizada por Eduardo Larraz Labordeta