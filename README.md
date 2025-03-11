# Prueba técnica para Nexos

A continuación se consignan los aspectos relevantes de los microservicios que conforman la solución a la prueba técnica.

## Migraciones de bases de datos

Los scrips de bases de datos están almacenados en el directorio `database-migrations`

## Directorio de la aplicación

La aplicación está creada en el directorio `app/cards-nexos-app`

### Primer nivel (Screaming Architecture):

Los directorios reflejan directamente las funcionalidades principales:

+ `card_management/`: Administración de tarjetas.
+ `marketplace/`: Marketplace.
+ `transaction_management/`: Gestión de transacciones.

### Niveles posteriores (Hexagonal Architecture) dentro de cada módulo:

+ `application/`: Casos de uso.
+ `domain/`: Entidades y lógica de negocio.
+ `infrastructure/`: Adaptadores como repositorios, servicios externos.
+ `config/`: Configuración específica del módulo.
+ `api/`: Controladores REST.

### Directorio `shared/`

+ Contiene código común a toda la aplicación: configuración global, seguridad, eventos, excepciones y utilidades.

### Otros directorios:

+ `bootstrap/`: Configuración de arranque y carga inicial de la aplicación.
+ `main_app/`: Punto de entrada de la aplicación (clase Main).
