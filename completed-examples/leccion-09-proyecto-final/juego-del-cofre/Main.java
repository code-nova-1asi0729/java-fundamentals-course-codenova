// Lección 9: Proyecto final - El cofre del tesoro (ejemplo terminado)
// El héroe tiene 5 intentos para adivinar el número que abre el cofre.

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

        mostrarTitulo();
        System.out.print("¿Cómo se llama tu héroe? ");
        String nombre = teclado.nextLine();

        Heroe heroe = new Heroe(nombre, 5);
        Cofre cofre = new Cofre(20);
        boolean abierto = false;

        while (heroe.tieneIntentos() && !abierto) {
            System.out.print("Intentos: " + heroe.getIntentos() + " | Elige un número del 1 al 20: ");
            int numero = teclado.nextInt();
            heroe.usarIntento();

            if (cofre.abrir(numero)) {
                abierto = true;
                heroe.ganarMonedas(10 + heroe.getIntentos() * 10);
            } else {
                System.out.println(cofre.pista(numero));
            }
        }

        mostrarResultado(heroe, cofre, abierto);
        teclado.close();
    }

    static void mostrarTitulo() {
        System.out.println("==============================");
        System.out.println("     EL COFRE DEL TESORO");
        System.out.println("==============================");
    }

    static void mostrarResultado(Heroe heroe, Cofre cofre, boolean abierto) {
        if (abierto) {
            System.out.println("¡" + heroe.getNombre() + " abrió el cofre y ganó " + heroe.getMonedas() + " monedas!");
        } else {
            System.out.println("¡Oh no! El número era " + cofre.getNumeroSecreto() + ". ¡Inténtalo otra vez!");
        }
    }
}
