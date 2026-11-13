// Lección 9: ¡Caza los errores! (ejemplo corregido)

public class Main {
    public static void main(String[] args) {
        // Error 1: faltaba el punto y coma al final
        String nombre = "Luna";
        // Error 2: System va con S mayúscula
        System.out.println("Hola, " + nombre);

        int vida = 100;
        // Error 3: para comparar se usa ==, no =
        if (vida == 100) {
            System.out.println("Vida completa");
        }

        // Error 4: la variable debe declararse con su tipo antes de usarla
        int monedas = 10;
        System.out.println("Monedas: " + monedas);

        String[] mochila = {"espada", "poción", "mapa"};
        // Error 5: los índices empiezan en 0, el último es length - 1
        System.out.println("Último objeto: " + mochila[mochila.length - 1]);
    }
}
