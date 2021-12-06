/**
 * Rogelio Medina Medina
 * DAMx_M03IIB - Programacion II 2021/22
 * UF5: POO. Librerias de clases fundamentales
 * Actividad04 Serialización y creación de interfaces de usuario
 */

package actividad04;

public class Main {
    public static void main(String[] args) {    	
		
    	/*  El constructor de Login(String file) acepta un string con la ruta
    	 *  al archivo que contiene el usuario de login serializado. 
    	 *  Por defecto -> username: "user", password: "12345"
    	 */
    	 
    	new Login("datos_login.txt");
    }
}
