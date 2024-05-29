# Proyecto de Gestión de Ventas de Celulares

Este proyecto es una aplicación de gestión de ventas de celulares desarrollada en Java. Utiliza una arquitectura de tres capas y sigue los principios SOLID y algunos patrones de diseño para mantener el código limpio y extensible.

## Estructura del Proyecto

El proyecto está estructurado en tres capas principales:

## Capa de Datos

Contiene las clases que interactúan con la capa de persistencia o el acceso a datos. Las clases en esta capa son responsables de gestionar el inventario de celulares y controlar el acceso a él.

## Capa de Negocio

Contiene las clases que implementan la lógica de negocio de la aplicación. Aquí se gestionan las ventas de celulares y se utilizan diferentes métodos de pago.

## Capa de Presentación

Aunque actualmente vacía, esta capa estaría destinada a contener las clases que gestionan la interfaz de usuario de la aplicación.

## Clases Principales

### InventarioCelulares (`src/datos/InventarioCelulares.java`)

Clase para gestionar el inventario de celulares. Tiene un método para verificar la disponibilidad de un celular en el inventario.

### InventarioProxy (`src/datos/InventarioProxy.java`)

Clase proxy para controlar el acceso al inventario de celulares. Actúa como una capa intermedia entre la capa de negocio y la capa de datos.

### Celular (`src/negocio/Celular.java`)

Clase base para los celulares. Implementa la interfaz `Vendible` y proporciona métodos para obtener el nombre y el precio del celular.

### VentaCelulares (`src/negocio/VentaCelulares.java`)

Clase para gestionar las ventas de celulares. Utiliza un proxy para acceder al inventario de celulares y un método de pago para procesar las transacciones de venta.

## Principios SOLID

### S (Single Responsibility Principle)

Las clases tienen una única responsabilidad bien definida, lo que facilita su mantenimiento y extensión.

### O (Open/Closed Principle)

El código está diseñado para ser extendido con nuevas funcionalidades sin modificar el código existente.

### L (Liskov Substitution Principle)

Las implementaciones son intercambiables sin afectar el comportamiento del sistema.

### I (Interface Segregation Principle)

Las interfaces están diseñadas con un conjunto cohesivo de métodos que las clases que las implementan pueden utilizar de manera significativa.

### D (Dependency Inversion Principle)

El código muestra una inversión de dependencias al utilizar la abstracción sobre la implementación en varios puntos.

## Patrones de Diseño

### Factory Method

El uso de `MetodoPagoFactory` proporciona una manera de encapsular la creación de objetos de método de pago, permitiendo la extensión del sistema para agregar nuevos métodos de pago sin modificar el código existente.

### Proxy

La clase `InventarioProxy` actúa como un proxy para controlar el acceso al inventario de celulares, lo que permite encapsular la lógica de acceso y proteger el inventario subyacente.

### Observer Pattern

El patrón Observer es útil cuando hay objetos que necesitan ser notificados cuando el estado de otro objeto cambia. En este caso, `NotificadorVentas` actúa como el observador que necesita ser notificado cuando se realiza una venta.

## Ejecución del Proyecto

Para ejecutar el proyecto en tu máquina local, sigue estos pasos:

1. Clona el repositorio a tu máquina local utilizando el siguiente comando:
```   
git clone https://github.com/tu-usuario/Modulo_Venta_Celulares.git
```
3. Abre el proyecto en tu entorno de desarrollo Java preferido (por ejemplo, IntelliJ IDEA, Eclipse, etc.).

3. Compila el proyecto y asegúrate de que no hay errores de compilación.

4. Ejecuta la clase `UserUI` en el paquete `presentacion`. Esta clase aún no tiene implementación, pero puedes utilizarla como punto de entrada para futuras implementaciones de la interfaz de usuario.

¡Eso es todo! Ahora deberías poder ejecutar el proyecto en tu máquina local y explorar su funcionalidad.

