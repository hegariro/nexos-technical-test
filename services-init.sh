#!/bin/bash

docker compose down -v
docker-compose up --build -d

#sleep 5

# se ejecuta el script que crea las tablas
# use la siguiente línea para ejecutar el script de creación de las tablas
#docker exec -i mariadb_container mariadb -u root -p'rootpasswordnexos' card_db_nexos < ./database-migrations/create-database.sql

# se ingresa a la maquina virtual para revisar la base de datos
# usar la siguiente línea para acceder al contenedor de la base de datos
#docker exec -it mariadb_container mariadb -u root -prootpasswordnexos card_db_nexos

