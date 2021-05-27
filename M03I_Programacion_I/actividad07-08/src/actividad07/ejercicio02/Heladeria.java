package actividad07.ejercicio02;

import static actividad07.ejercicio02.Utilidades.*;

public class Heladeria {
    static Comida[] pedidos = new Comida[4];
    static int opcion;
    static double precioPedido;

    public static void main(String[] args) {
        pedidos[0] = new Comida("Cacahuetes", 1.5, 99);
        pedidos[1] = new Horchata(1, 30);

        Cucurucho cucurucho1 = new Cucurucho("de galleta", 1, 20, 2);
        cucurucho1.addBolaHelado(0, "vainilla", 1, 30, 15, "azúcar");
        cucurucho1.addBolaHelado(1, "chocolate", 1, 15, 15, "aspartamo");
        pedidos[2] = cucurucho1;

        Cucurucho cucurucho2 = new Cucurucho("de galleta de chocolate", 1.5, 25, 2);
        cucurucho2.addBolaHelado(0, "cookies", 1, 35, 20, "azúcar");
        cucurucho2.addBolaHelado(1, "fresa", 1, 10, 5, "aspartamo");
        pedidos[3] = cucurucho2;

        do {
            precioPedido = 0;
            linea(60);
            System.out.println("Información del pedido:");
            linea(60);

            for (int i = 0; i < pedidos.length; i++) {
                System.out.println(i + 1 + ".- " + pedidos[i].toString());
                precioPedido += pedidos[i].getPrecio();
            }
            linea(60);
            System.out.println("TOTAL PEDIDO: " + String.format("%.2f",precioPedido) + "€");
            linea(60);

            opcion = pideEntero(" Introduzca 0 para salir 1 para modificar pedido: ");
            if (opcion == 1) {
                addHorchata();
                pressEnter("Presiona ENTER");
            }
        } while (opcion != 0);
    }

    static void addHorchata() {
        int pos;
        pos = pideEntero("Elegir elemento a sustituir por horchata: ") - 1;
        if (pos >=0 && pos < pedidos.length ) {
            System.out.println(pos +1+ ".- "+pedidos[pos].getNombre() +
                " se va a eliminar.");
            pedidos[pos] = new Horchata(
                pideEntero("Cantidad de horchatas a añadir: ", 0, 99), 
                pideEntero("Porcentaje de chufa: ", 0, 100)
                );
            System.out.println("Añadido: "+(pos+1)+".- "+pedidos[pos].toString());
        } else {
            System.out.println("No se encuentra ese elemento.");
        }
    }
}
