// Lección 8: Encapsulación y arrays de objetos
// Ejecuta el código primero: ¡alguien le puso -50 de vida a Luna!
// Vamos a proteger los datos del héroe.

class Heroe {
    // PASO 1: Escribe private delante de cada atributo.
    //         Ejecuta: ¿qué error aparece en main? Bórralo y sigue.
    String nombre;
    int vida;

    Heroe(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
    }

    // PASO 2: Crea los getters getNombre() y getVida().

    // PASO 3: Crea el setter setVida(int vida).
    //         Solo acepta valores entre 0 y 100.
    //         Si es menor que 0, guarda 0. Si es mayor que 100, guarda 100.

    // PASO 4: Cambia recibirGolpe para que use setVida.
    void recibirGolpe(int golpe) {
        vida = vida - golpe;
    }
}

public class Main {
    public static void main(String[] args) {
        Heroe luna = new Heroe("Luna");
        luna.vida = -50;
        System.out.println(luna.nombre + " tiene " + luna.vida + " de vida.");

        // PASO 5: Crea un array de 3 héroes llamado equipo:
        //         Luna, Max y Sol.

        // PASO 6: Recorre el equipo con un for y muestra el nombre y la vida de cada uno.

        // PASO 7: Muestra el nombre del primer héroe en MAYÚSCULAS,
        //         cuántas letras tiene y su primera letra.

        // RETO: Max recibe un golpe de 150. ¿Su vida baja de 0?
    }
}
