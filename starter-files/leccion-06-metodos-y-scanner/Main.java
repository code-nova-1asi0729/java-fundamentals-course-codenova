// Lección 6: Métodos, parámetros y entrada con Scanner
// Vamos a ordenar el código en métodos y a pedirle datos al jugador.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // PASO 1: Pregunta "¿Cómo se llama tu héroe?" y guarda la respuesta
        //         en String nombre con teclado.nextLine()

        // PASO 2: Pregunta "¿Cuánta vida tiene? (1 a 100)" y guárdala
        //         en int vida con teclado.nextInt()

        // PASO 4: Llama a mostrarEstado(nombre, vida)

        // PASO 6: Cura al héroe con vida = curar(vida, 20); y vuelve a mostrar su estado

        teclado.close();
    }

    // PASO 3: Crea el método static void mostrarEstado(String nombre, int vida)
    //         que muestre "<nombre> tiene <vida> de vida"

    // PASO 5: Crea el método static int curar(int vida, int cantidad)
    //         que devuelva vida + cantidad con return
}
