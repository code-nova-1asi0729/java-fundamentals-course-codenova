// Lección 7: Clases y objetos (ejemplo terminado)

class Heroe {
    // Atributos: lo que el héroe TIENE
    String nombre;
    int vida;
    int monedas;

    // Constructor: se ejecuta al crear el héroe con new
    Heroe(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.monedas = 0;
    }

    // Métodos: lo que el héroe HACE
    void presentarse() {
        System.out.println("Soy " + nombre + " y tengo " + vida + " de vida.");
    }

    void recibirGolpe(int golpe) {
        vida = vida - golpe;
        System.out.println(nombre + " recibió un golpe de " + golpe + ".");
    }

    void ganarMonedas(int cantidad) {
        monedas = monedas + cantidad;
        System.out.println(nombre + " ahora tiene " + monedas + " monedas.");
    }
}

public class Main {
    public static void main(String[] args) {
        Heroe luna = new Heroe("Luna");
        Heroe max = new Heroe("Max");

        luna.presentarse();
        max.presentarse();

        luna.recibirGolpe(30);
        luna.presentarse();
        max.presentarse();

        max.ganarMonedas(15);
    }
}
