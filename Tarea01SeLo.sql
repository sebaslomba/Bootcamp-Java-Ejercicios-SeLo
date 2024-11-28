------------ Tipos de articulos
SELECT * FROM tipos_articulos;
SELECT descripcion_tipo FROM tipos_articulos;

------------ Codigo de articulo, Stock y Nombre de sucursal
SELECT * FROM articulos_sucursal;
SELECT articulos_sucursal.codigo_articulo, articulos_sucursal.stock, sucursales.nombre_sucursal  FROM articulos_sucursal
INNER JOIN sucursales ON articulos_sucursal.codigo_sucursal = sucursales.codigo_sucursal;

------------- Mercaderias con Stock 0 de la sucursal 9
SELECT descripcion  AS Mercaderia FROM articulos
INNER JOIN articulos_sucursal ON articulos.codigo_articulo = articulos_sucursal.codigo_articulo
INNER JOIN sucursales ON articulos_sucursal.codigo_sucursal = sucursales.codigo_sucursal
WHERE sucursales.codigo_sucursal = 9 AND articulos_sucursal.stock = 0;

------------- Empleados con apellido MESSI
SELECT nombres, apellidos FROM empleados
WHERE apellidos = 'MESSI';
------------- Lista de todos los clientes exceptuando los de apellido González
SELECT nombre AS clientes FROM clientes
WHERE nombre NOT LIKE 'González';