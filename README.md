# Primavera

Este proyecto usa una BD MySQL para iniciarla con docker puede ejecutar el siguiente comando

~~~sh
docker run --rm --name mysql -e MYSQL_ROOT_PASSWORD=12345678 -e MYSQL_DATABASE=ejemplo01  -p 3306:3306 -d mysql
~~~
