// Lección 4: Decisiones con if-else (ejemplo terminado)

public class Main {
    public static void main(String[] args) {
        String nombre = "Luna";
        int vida = 25;
        int monedas = 40;

        if (vida <= 0) {
            System.out.println("¡Game over!");
        } else if (vida < 30) {
            System.out.println("¡Cuidado, " + nombre + " tiene poca vida!");
        } else {
            System.out.println("¡" + nombre + " está en plena forma!");
        }

        if (monedas >= 30) {
            monedas = monedas - 30;
            vida = vida + 50;
            System.out.println("Compraste una poción. Vida: " + vida + ", monedas: " + monedas);
        } else {
            System.out.println("No tienes monedas suficientes");
        }
    }
}
