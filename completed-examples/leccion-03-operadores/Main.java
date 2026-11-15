// Lección 3: Operadores y expresiones
// Ejemplo terminado.

public class Main {
    public static void main(String[] args) {
        // Datos del héroe
        int vida = 100;
        int monedas = 25;
        int danoGolpe = 30;
        int precioEspada = 40;

        // PASO 1: El héroe recibe un golpe.
        vida = vida - danoGolpe;

        // PASO 2: El héroe encuentra un cofre.
        monedas += 20;

        // PASO 3: ¿Le alcanza para la espada?
        boolean puedeComprar = monedas >= precioEspada;

        // PASO 4: ¿Está listo para luchar?
        boolean listoParaLuchar = vida > 0 && puedeComprar;

        // PASO 5: Muestra los resultados.
        System.out.println("Vida: " + vida);
        System.out.println("Monedas: " + monedas);
        System.out.println("Puede comprar: " + puedeComprar);
        System.out.println("Listo: " + listoParaLuchar);

        // Bonus: división entera y resto.
        System.out.println("7 / 2 = " + (7 / 2));
        System.out.println("7 % 2 = " + (7 % 2));
    }
}
