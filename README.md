# Proyecto de Gestión de Pedidos en Spring

Este proyecto se centra en la gestión de pedidos en una aplicación Spring, con un enfoque en las entidades clave y sus relaciones. A continuación, se presenta una descripción general del proyecto.

## Descripción General

Este proyecto de gestión de pedidos en Spring tiene como objetivo proporcionar una base sólida para la administración de pedidos y la gestión de datos relacionados. Las principales entidades en el proyecto son:

- **Usuario**: Representa a los usuarios del sistema con roles definidos.
- **Pedido**: Administra información sobre los pedidos, incluyendo su estado y detalles.
- **Factura**: Registra las facturas generadas a partir de los pedidos.
- **DetallePedido**: Contiene detalles específicos sobre los productos en un pedido.
- **Domicilio**: Almacena información sobre direcciones y localidades.
- **Cliente**: Representa a los clientes que realizan pedidos.
- **Producto**: Contiene información detallada sobre los productos disponibles.
- **Rubro**: Agrupa productos por categoría.

## Relaciones Clave

- Los usuarios pueden crear y gestionar pedidos.
- Cada pedido puede estar asociado a una factura (opcional).
- Los pedidos pueden contener múltiples detalles, cada uno vinculado a un producto.
- Los rubros agrupan varios productos.
- Los clientes pueden realizar múltiples pedidos, cada uno con su propio domicilio de entrega.

## Uso

Este proyecto proporciona una estructura sólida para la gestión de pedidos y se puede personalizar según las necesidades específicas del negocio. Los desarrolladores pueden ampliar y adaptar estas entidades y relaciones para satisfacer los requisitos particulares de su aplicación.

## Ejemplo en H2:

![image](https://github.com/francosantzz/TRABAJO-DB/assets/129998263/9587ed64-c480-4acf-9878-1a29a3116cb0)
