(:1. Muestra todos los vehículos que tienen un precio mayor a 10.000€ y muestra el nombre y la marca. :)

for $vehiculo in /vehiculos/vehiculo

where $vehiculo/precio>10000

return <li>{$vehiculo/marca/text()}&#160;{$vehiculo/modelo/text()}</li>