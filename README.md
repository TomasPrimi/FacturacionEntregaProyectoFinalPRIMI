-Introducción-
Este proyecto es un sistema de ventas desarrollado en Java con Spring Boot, que permite la gestión de clientes, productos y ventas. El proyecto incluye múltiples endpoints para realizar las operaciones CRUD correspondientes, así como la lógica necesaria para calcular el precio total de una venta en base a los productos asociados.

-Cliente-

-POST /clientes/agregar: Agrega un nuevo cliente.
-GET /clientes/buscar/{id}: Busca un cliente por su ID.
-GET /clientes/listar: Lista todos los clientes.
-DELETE /clientes/eliminar/{id}: Elimina un cliente por su ID.

-Producto-

-POST /productos/agregar: Agrega un nuevo producto.
-GET /productos/buscar/{id}: Busca un producto por su ID.
-GET /productos/listar: Lista todos los productos.
-DELETE /productos/eliminar/{id}: Elimina un producto por su ID.

-Venta-

-POST /ventas/agregar: Agrega una nueva venta, calculando automáticamente el precio total basado en los productos.
-GET /ventas/buscar/{id}: Busca una venta por su ID.
-GET /ventas/listar: Lista todas las ventas.
-DELETE /ventas/eliminar/{id}: Elimina una venta por su ID.


-Funcionalidad Destacada-

Cálculo del Precio Total: Al crear una venta, el sistema calcula automáticamente el precio total sumando el precio de cada producto multiplicado por la cantidad correspondiente.

Relaciones entre Entidades: El sistema gestiona correctamente las relaciones entre las entidades Venta, Cliente, Producto y VentaProducto, lo que facilita la gestión y consulta de la información.

-Instrucciones-

Clona el repositorio.

Configura la base de datos en el archivo application.properties.
Usa mvn spring-boot:run para ejecutar la aplicación.
Puedes realizar pruebas de los endpoints utilizando Postman o herramientas similares.

Notas
Asegúrate de probar las relaciones entre productos y ventas para verificar el cálculo del precio total.
Todos los endpoints están documentados aquí para facilitar la evaluación.
