public class Ejercicio02 {

    public static void main(String[] args) {
        int[][] notas_peliculas = {{8, 5, 10, 4}, {3, 8, 9, 7}, {9, 7, 6, 8}};
        int pos1; // Controla posicion en primera dimension
        int pos2; // Controla posicion en segunda dimension
        int pelicula_elegida; // Selecciona pelicula con la que trabajar

        System.out.println("Valores contenidos en el array notas_peliculas:");
        for (pos1 = 0; pos1 < notas_peliculas.length; pos1++) {
            System.out.print("Puntuaciones película " + pos1 + ": ");
            for (pos2 = 0; pos2 < notas_peliculas[pos1].length; pos2++) {
                if (pos2 < (notas_peliculas[pos1].length - 1)) {
                    System.out.print(notas_peliculas[pos1][pos2] + ", ");
                } else {
                    System.out.print(notas_peliculas[pos1][pos2] + ".");
                }
            }
            System.out.println("");
        }

        // 1. TODAS LAS NOTAS DE LA PRIMERA PELÍCULA (notas_peliculas[0])
        pelicula_elegida = 0;

        System.out.print("\nTodas las puntuaciones de la película "+pelicula_elegida+"-> ");
        for (pos2 = 0; pos2 < notas_peliculas[pelicula_elegida].length; pos2++) {
            if (pos2 < (notas_peliculas[pelicula_elegida].length - 1)) {
                System.out.print(notas_peliculas[pelicula_elegida][pos2] + ", ");
            } else {
                System.out.print(notas_peliculas[pelicula_elegida][pos2] + ".");
            }
        }
        System.out.println("");

        // 2. NOTA MEDIA DE LA SEGUNDA PELÍCULA (notas_peliculas[1])
        pelicula_elegida = 1;
        double suma;
        double media;

        suma = 0;
        for (pos2 = 0; pos2 < notas_peliculas[pelicula_elegida].length; pos2++) {
            suma += notas_peliculas[pelicula_elegida][pos2];
        }
        media = suma / notas_peliculas[pelicula_elegida].length;

        System.out.println("\nNota media de la película "+pelicula_elegida+"-> " + media);

        // 3. VALOR MAS ALTO DE LA TERCERA PELICULA (notas_peliculas[2])
        pelicula_elegida = 2;
        int max = notas_peliculas[pelicula_elegida][0];

        for (pos2 = 1; pos2 < notas_peliculas[pelicula_elegida].length; pos2++) {
            if (max < notas_peliculas[pelicula_elegida][pos2]) {
                max = notas_peliculas[pelicula_elegida][pos2];
            }
        }
        System.out.println("\nNota máxima de la película "+pelicula_elegida+"-> " + max);
    }
}
