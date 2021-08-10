--Gerardo Morales Gomez

1. Generar script para poblar todas las tablas.

INSERT INTO productos (producto, nombre, precio)
VALUES (1, "LAP TOP HP", 2000);
INSERT INTO productos (producto, nombre, precio)
VALUES (2, "LAP TOP ACER", 3944);
INSERT INTO productos (producto, nombre, precio)
VALUES (3, "LAP TOP DELL", 7653);
INSERT INTO productos (producto, nombre, precio)
VALUES (4, "LAP TOP APPLE", 20000);
INSERT INTO productos (producto, nombre, precio)
VALUES (5, "LAP TOP LENOVO", 7653);

INSERT INTO cajeros (cajero, nomapels)
VALUES (1, "pedro");
INSERT INTO cajeros (cajero, nomapels)
VALUES (2, "mario");
INSERT INTO cajeros (cajero, nomapels)
VALUES (3, "CARLOS");

INSERT INTO maquinas-registradoras (maquina, piso)
VALUES (1, 1);
INSERT INTO maquinas-registradoras (maquina, piso)
VALUES (2, 1);
INSERT INTO maquinas-registradoras (maquina, piso)
VALUES (3, 2);

INSERT INTO venta (cajero, maquina, producto)
VALUES (1, 2, 5);
INSERT INTO venta (cajero, maquina, producto)
VALUES (2, 3, 5);
INSERT INTO venta (cajero, maquina, producto)
VALUES (2, 3, 2);
INSERT INTO venta (cajero, maquina, producto)
VALUES (1, 1, 2);
INSERT INTO venta (cajero, maquina, producto)
VALUES (1, 2, 3);
INSERT INTO venta (cajero, maquina, producto)
VALUES (2, 2, 3);
INSERT INTO venta (cajero, maquina, producto)
VALUES (3, 2, 4);
INSERT INTO venta (cajero, maquina, producto)
VALUES (1, 2, 4);
INSERT INTO venta (cajero, maquina, producto)
VALUES (2, 2, 2);

    2. Mostrar el número de ventas de cada producto, ordenado de más a menos ventas.

Select p.producto,p.nombre,
count(v.producto) as num_ventas
from productos as p inner join 
venta as v on p.producto = v.producto
group by p.nombre
order by count(v.producto) desc

    3. Obtener un informe completo de ventas, indicando el nombre del cajero que realizo la venta, nombre y precios de los productos vendidos, y el piso en el que se encuentra la máquina registradora donde se realizó la venta.
select 
c.nomapels, p.nombre,p.precio,ma.piso
from
cajeros as c inner join
venta as v on c.cajero = v.cajero
inner join maquinas_registradoras as ma
on v.maquina = ma.maquina inner join producto as p on
v.producto = p.producto

    4. Obtener las ventas totales realizadas en cada piso.

select ma.piso, count(v.producto)
from maquinas_registradoras as ma inner join 
venta as v on ma.maquina = v.maquina
GROUP BY ma.piso
ORDER BY ma.piso asc


    5. Obtener el código y nombre de cada cajero junto con el importe total de sus ventas.

select 
c.cajero, c.nomapels, sum(p.precio) as monto
from cajeros as c inner join  ventas as v 
on c.cajero = v.cajero inner join producto as  p 
v.producto = p.producto
group by c.cajero, c.nomapels


    6. Obtener el código y nombre de aquellos cajeros que hayan realizado ventas en pisos cuyas ventas totales sean inferiores a los 5000 pesos.

select 
c.cajero, c.nomapels
from cajeros as c inner join as ventas as v 
on c.cajero = v.cajero
where v.maquina in (select ma.maquina from maquinas_registradoras as ma inner join ventas as v 
ma.maquina = v.mauina inner join producto as p on v.producto = p.producto 
group by ma.piso having sum(p.precio) < 5000)
