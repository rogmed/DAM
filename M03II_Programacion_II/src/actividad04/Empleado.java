package actividad04;

import java.io.Serializable;
import java.util.ArrayList;

public class Empleado implements Serializable {
	
	String 	nombre,
			edad,
			sexo;
	ArrayList<String> aficiones;
	
	public Empleado(String nombre, String edad, String sexo, ArrayList<String> aficiones) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.aficiones = aficiones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList<String> getAficiones() {
		return aficiones;
	}

	public void setAficiones(ArrayList<String> aficiones) {
		this.aficiones = aficiones;
	}
	
	public String toString() {
		String strAficiones = "";
		for (String aficion:getAficiones()) {
			strAficiones += (strAficiones.isEmpty())?aficion: ", "+aficion.toLowerCase();
		}
		return "Nombre: "+getNombre()+" - Edad: "+getEdad()+" - Sexo: "+getSexo()+" - Aficiones: "+strAficiones;
	}
}
