(:2. Muestra todos los vehículos de tipo moto con todos sus datos, en una tabla HTML.:)

for $vehiculo in /vehiculos/vehiculo

where $vehiculo/tipo="Moto"

return
<tr>
  <td>{$vehiculo/marca/text()}</td>
  <td>{$vehiculo/modelo/text()}</td>
  <td>{$vehiculo/matricula/text()}</td>
  <td>{$vehiculo/color/text()}</td>
  <td>{$vehiculo/tipo/text()}</td>
  <td>{$vehiculo/puertas/text()}</td>
</tr>