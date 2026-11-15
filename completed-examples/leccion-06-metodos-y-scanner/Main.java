// Lección 6: Métodos, parámetros y entrada con Scanner (ejemplo terminado)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cómo se llama tu héroe? ");
        String nombre = teclado.nextLine();

        System.out.print("¿Cuánta vida tiene? (1 a 100) ");
        int vida = teclado.nextInt();

        mostrarEstado(nombre, vida);

        vida = curar(vida, 20);
        mostrarEstado(nombre, vida);

        teclado.close();
    }

    static void mostrarEstado(String nombre, int vida) {
        System.out.println(nombre + " tiene " + vida + " de vida");
    }

    static int curar(int vida, int cantidad) {
        return vida + cantidad;
    }
}
