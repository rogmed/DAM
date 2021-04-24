import static menu.Muestra.*;
import static menu.Opciones.*;

public class Ejercicio01 {
    public static void main(String[] args) {
        String[] opciones;
        opciones = new String[8];
        opciones[1] = "Nuevo archivo";
        opciones[2] = "Listar archivos";
        opciones[3] = "Muestra un archivo";
        opciones[4] = "Borrar un archivo";
        opciones[5] = "Renombrar un archivo";
        opciones[6] = "Reemplazar un archivo";
        opciones[7] = "Salir";
                            
        int opcion;
        do {
            opcion = muestraMenu(opciones);
    
            switch (opcion){
                case 1:
                    nuevoArchivo();
                    break;
                case 2:
                    listarArchivos();
                    break;
                case 3:
                    muestraArchivo();
                    break;
                case 4:
                    borrarArchivo();
                    break;
                case 5:
                    // renombrarArchivo;
                    break;
                case 6:
                    // reemplazarArchivo;
                    break;
                case 7:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Por favor, elija una opción correcta.");
            }
        } while (opcion!=7);

    }
}
