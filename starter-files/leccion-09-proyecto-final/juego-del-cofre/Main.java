// Lección 9: Proyecto final - El cofre del tesoro
// El héroe tiene 5 intentos para adivinar el número que abre el cofre.
// Las clases ya están listas. Tú completas el juego en main.

import java.util.Random;
import java.util.Scanner;

class Heroe {
    private String nombre;
    private int intentos;
    private int monedas;

    public Heroe(String nombre, int intentos) {
        this.nombre = nombre;
        this.intentos = intentos;
        this.monedas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getMonedas() {
        return monedas;
    }

    public boolean tieneIntentos() {
        return intentos > 0;
    }

    public void usarIntento() {
        intentos = intentos - 1;
    }

    public void ganarMonedas(int cantidad) {
        if (cantidad > 0) {
            monedas = monedas + cantidad;
        }
    }
}

class Cofre {
    private int numeroSecreto;

    public Cofre(int maximo) {
        Random azar = new Random();
        numeroSecreto = azar.nextInt(maximo) + 1;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public boolean abrir(int numero) {
        return numero == numeroSecreto;
    }

    public String pista(int numero) {
        if (numero < numeroSecreto) {
            return "El número secreto es MAYOR.";
        } else {
            return "El número secreto es MENOR.";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== EL COFRE DEL TESORO ===");

        // PASO 1: Pregunta el nombre del héroe y guárdalo con teclado.nextLine()

        // PASO 2: Crea un Heroe con ese nombre y 5 intentos,
        //         y un Cofre con números del 1 al 20.

        // PASO 3: Crea la variable boolean abierto = false;

        // PASO 4: Escribe un while que se repita mientras el héroe tenga intentos
        //         y el cofre no esté abierto. Dentro:
        //         - pide un número con teclado.nextInt()
        //         - el héroe usa un intento
        //         - si el cofre se abre: abierto = true y el héroe gana monedas
        //         - si no: muestra la pista del cofre

        // PASO 5: Al final, si el cofre está abierto, felicita al héroe y muestra sus monedas.
        //         Si no, muestra cuál era el número secreto.

        teclado.close();
    }
}
