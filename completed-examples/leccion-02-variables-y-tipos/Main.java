// Lección 2: Variables y tipos de datos
// Ejemplo terminado.

public class Main {
    public static void main(String[] args) {
        // PASO 1: El nombre del héroe (texto).
        String nombre = "Aria";

        // PASO 2: Los puntos de vida (número entero).
        int vida = 100;

        // PASO 3: Las monedas (número entero).
        int monedas = 25;

        // PASO 4: La velocidad (número con decimales).
        double velocidad = 1.5;

        // PASO 5: ¿Tiene escudo? (verdadero o falso).
        boolean tieneEscudo = true;

        // PASO 6: Muestra los datos del héroe.
        System.out.println("=== FICHA DEL HEROE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Monedas: " + monedas);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Tiene escudo: " + tieneEscudo);
    }
}
