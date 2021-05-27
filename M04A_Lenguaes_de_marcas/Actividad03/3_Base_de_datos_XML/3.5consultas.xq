(: 5. Elimina un vehículo del XML. :)

(:NOTA: Borrado de vehiculos segun matricula. En este caso
se borran los que se añaden con la consulta 3.3.
Cambiar variable $matricula para borrar otros. :)

declare variable $matricula := '6341-FMM';

delete node /vehiculos/vehiculo[matricula=$matricula]