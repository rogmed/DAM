(:4. Modifica el precio de un vehículo. :)
(:NOTA: La selección del vehiculo en concreto la vamos a hacer
por la matricula. :)

declare variable $nuevo_precio := 12000;
declare variable $matricula := '3511-BGH';

replace node /vehiculos/vehiculo[matricula=$matricula]/precio
with <precio>{$nuevo_precio}</precio>