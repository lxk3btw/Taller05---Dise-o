# Taller de Patrones Creacionales y UML

## Descripción
Implementación en Java de los patrones de diseño Singleton y Factory Method para un sistema de gestión de productos de una tienda. Este proyecto permite registrar categorías, crear productos físicos y digitales, y administrar el inventario mediante una base de datos centralizada, cumpliendo con principios de diseño orientado a objetos. Proyecto desarrollado para la asignatura Diseño de Software en la Escuela Superior Politécnica del Litoral (ESPOL).

## Integrantes - Grupo 5 (Paralelo 3)
* Belen Llano
* Freddy Sánchez
* Luke Silva

## Estructura del Proyecto

El código está estructurado para reflejar fielmente los diagramas UML diseñados, separando las responsabilidades en dos componentes principales:

### 1. Acceso a Datos (Patrón Singleton)
Garantiza una única instancia activa para la gestión de la conexión a la base de datos, evitando duplicación de recursos y conflictos de acceso.
* `GestorBaseDatos.java`
* `ServicioProducto.java`

### 2. Gestión de Productos (Patrón Factory Method)
Mecanismo que decide dinámicamente el tipo de objeto a construir en tiempo de ejecución, facilitando la extensión del sistema sin modificar el código existente.
* `Producto.java` (Interfaz base)
* `ProductoFisico.java` / `ProductoDigital.java` (Productos concretos)
* `CreadorProducto.java` (Clase creadora base)
* `CreadorProductoFisico.java` / `CreadorProductoDigital.java` (Fábricas concretas)
