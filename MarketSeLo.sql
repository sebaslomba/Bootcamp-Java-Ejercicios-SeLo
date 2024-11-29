/*TOP CLIENTES CON MAS FACTURAS
SELECT cliente_id, COUNT(*) AS facturas_cantidad 
FROM factura
GROUP BY cliente_id
ORDER BY facturas_cantidad DESC; */

SELECT c.id, c.nombre ||' ' || c.apellido AS cliente, COUNT(f.id) AS cantidad_Facturas
FROM cliente c
INNER JOIN factura f ON c.id  = f.cliente_id
GROUP BY c.id
ORDER BY cantidad_Facturas DESC;

--TOP CLIENTES QUE MAS GASTARON--
SELECT c.id, c.nombre ||' '|| c.apellido as Cliente, SUM(p.precio *df.cantidad) AS monto_gastado
FROM cliente c
INNER JOIN factura f ON c.id = f.cliente_id
INNER JOIN factura_detalle df ON f.id = df.factura_id
INNER JOIN producto p ON df.producto_id = p.id
GROUP BY c.id
ORDER BY monto_gastado DESC;


--TOP MONEDAS MAS UTILIZADAS--
SELECT  m.nombre AS moneda,COUNT(f.moneda_id) as moneda_masutilizada
FROM moneda m
INNER JOIN factura f ON m.id = f.moneda_id
GROUP BY m.nombre
ORDER BY moneda_masutilizada DESC;

--TOP PROVEEDOR DE PRODUCTOS--
SELECT pr.id, pr.nombre AS proveedor, COUNT(p.proveedor_id) AS topProveedor
FROM proveedor pr
INNER JOIN producto p ON pr.id = p.proveedor_id
GROUP BY pr.id
ORDER BY topProveedor DESC;

--Productos mas vendidos--
SELECT p.id, p.nombre AS productos, COUNT(df.cantidad) AS ProducMasVendidos
FROM producto p
INNER JOIN factura_detalle df ON p.id = df.producto_id
GROUP BY p.id
ORDER BY producMasVendidos DESC;

--Productos menos vendidos
SELECT p.id, p.nombre AS productos, COUNT(df.cantidad) AS ProducMasVendidos
FROM producto p
INNER JOIN factura_detalle df ON p.id = df.producto_id
GROUP BY p.id
ORDER BY producMasVendidos ASC;

--Consulta que muestra fecha de emision de factura, nombre y apellido del cliente
SELECT c.nombre ||' '|| c.apellido AS cliente, f.fecha_emision, p.nombre AS producto, df.cantidad, ft.nombre AS factura 
FROM cliente c 
INNER JOIN factura f ON c.id = f.cliente_id
INNER JOIN factura_detalle df ON f.id = df.factura_id
INNER JOIN producto p ON df.producto_id = p.id
INNER JOIN factura_tipo ft ON f.factura_tipo_id = ft.id
WHERE f.id = 97;

--Montos, IVA, productos con IVA
SELECT f.id, SUM(p.precio * df.cantidad) AS TOTALES, SUM((p.precio * df.cantidad)*0.1) AS IVA_del_10
FROM factura f
INNER JOIN factura_detalle df ON f.id = df.factura_id
INNER JOIN producto p ON df.producto_id = p.id
GROUP BY f.id
ORDER BY TOTALES DESC;